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
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=0" />
<title>Document</title>
<link rel="stylesheet" href="css/move_car.css" media="screen">
</head>
<body>
	<div id="register_two" class="clearfix">
		<div class="private_information">
			<span class="person_information">选择版本</span>
		</div>
		<div class="inner_box">
			<div class="inner_head">
				<div class="center_div">
					<label><input type="radio" value="1" name="sale">
						免费申请 </label> <label style="margin-left: 0.15rem"><input
						type="radio" value="1" name="sale"> 向程序员捐助 </label>
				</div>
			</div>
			<hr class="hr" />

			<div class="color_div"></div>

			<div class="contribute_us">

				<a href="#" class="contribute_link"> 为什么捐助我们? </a>
			</div>
		</div>
		<input type="button" class="sure_button" value="确认并查看二维码">
	</div>
	<script src="js/rem2.js"></script>
	<script src="js/move_car.js" type="text/javascript"></script>
</body>
</html>