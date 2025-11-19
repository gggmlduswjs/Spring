<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<form action="/day4/uploadex"  method="POST"  enctype="multipart/form-data" >
<input type="text" name="goodsName">
<input type="file" name="file"> 
<button>업로드</button>
</form>
</body>
</html>