<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>个人考勤</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/pintuer.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/admin.css">
<script src="${pageContext.request.contextPath }/js/jquery.js"></script>
<script src="${pageContext.request.contextPath }/js/pintuer.js"></script>
</head>
<body>
	<div class="panel admin-panel">
		<div class="panel-head">
			<strong class="icon-reorder">考勤信息</strong>
		</div>
		<table class="table table-hover text-center">
			<tr>
			    <th width="33%">序号</th>
				<th width="33%">时间</th>
				<th width="33%">考勤情况</th>
			</tr>
			<c:forEach var="kaos" items="${kaos}" varStatus="vs">
				<tr>
				    <td>${vs.count}</td>
					<td>${kaos.ttime}</td>
					<td>${kaos.tkcontebt}</td>
				</tr>
			</c:forEach>
			
			
		</table>
	</div>
</body>
</html>
