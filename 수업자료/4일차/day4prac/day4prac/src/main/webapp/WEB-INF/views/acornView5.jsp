<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script>
function deleteMember(){
	alert("dkdfkdf");
	
	//서버에 비동기로 삭제 요청  /jquery 라이브러리  ajax , fetch 
	
	let id="t01;"
	
	$.ajax( {
		
		 type:"DELETE" ,
		 url:"/prac4/acorns/"+id,    // /parac4/aconrs/t01
		 success: function( response){
			 console.log( response );
		 },
		 error: function(e){
			 console.log( e);
		 }
	}); 
	
}
</script>
</head>
<body>


<button  onclick="deleteMember()">삭제하기</button>
</body>
</html>