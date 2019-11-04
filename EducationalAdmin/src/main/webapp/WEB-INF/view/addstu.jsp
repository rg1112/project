<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加学生信息页面</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/bootstrap-3.3.7-dist/css/bootstrap.css/">
<script src="${pageContext.request.contextPath}/js/jquery.min.js"
	type="text/javascript" charset="utf-8"></script>
<script
	src="${pageContext.request.contextPath}/css/bootstrap-3.3.7-dist/js/bootstrap.min.js"
	type="text/javascript" charset="utf-8"></script>

<link rel="stylesheet" href="${pageContext.request.contextPath}/css/pintuer.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css">
<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/js/pintuer.js"></script>
</head>
<body>

<div class="container ">
<h1 class="text-center">添加页面</h1>
<form action="${pageContext.request.contextPath}/kaoqing/success/addstu1" method="post" >

<span>姓名:</span><input class="form-control" type="text" id="sname" name="sname" value=""><br>
<span>学生编号:</span><input class="form-control" type="text" id="sno" name="sno" value=""><br>
<span>性别:</span><input class="form-control" type="text" id="sex"  name="sex" value=""><br>
 <!-- <span>所在班级信息:</span><input class="form-control" type="text" id="bid"  name="bid" value=""><br> -->
<span>所选课程信息:</span><input class="form-control" type="text" id="cid"  name="cid" value=""><br> 
<span>所在班级信息:</span>
 <div class="form-group">
		  <div class="field">
		    <select name="bid" class="input w50">
		      <option value="1">计算机1班</option>
		      <option value="2">计算机2班</option>
		    </select>
		    <div class="tips"></div>
		  </div>
		</div>
		<br><br><br><br>
<input type="submit" value="添加" class="btn btn-success" >
<input type="reset" value="重置" class="btn  btn-info">

</form>
</div>

</body>
</html>