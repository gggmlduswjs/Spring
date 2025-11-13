package com.acorn.web;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


/*
   
   스프링 초기 버전에서 Controller 만들기     
   한 번 만들고 보고 실행해 보는 경험만 갖는다 
   
   
   
   하 나의 Controller가 하나의 매서드만 가질 수 있다 
   
   
 */



// controller 가 하는 역할  ->모델과뷰를 책임진다 (모델과뷰 반환), 모델정보(데이터) , 뷰정보(뷰 이름)
public class FavoriteController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		 
		
		//모델뷰 객체를 생성한다.
		ModelAndView  mv = new ModelAndView();
		//view정보등록
		mv.setViewName("favoriteView");
		
		//model작성
		 ArrayList<String> list = new ArrayList<>();		 
		 list.add("전참시");	
		 list.add("나혼산");
 
		 
		 //model정보 등록
		 mv.addObject("list", list);
		
		return mv;
	}

}
/*


 
동작순서 !!


1. 클라이언트가 /favorite URL로 GET 요청을 보낸다
2. DispatcherServlet:  ( 이제 서블릿은 한 개  !!!!  - 직접만들지 않는다 )

   - DispatcherServlet이 요청을 수신하고, URL 매핑에 따라  컨트롤러를 찾는다
   - Controller의 약속된 매서드 호출 ( handleRequest() )  

3. 해당 컨트롤러의  FavoriteController의 handleRequest() 메서드가 호출됩니다.
이 메서드는 ModelAndView 객체를 생성하고, 뷰 이름과 모델 데이터를 설정한 후 반환합니다.


4. 
뷰 렌더링:  
    	<beans:property name="prefix" value="/WEB-INF/views/" />
		<beans:property name="suffix" value=".jsp" />

 ( 파일이름앞에 /WEB-INF/views/ 와 .jsp   앞뒤에 붙여준다) 

반환된 ModelAndView 객체를 바탕으로, InternalResourceViewResolver가 지정된 뷰(JSP 파일)를 찾아 렌더링합니다.


JSP 파일에서 모델 데이터를 사용하여 최종 HTML을 생성하고 클라이언트에게 응답한다
5. JSP 파일


*/