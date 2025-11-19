<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
function getDataList(){
	 alert("djkfdkfkf");
	 
	 // server => data request 
	 // $.ajax( {});
	 
	 
	 $.ajax( {
		 type:"GET",
		 url:"/prac4/acorns",
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
	
	//배열매서드 
  
 /*
	let str="<ul>";
	for( let i=0; i<  response.length ; i++){
		let item   =response[i];  //acorn json 객체 
		console.log( item );		
		str += "<li>"  + item.name +  item.addr +   "</li>";
		
	}
	
	str +="</ul>"	
	$("#result").html(str);	
 
	*/
	
	
    // jsp의 EL   ${}    ,  javascript 백틱에서의 보간법 문법 ${} , jsp가 먼저 실행, 실행의 결과가 없으므로 비어 있는값으로 반환
	let str = "<ul>";
	response.forEach(item => {
	    str += `<li>  ${  "${item.name}" } ${item.addr} </li>`;
	});
	str += "</ul>";

	$("#result").html(str);
	 
	
	  

 
}


</script>
</head>
<body>


<h2> acorn list  </h2>

<button  onclick="getDataList()"> get acorn list</button>

<div id="result">  result </div>

</body>
</html>