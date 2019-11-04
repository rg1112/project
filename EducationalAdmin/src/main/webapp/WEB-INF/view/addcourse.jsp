<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title>根据sid添加学生课程</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/bootstrap-3.3.7-dist/css/bootstrap.css/">
<script src="${pageContext.request.contextPath}/js/jquery.min.js"
	type="text/javascript" charset="utf-8"></script>
<script
	src="${pageContext.request.contextPath}/css/bootstrap-3.3.7-dist/js/bootstrap.min.js"
	type="text/javascript" charset="utf-8"></script>
</head>
<body>

	<div class="panel admin-panel">
		<div class="panel-head" id="add">
			<strong><span class="icon-pencil-square-o"></span>添加学生课程</strong>
		</div>
		<div class="body-content">
			<form method="post" class="form-x"
				action="${pageContext.request.contextPath}/kaoqing/addcourse/success">
				<c:forEach var="course" items="${course}" varStatus="vs">

					<span>序号:</span>
					<input name="sid" class="form-control" type="text"
						value="${course.sid}" readonly="readonly">
					<br>

					<span>姓名:</span>
					<input class="form-control" type="text" id="sname" name="sname"
						value="${course.sname}" readonly="readonly">
					<br>

					<span>学生编号:</span>
					<input class="form-control" type="text" id="sno" name="sno"
						value="${course.sno}" readonly="readonly">
					<br>

					<span>性别:</span>
					<input class="form-control" type="text" id="sex" name="sex"
						value="${course.sex}" readonly="readonly">
					<br>

				
					<div class="form-group">

						<span>所选修课程:</span>
						<div class="label">
							<label>教授课程：</label>
						</div>
						<div class="field">
							<select name=cid class="input w50">
								<option value="0">无</option>
								<option value="1">计算机网络</option>
								<option value="2">数据库</option>
								<option value="3">JAVA</option>
								<option value="4">C语言</option>
								<option value="5">概率论与统计</option>
							</select>
							<div class="tips"></div>
						</div>
					</div>




					<input type="submit" value="提交" class="btn btn-success">
					<input type="reset" value="重置" class="btn  btn-info">

				</c:forEach>
			</form>
		</div>
	</div>

</body>
</html>