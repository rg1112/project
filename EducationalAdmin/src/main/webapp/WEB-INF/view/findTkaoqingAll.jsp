<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>教师考勤</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/bootstrap-3.3.7-dist/css/bootstrap.css" />
<script src="${pageContext.request.contextPath }/js/jquery.js"
	type="text/javascript" charset="utf-8"></script>
<script
	src="${pageContext.request.contextPath }/css/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
</head>
<body>
	<div class="container">
		 
		<table class="table table-bordered table-striped table-hover">
			<tr>
				<th>序号</th>
				<th>姓名</th>
				<th>编号</th>
				<th>性别</th>
				<th>时间</th>
				<th>考勤情况</th>
				<th>操作</th> 
				
			</tr>
			<%-- 	<c:forEach>	基础迭代标签，接受多种集合类型
					varStatus:count：当前这次迭代从 1 开始的迭代计数
				    items:items属性用于指定将要迭代的对象  --%>
			<c:forEach var="tkao" items="${tkao}" varStatus="vs">
				<tr>
					<td>${vs.count}</td>				
						<c:forEach var="tkao1" items="${tkao.teacher}" >
							<td>${tkao1.tname}</td>
							<td>${tkao1.ton}</td>
							<td>${tkao1.tsex}</td>				
						</c:forEach>
					<td>${tkao.ttime}</td> 
					<%-- <td><fmt:formatDate value="${tkao.ttime}" type="date"/></td> --%>
					<td>${tkao.tkcontebt}</td>
					<td><a class="btn btn-info" href="${pageContext.request.contextPath }/kaoqing/select/TkaoqingBytkid?tkid=${tkao.tkid}">修改教师考勤</a>
						 <a class="btn btn-info" href="${pageContext.request.contextPath }/kaoqing/select/TkaoqingBytid?tid=${tkao.tid}">添加教师考勤</a>
						 <a class="btn btn-info" href="${pageContext.request.contextPath }/kaoqing/delete/TkaoqingBytkid?tkid=${tkao.tkid}">删除教师考勤</a> </td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>