<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>THCar</h1>
	<br/>
	<a href="hello">hello</a>
	<br/>
	<a href="home">home</a>
	<br/>
	<a href="touchStep1">touch1</a>
	<br/>
	<a href="touchStep2">touch2</a>
	<br/>
	<a href="register1">registerStep1</a>
	<br/>
	<a href="identity/017S008P">getCarInfo</a>
	<br/>
</body>
</html>