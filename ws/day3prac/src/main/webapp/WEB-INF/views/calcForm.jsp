<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- /day -->
	<form action="<%=request.getContextPath() %>/calcinput" method="post">
		숫자 1: <input type="number" name="num1" required><br> 
		숫자 2: <input type="number" name="num2" required><br>
		<button type="submit" name="operator" value="add">+</button>
		<button type="submit" name="operator" value="sub">-</button>
		<button type="submit" name="operator" value="mul">*</button>
		<button type="submit" name="operator" value="div">/</button>
	</form>

</body>
</html>