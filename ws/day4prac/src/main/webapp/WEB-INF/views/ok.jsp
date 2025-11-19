<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>이미지 보여주기</h2>

<!--  /prac4/images/a.png -->
<img src="<%=request.getContextPath()%>/images3/${imgName}" >

</body>
</html>