<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../include/header.jsp" %>
<style>
	iframe{
		width:400ps;
		height:200px;
		border:1px;
		border-style:solid;	
	}
</style>
</head>
<body>
<%@ include file="../include/filemenu.jsp" %>
<Form method="post" id="form1" action="${path}/upload/uploadForm" enctype="multipart/form-data" target="iframe1">
<input type="file" name="file">
<input type="submit" value="업로드">
</Form>
<!-- target을 주지 않으면 페이지가 넘어가므로 target을 주어 iframe에 표시함 -->
<iframe name="iframe1">
</iframe>
</body>
</html>