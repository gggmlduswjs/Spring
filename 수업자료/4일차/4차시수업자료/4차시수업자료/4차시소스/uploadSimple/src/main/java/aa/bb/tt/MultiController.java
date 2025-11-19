package aa.bb.tt;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class MultiController {
	
	 private String fileDir ="c:\\test\\upload\\";  // 미리 폴더를 만들어야함
	 
	 
	 @GetMapping("/uploadMulti")
	 public String uploadForm() {
		 return "formMulti";
	 }

	 
	
	@PostMapping("/uploadMulti")
	public String upload( String  goodsCode   , MultipartFile[] files , Model model) throws IllegalStateException, IOException {
	    	System.out.println( goodsCode);
		 
	    	String[] fileNames=new  String[ files.length];
	        if ( files != null)  {  // 빈파일이 아닌경우 (업로드한 파일이 있다면)
	         
	        	
	        	for(int i=0 ; i< files.length ; i++) {
	        		MultipartFile file = files[i];
		         	String fileRealName  = file.getOriginalFilename(); 	     // 원본파일이름       
		        	String fullPath = fileDir + fileRealName;                // 전체 경로명 포함한 파일명
		        	file.transferTo(new File(fullPath));                     // upload  (업로드한 파일이 서버에 생성됨)     
		            
		          
		            fileNames[i]= file.getOriginalFilename();
	        	}
	        	
	        	  model.addAttribute("files" ,fileNames);
	        }

		return "upload-ok2";
		
		
	}
	
	/*
	  
 
     
 
	@PostMapping("/uploadMulti")
	public String upload( String  goodsCode   , List<MultipartFile> files , Model model) throws IllegalStateException, IOException {
	    	System.out.println( goodsCode);
		 
	     
	    	 String[] fileNames=new  String[ files.size()];
	        if ( files != null)  {  // 빈파일이 아닌경우 (업로드한 파일이 있다면)
	         
	        	
	        	for(int i=0 ; i< files.size() ; i++) {
	        		MultipartFile file = files.get(i);
		         	String fileRealName  = file.getOriginalFilename(); 	     // 원본파일이름       
		        	String fullPath = fileDir + fileRealName;                // 전체 경로명 포함한 파일명
		         	file.transferTo(new File(fullPath));                     // upload  (업로드한 파일이 서버에 생성됨)  
		            
		          
		            fileNames[i]= file.getOriginalFilename();
	        	}
	        	
	        	  model.addAttribute("files" ,fileNames);
	        }

		return "upload-ok2";
		
		
	}
	  
	 */
 
	 
 
	
	// 이미지 리소스  응답하기
	@ResponseBody	
	@RequestMapping( value="/imagesMulti/{fileName:.*}" , method=RequestMethod.GET)
	public Resource image(@PathVariable String  fileName) throws MalformedURLException {		
		System.out.println( "fileName" + fileName);
		return  new  UrlResource("file:c:\\test\\upload\\"+ fileName);
		//서버의 리소스(자원)을 제공할 때 사용
	}	
}
	