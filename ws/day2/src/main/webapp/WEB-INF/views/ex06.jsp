<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>약수 계산기</h2>

<c:if test="${not empty divisors}">
  <h3>${num}의 약수 목록</h3>
  <ul>
    <c:forEach var="d" items="${divisors}">
      <li>${d}</li>
    </c:forEach>
  </ul>
</c:if>


</body>
</html>