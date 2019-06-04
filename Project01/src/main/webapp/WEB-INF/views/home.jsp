<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<%@ include file="include/header.jsp"%>
</head>
<body>
	<%@ include file="include/menu.jsp"%>
	<hr>
	<h1 align="center">게시판</h1>
	<a href="${path}/member/list.do">연락처 목록</a>
</body>
</html>
