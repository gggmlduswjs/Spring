<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
function getData(){
	 alert("djkfdkfkf");
	 
	 // server => data request 
	 // $.ajax( {});
	 
	 let id="t01";
	 
	 $.ajax( {
		 type:"GET",
		 url:"/prac4/acorns/"+id,          ///prac4/acorns/t01  
		 success: function( response ){
			 console.log(response);
			 ///
			 renderData(response);
			 
		 },
		 error: function( e ){
			 console.log( e);
		 }
		 
	 });
	 
}


function renderData( response){
	console.log( response );
	
	 
 
 
}


</script>
</head>
<body>


<h2> acorn list  </h2>

<button  onclick="getData()"> get acorn list</button>

<div id="result">  result </div>

</body>
</html>