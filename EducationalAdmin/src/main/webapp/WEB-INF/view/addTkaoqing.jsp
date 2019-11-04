<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>添加教师考勤页面</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/bootstrap-3.3.7-dist/css/bootstrap.css/">
<script src="${pageContext.request.contextPath}/js/jquery.min.js"
	type="text/javascript" charset="utf-8"></script>
<script
	src="${pageContext.request.contextPath}/css/bootstrap-3.3.7-dist/js/bootstrap.min.js"
	type="text/javascript" charset="utf-8"></script>
</head>
<body>

<div class="container ">
<h1 class="text-center">添加页面</h1>
<form action="${pageContext.request.contextPath}/kaoqing/success/addTkaoqing" method="post" onsubmit="check()" >

<span>姓名:</span><input class="form-control" type="text" id="tname" name="tname" value=""><br>
<span>编号:</span><input class="form-control" type="text" id="ton" name="ton" value=""><br>
<span>性别:</span><input class="form-control" type="text" id="tsex"  name="tsex" value=""><br>
<span>时间:</span><input class="form-control" type="text" id="ttime"  name="ttime" value=""><br>
<span>考勤情况:</span><input class="form-control" type="text" id="tkcontebt"  name="tkcontebt" value=""><br>
<input type="submit" value="添加" class="btn btn-success" >
<input type="reset" value="重置" class="btn  btn-info">

</form>
</div>

</body>
</html>