<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../include/header.jsp" %>
</head>
<body>
<%@ include file="../include/menu.jsp" %>
<h2>연락처 목록</h2>
<input type="button" value="신규 등록" onclick="location.href='${path}/member/write.do'">
	<table border="1" width="700px">
		<tr>
			<td>이름</td>
			<td>전화번호</td>
			<td>주소</td>
		</tr>
		<c:forEach var="row" items="${list}">
		<tr>
			<td>${row.name}</td>
			<td>${row.tel}</td>
			<td>${row.adress}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>