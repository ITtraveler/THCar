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
<link rel="stylesheet" href="<%=basePath%>resource/css/move_car.css" media="screen">
</head>
<body>
	<div id="register_one" class="clearfix">
		<div class="private_information">
			<span class="person_information">个人信息</span>
		</div>
		<div class="input_box">
			<span class="input_span">姓名:</span> <input type="input"
				placeholder="请填写您的姓名" class="input">
		</div>
		<div class="input_box">
			<span class="input_span">手机号:</span> <input type="input"
				placeholder="请输入您的手机号" class="input">
		</div>
		<div class="input_box">
			<span class="input_span">验证码:</span> <input type="input"
				placeholder="请输入短信验证码" class="input"> <input type="button"
				class="validate" value="发送验证码">
		</div>
		<span class="car_information">车辆信息</span>
		<div class="information_box">
			<span>车牌号</span> <select>
				<option value="">闽</option>
			</select> <select>
				<option value="">A</option>
			</select>
		</div>
	</div>
	<script type="javascript/text" src="<%=basePath%>resource/js/rem2.js"></script>
	<script type="javascript/text" src="<%=basePath%>resource/js/move_car.js" ></script>
</body>
</html>