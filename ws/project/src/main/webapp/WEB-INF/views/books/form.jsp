<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/books" 
      method="post" 
      enctype="multipart/form-data">

    제목: <input type="text" name="title"><br>
    저자: <input type="text" name="author"><br>
    가격: <input type="number" name="price"><br>

    표지 이미지: <input type="file" name="coverFile"><br>

    <button type="submit">등록</button>
</form>

</body>
</html>