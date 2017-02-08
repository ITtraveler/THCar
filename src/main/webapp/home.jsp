<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=0" />
<title>Document</title>
<link rel="stylesheet" href="<%=basePath%>resource/css/move_car.css"
	media="screen">
</head>
<body>
	<div id="homepage_car" class="clearfix">
		<header class="header">
		<h1 style="margin-top: 0.65rem">树洞挪车</h1>
		<h1>永久免费的挪车助手</h1>
		<a href="register1"><input type="button" class="button"
			value="立即申请"> </a></header>
	</div>
	<script type="text/javascript" src="<%=basePath%>resource/js/rem2.js"></script>
	<script type="text/javascript"
		src="<%=basePath%>resource/js/move_car.js"></script>
</body>
</html>
