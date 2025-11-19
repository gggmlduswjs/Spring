package com.acorn.project.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.acorn.project.domain.Book;
import com.acorn.project.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService service;

    // 1) 목록
    @GetMapping
    public String list(Model model) {
        model.addAttribute("books", service.getBooks());
        return "books/list";
    }

    // 2) 등록 폼
    @GetMapping("/new")
    public String form() {
        return "books/form";
    }

    // 3) 등록 처리 (파일 업로드 포함)
 // 6) 파일 업로드
    @PostMapping
    public String create(@RequestParam("title") String title,
                         @RequestParam("author") String author,
                         @RequestParam("price") int price,
                         @RequestParam("coverFile") MultipartFile coverFile)
                         throws Exception {

        String fileName = null;

        if (!coverFile.isEmpty()) {

            // 원본 파일명 UTF-8로 강제 변환 (한글 깨짐 방지)
            String original = new String(
                    coverFile.getOriginalFilename().getBytes("ISO-8859-1"), 
                    "UTF-8"
            );

            // 저장 파일명
            fileName = System.currentTimeMillis() + "_" + original;

            // 저장 경로 (반드시 폴더 미리 존재해야 함)
            String uploadDir = "C:/test/upload/";

            File dir = new File(uploadDir);
            if (!dir.exists()) dir.mkdirs();

            File saveFile = new File(uploadDir + fileName);

            // 실제 파일 저장
            coverFile.transferTo(saveFile);
        }

        // Book 객체 생성
        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        book.setPrice(price);
        book.setCover(fileName);   // DB에는 파일명만 저장

        service.addBook(book);

        return "redirect:/books";
    }

    // 4) 수정 폼
    @GetMapping("/{id}/edit")
    public String editForm(@PathVariable int id, Model model) {
        model.addAttribute("book", service.getBook(id));
        return "books/edit";
    }

 // 5) 수정 처리
    @PostMapping("/{id}")
    public String update(@PathVariable int id,
                         @RequestParam("title") String title,
                         @RequestParam("author") String author,
                         @RequestParam("price") int price,
                         @RequestParam(value = "coverFile", required = false) MultipartFile coverFile)
                         throws Exception {

        // 기존 데이터 가져오기
        Book oldBook = service.getBook(id);

        String fileName = oldBook.getCover();  // 기본적으로 기존 파일 유지

        // 새 파일 업로드 시
        if (coverFile != null && !coverFile.isEmpty()) {

            // 한글 깨짐 방지
            String original = new String(
                    coverFile.getOriginalFilename().getBytes("ISO-8859-1"),
                    "UTF-8"
            );

            fileName = System.currentTimeMillis() + "_" + original;

            String uploadDir = "C:/test/upload/";

            File dir = new File(uploadDir);
            if (!dir.exists()) dir.mkdirs();

            File saveFile = new File(uploadDir + fileName);

            coverFile.transferTo(saveFile);

            // ⚠ 기존 파일 삭제는 선택이지만 지금은 남겨두기
            // if (oldBook.getCover() != null) new File(uploadDir + oldBook.getCover()).delete();
        }

        Book book = new Book();
        book.setId(id);
        book.setTitle(title);
        book.setAuthor(author);
        book.setPrice(price);
        book.setCover(fileName);    // 새 파일 or 기존 파일명

        service.updateBook(book);

        return "redirect:/books";
    }


 // 6) 삭제 (이미지 파일 삭제 포함)
    @PostMapping("/{id}/delete")
    public String delete(@PathVariable int id) {

        // 1) 기존 정보 조회
        Book book = service.getBook(id);

        // 2) 이미지 파일 삭제
        if (book.getCover() != null) {
            String uploadDir = "C:/test/upload/";
            File file = new File(uploadDir + book.getCover());
            if (file.exists()) {
                file.delete();
            }
        }

        // 3) DB 삭제
        service.deleteBook(id);

        return "redirect:/books";
    }

}
