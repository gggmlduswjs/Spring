<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<script>
function updateMember(){
	alert("dkfdkfdkdkf");
	
	// 특정id의 에이콘 멤버의 정보를 변경하기
	
	let id="t02";
	let newAcorn ={ name :   "우주연"  ,  addr: "서울시 강남구 "};   // 네트워크상태로 전송할 떄   문자열기반 전송해야 함 
	let jsonString =  JSON.stringify(newAcorn );
	
	console.log( newAcorn);
	console.log( jsonString);
	
	
	
	$.ajax( {
		
		type:"PUT",
		url:"/prac4/acorns/"+id,       //   /prac4/acors/t02
		data: jsonString , 
		contentType: "application/json",
		success : function( response ){
			console.log( response);
		},
		error: function( e){
			console.log( e);
		}
		
	});
	
	
	                                                           
	
	
	
	
	
}
</script>
</head>
<body>

<button  onclick="updateMember()">변경하기</button>

</body>
</html>