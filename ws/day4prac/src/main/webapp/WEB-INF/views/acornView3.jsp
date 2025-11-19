<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
function insertData(){
	 alert("djkfdkfkf"); 
	 
	 let sendDataJSon={ name: "조용필" ,  addr: "서울시 마포구 "};
	 let  jsonString =  JSON.stringify(sendDataJSon);
	 
	 console.log(jsonString) ;
	 
	 $.ajax(  {
		 
		 type:"POST",
		 url:"/prac4/acorns",
		 data :jsonString ,
		 contentType: "application/json",
		 success: function( response ){
			 console.log( response);
		 },
		 error: function( e  ){
			 console.log( e);
		 }  
	 }); 
}
 

</script>
</head>
<body>


<h2> acorn 등록하기 </h2>
<button  onclick="insertData()"> 등록하기 화면전환없이</button> 

</body>
</html>