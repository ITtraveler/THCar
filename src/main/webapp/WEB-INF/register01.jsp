<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="head.jsp"></jsp:include>
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

	<div id="register_one" class="clearfix">
		<form action="register1" method="post" accept-charset="UTF-8">
			<div class="private_information">
				<span class="person_information">个人信息</span>
			</div>
			<div class="input_box">
				<span class="input_span">姓名:</span> <input name="name" type="input"
					placeholder="请填写您的姓名" class="input">
			</div>
			<div class="input_box">
				<span class="input_span">手机号:</span> <input name="telephone"
					type="input" placeholder="请输入您的手机号" class="input"
					onkeyup="this.value=this.value.replace(/\D/g,'')">
			</div>
			<div class="input_box">
				<span class="input_span">验证码:</span> <input type="input"
					placeholder="请输入短信验证码" class="input"
					onkeyup="this.value=this.value.replace(/\D/g,'')"> <input
					type="button" class="validate" value="发送验证码">
			</div>
			<span class="car_information">车辆信息</span>
			<div class="information_box">
				<span>车牌号</span><select name="prefixRegion">
					<%-- 	<%
						String s = "京津翼晋蒙辽吉黑泸苏浙皖闽赣鲁豫鄂湘粤桂琼川贵云渝藏陕甘青宁新";
						for (int i = 0; i < s.length(); i++) {
					%>
					<option value="<%=s.charAt(i)%>"><%=s.charAt(i)%></option>
					<%
						}
					%> --%>
					<c:forTokens
						items="京,津,翼,晋,蒙,辽,吉,黑,泸,苏,浙,皖,闽,赣,鲁,豫,鄂,湘,粤,桂,琼,川,贵,云,渝,藏,陕,甘,青,宁,新"
						delims="," var="value">
						<option value="${value}">${value}</option>

					</c:forTokens>
				</select> <select name="prefixLetter">
					<%
						for (int i = 65; i <= 90; i++) {
					%>
					<option value="<%=(char) i%>"><%=(char) i%></option>
					<%
						}
					%>
				</select> <input name="suffixNum" onkeyup="value=value.replace(/[^\w]/g,'')"
					type="text" placeholder="请输入车牌尾号" />
			</div>
			<input type="submit" value="下一步" />
		</form>
	</div>
	<script src="<%=basePath%>resource/js/rem2.js"></script>
	<script src="<%=basePath%>resource/js/move_car.js"
		type="javascript/text"></script>
</body>
</html>
