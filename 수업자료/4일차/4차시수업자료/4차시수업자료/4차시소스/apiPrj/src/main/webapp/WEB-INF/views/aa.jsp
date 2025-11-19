<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<script>

//$(document).ready( function(){});
$(document).ready( function(){
	
  // alert("skdfdfd");
  // $("#btn").click( function(){ alert("click");});

  $("#btn").click( function(){  
	  
	  
	  alert("클릭 되었어") ;
	  let id  = $("#id").val();
	  let name =  $("#name").val();
	  
	  let data  = { "id": id  , "name": name};
	  
	  console.log( data);
	  
	  
	  $.ajax( {	  
		  type: "post",
		  url: "/api/pracreg/test",
		  data:  JSON.stringify(data),
		   contentType: "application/json",
		  success: function(data){  alert( data);},
		  error: function(err){ console.log( err);}
		  
		 
	  });  
  
  });
   
  
	
});
 
</script>
아이디:<input type="text" id="id">
이름:<input type="text" id="name">
<button id="btn">등록</button>
</body>
</html>