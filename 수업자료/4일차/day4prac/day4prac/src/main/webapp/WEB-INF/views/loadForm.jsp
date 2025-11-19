<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h2>업로드하기</h2>


<form action="/prac4/upload2"   enctype="multipart/form-data"   method="post">
<input type="text" name="goodsName">
<input type="file" name="file">
<button>업로드/제출</button>
</form>
</body>
</html>