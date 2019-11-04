<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>学生成绩</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/pintuer.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/admin.css">
<script src="${pageContext.request.contextPath }/js/jquery.js"></script>
<script src="${pageContext.request.contextPath }/js/pintuer.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
</head>

<body>
	<div class="panel admin-panel">
		<div class="panel-head">
			<strong class="icon-reorder">成绩信息</strong>
		</div>
		<table class="table table-hover text-center">
			<tr>
				<th width="5%">序号</th>
				<th width="7%">姓名</th>
				<th width="7%">学号</th>
				<th width="5%">性别</th>
				<th width="10%">计算机网络</th>
				<th width="10%">数据库</th>
				<th width="8%">JAVA</th>
				<th width="8%">C语言</th>
				<th width="10%">概率论与统计</th>
				
			</tr>
			<c:forEach var="g" items="${grade}" varStatus="vs">
				<tr>
					<td>${vs.count}</td>
					<td>${g.sname}</td>
					<td>${g.sno}</td>
					<td>${g.sex}</td>
					<c:forEach var="g1" items="${g.grade}">
						<td>${g1.grade}</td>
					</c:forEach>
			</c:forEach>
			</tr>
		</table>
	</div>
</body>
</html>
