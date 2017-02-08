<%@page import="org.springframework.web.context.request.RequestScope"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=0" />
<title>车主留言</title>
<link rel="stylesheet" href="<%=basePath%>resource/css/move_car.css"
	media="screen">
</head>
<body>

	<div id="second_step" class="clearfix">

		<div class="leave_message">

			<span class="title">车主留言</span>
		</div>

		<div class="message_box">
		<c:set var="message" scope="session" value="${requestScope.carInfo.message}"/>
			<c:if test="${message.isEmpty()}">
				<span class="message_span">给您造成不便敬请谅解！点击通知，我会火速赶来。</span>
			</c:if>
			<c:if test="${!message.isEmpty()}">
				<span class="message_span">${message}</span>
			</c:if>
		<%-- 	<%
				String message = (String) request.getAttribute("message");
				if (message.isEmpty()) {
			%>
			<span class="message_span">给您造成不便敬请谅解！点击通知，我会火速赶来。</span>
			<%
				} else{
			%>
			<span class="message_span"> ${requestScope.carInfo.message} </span>
			<%} %> --%>
		</div>

		<span class="phone_number">请输入您的手机号，以便联系您和车主</span>

		<div class="input_box" style="border-top: 1px solid #e5e5e5;">

			<span class="input_span">手机号:</span> <input id="telephone"
				type="input" placeholder="请输入您的手机号" class="input">
		</div>
		<div class="input_box">
			<span class="input_span">验证码:</span> <input type="input"
				placeholder="请输入短信验证码" class="input"> <input type="button"
				class="validate" value="发送验证码">
		</div>
		<input type="button" class="next_button" value="下一步">
	</div>
	<script src="<%=basePath%>resource/js/rem2.js"></script>
	<script src="<%=basePath%>resource/js/move_car.js"
		type="javascript/text"></script>
</body>
</html>