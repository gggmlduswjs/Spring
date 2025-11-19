<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>📚 책 목록</h2>

<a href="${pageContext.request.contextPath}/books/new">책 등록하기</a>

<table border="1">
    <tr>
        <th>ID</th>
        <th>제목</th>
        <th>저자</th>
        <th>가격</th>
        <th>표지</th>
        <th>관리</th>
    </tr>

    <c:forEach var="b" items="${books}">
        <tr>
            <td>${b.id}</td>
            <td>${b.title}</td>
            <td>${b.author}</td>
            <td>${b.price}</td>
            <td>
                <img src="${pageContext.request.contextPath}/upload/${b.cover}" width="70">
            </td>
            <td>
                <a href="${pageContext.request.contextPath}/books/${b.id}/edit">수정</a>
            </td>
            <td>
                <form action="${pageContext.request.contextPath}/books/${b.id}/delete"
				      method="post"
				      style="display:inline;">
				    <button type="submit">삭제</button>
				</form>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
