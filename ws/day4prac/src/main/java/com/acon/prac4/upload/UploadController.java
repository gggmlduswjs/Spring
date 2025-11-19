package com.acon.prac4.upload;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {

	String fileDir="c:\\test\\upload2\\";

	//화면보여주기 
	
	
	@RequestMapping( value="/uploadForm2" , method= RequestMethod.GET)
	public String  uploadForm() {
		return "loadForm"; 
	}
	
		
	
	//업로드하기 
	@RequestMapping( value="/upload2" , method= RequestMethod.POST   )
	public String  upload(  
			@RequestParam   String  goodsName  , 
			@RequestParam   MultipartFile  file ,
			Model model
			) throws IllegalStateException, IOException {
		
		
		String originName  = file.getOriginalFilename();		
		System.out.println( originName );
		
		//
		
		String  fullPath  = fileDir +originName;    //특정디렉토리 아래에  a.png 으로 저장하기
		
		file.transferTo( new File(fullPath)); 
		
		//ok view에서 이미지가 볼 수 잇도록 하기 !! 
		
		model.addAttribute("imgName", originName);		 //a.png
		return "ok";    
		
	} 
	
	
	//이미지보여주기    // images/a.png    =>      fileNanme = a.png 

	//업로드된 이미지 보여기주기	
	@ResponseBody
	@RequestMapping( value="/images3/{fileName:.*}" , method=RequestMethod.GET)
	public  Resource  image(   @PathVariable String  fileName ) throws MalformedURLException {		 
		System.out.println(  fileName);		
		return new UrlResource("file:c:\\test\\upload2\\"+ fileName);  // 서버의 자원을 반환할 때 사용( 이미지, 파일)
		
	}
}
