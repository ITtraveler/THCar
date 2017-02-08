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
	<div id="myCode" class="clearfix">
		<div class="private_information">
			<span class="person_information">我的二维码</span>
		</div>

		<div class="code_box">
			<div class="img_box"></div>
		</div>

		<div class="private_information">
			<span class="person_information">我可以</span>
		</div>

		<div class="input_box">
			<span class="input_span">发送至邮箱:</span> <input type="input"
				placeholder="请输入短信验证码" class="input"> <input type="button"
				class="validate" value="立即发送">
		</div>

		<div class="input_box">
			<span class="input_span">保存至手机:</span> <input type="button"
				class="validate" value="立即保存">
		</div>
		<div class="input_box">
			<span class="input_span">查看挪车记录:</span> <input type="button"
				class="validate" value="关注公众号">
		</div>

		<input class="invite_button" type="button" value="邀请好友，获20元现金红包">
	</div>

	<script src="js/rem2.js"></script>
	<script src="js/move_car.js" type="text/javascript"></script>
</body>
</html>