package com.acorn.project.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acorn.project.domain.Book;
import com.acorn.project.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository repo;

    public List<Book> getBooks() {
        return repo.findAll();
    }

    public void addBook(Book book) {
        repo.save(book);
    }

    public Book getBook(int id) {
        return repo.findById(id);
    }

    public void updateBook(Book book) {
        repo.update(book);
    }

    public void deleteBook(int id) {
        repo.delete(id);
    }
}
