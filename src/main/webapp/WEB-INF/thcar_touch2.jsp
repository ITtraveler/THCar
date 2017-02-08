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
<link rel="stylesheet" href="<%=basePath%>resource/css/move_car.css" media="screen">
</head>
<body>

	<div id="three_step" class="clearfix">

		<div class="top_side">

			<span class="side_title_span">车主联系方式</span> <span class="status_span">未公开</span>
		</div>

		<div class="bottom_side">

			<span class="side_title_span">拨打车主电话</span> <input type="button"
				value="立即拨打" class="call_button"> <span class="infor_span">请注意接听来自：0591-87884731的电话</span>
		</div>
	</div>
	<script src="<%=basePath%>resource/js/rem2.js"></script>
	<script src="<%=basePath%>resource/js/move_car.js" type="javascript/text"></script>
</body>
</html>