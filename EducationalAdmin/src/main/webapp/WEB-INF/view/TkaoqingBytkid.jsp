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
<title>根据id修改学生考勤</title>
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
			<strong><span class="icon-pencil-square-o"></span>修改老师考勤</strong>
		</div>
		<div class="body-content">
			<form method="post" class="form-x"  
				action="${pageContext.request.contextPath}/kaoqing/success/TkaoqingBytkid">
				<c:forEach var="kq" items="${kq}" varStatus="vs">
					 <span>序号:</span>
					<input name="tkid" class="form-control" type="text"
						 value="${kq.tkid}" readonly="readonly">
					<br> 
						<c:forEach var="kq1" items="${kq.teacher}" varStatus="vs">
							 <span>姓名:</span>
							<input class="form-control" type="text" id="tname" name="tname"
								value="${kq1.tname}" readonly="readonly">
							<br>
						
							<span>编号:</span>
							<input class="form-control" type="text" id="ton" name="ton"
								value="${kq1.ton}" readonly="readonly">
							<br>
							
							<span>性别:</span>
							<input class="form-control" type="text" id="tsex" name="tsex"
								value="${kq1.tsex}" readonly="readonly">
							<br> 
								
						</c:forEach>
							 <span>时间:</span>
							<input class="form-control" type="text" id="ttime" name="ttime"
									value="${kq.ttime}" >
							<br>
							<span>考情情况:</span>
							<input class="form-control" type="text" id="tkcontebt" name="tkcontebt"
									value="${kq.tkcontebt}" >		
							<br>
						
				
					<input type="submit" value="提交" class="btn btn-success">
					<input type="reset" value="重置" class="btn  btn-info"> 

				</c:forEach>
			</form>
		</div>
	</div>

</body>
</html>