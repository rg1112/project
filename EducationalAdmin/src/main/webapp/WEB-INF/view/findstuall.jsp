<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>学生信息</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/bootstrap-3.3.7-dist/css/bootstrap.css" />
<script src="${pageContext.request.contextPath }/js/jquery.js"
	type="text/javascript" charset="utf-8"></script>
<script
	src="${pageContext.request.contextPath }/css/bootstrap-3.3.7-dist/js/bootstrap.js"></script>
</head>
<body>
	<div class="container">
		 <a class="btn btn-info" href="${pageContext.request.contextPath }/kaoqing/add/addstu">添加学生信息</a> 
		<table class="table table-bordered table-striped table-hover">
			<tr>	<th>sjk序号</th>
				<th>序号</th>
				<th>姓名</th>
				<th>学生编号</th>
				<th>性别</th>
				 <th>所在班级信息</th>			
				<th>所选课程信息</th>
				<th>操作</th>		
			</tr>
			<%-- 	<c:forEach>	基础迭代标签，接受多种集合类型
					varStatus:count：当前这次迭代从 1 开始的迭代计数
				    items:items属性用于指定将要迭代的对象  --%>
			<c:forEach var="stu" items="${stu}" varStatus="vs">
				<tr>
				<td>${stu.sid}</td>
					<td>${vs.count}</td>
					<td>${stu.sname}</td>	
					<td>${stu.sno}</td>		
					<td>${stu.sex}</td>	
				    <td>${stu.banji.bname}</td>
					<%-- <td>${stu.course.cname}</td> --%>
					<td>
						<c:forEach var="cs" items="${stu.course}" >
							${cs.cname}					
						</c:forEach>
						</td>	
					<td><a class="btn btn-info" href="${pageContext.request.contextPath }/kaoqing/delect/stu?sid=${stu.sid}">删除学生信息</a>
					    <a class="btn btn-info" href="${pageContext.request.contextPath }/kaoqing/add/course?sid=${stu.sid}">添加课程信息</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>