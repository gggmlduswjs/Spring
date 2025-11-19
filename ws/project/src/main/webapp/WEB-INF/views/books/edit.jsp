<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책 수정</title>
</head>
<body>

<h2>📘 책 수정</h2>

<form action="${pageContext.request.contextPath}/books/${book.id}" method="post" enctype="multipart/form-data">

    ID: ${book.id}<br><br>

    제목: <input type="text" name="title" value="${book.title}"><br><br>

    작가: <input type="text" name="author" value="${book.author}"><br><br>

    가격: <input type="number" name="price" value="${book.price}"><br><br>

    기존 이미지: <br>
    <img src="${pageContext.request.contextPath}/upload/${book.cover}" width="100"><br><br>

    새 이미지 업로드:
    <input type="file" name="coverFile"><br><br>

    <button type="submit">수정하기</button>
</form>



</body>
</html>
