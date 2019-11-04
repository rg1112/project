<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>超市管理系统</title>
<link  rel="stylesheet"  href="bootstrap/bootstrap-3.3.7-dist/css/bootstrap.css">
<script src=css/js/jquery.js" type="text/javascript" charset="utf-8"></script>
<script src="css/bootstrap-3.3.7-dist/js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
<style type="text/css">
	.c1{
		margin-top: 50px;
	}
	hr{
		border: 0.5px solid pink;
	}
	.navbar-brand {
	padding: 0px; 
	padding-left:45% ; 
	line-height: 50px;
	}
</style>
</head>
<body>
<script type="text/javascript">
	$(function(){
		$("#ul>li").hover(function(){
			$(this).attr("class","active")
		},function(){
			$(this).attr("class","")
		})
	})
</script>
	</head>
	<body>
		<!-- 导航栏 -->
		<nav class="navbar navbar-inverse navbar-fixed-top">
		  <div class="container">
		      <a class="navbar-brand " href="#" >欢迎来到天天超市</a>
		  </div><!-- /.container-fluid -->
		</nav>	 
	<!-- 栅格 -->
	<div class="container c1">
		<div class="row">
			<div class="col-md-6 text-center">				
				      <img src="images/huli.jpg">
				      <div class="caption">
				        <h3>个人护理</h3>
				        <p></p>
				        <p><a href="IndexServlet" class="btn btn-primary" role="button">进入</a></p>
				      </div>
			</div>
			<div class="col-md-6 text-center">				
				      <img src="images/jiajuu.jpg">
				      <div class="caption">
				        <h3>家居日用</h3>
				        <p></p>
				        <p><a href="IndexServlet" class="btn btn-primary" role="button">进入</a> </p>
				      </div>				   
			</div>
			<hr>
			<div class="col-sm-6 text-center">				
				      <img src="images/toyy.jpg">
				      <div class="caption">
				        <h3>玩具</h3>
				        <p></p>
				        <p><a href="IndexServlet" class="btn btn-primary" role="button">进入</a> </p>
				      </div>
				    
			</div>
			 <div class="col-sms-6 text-center">				
				      <img src="images/drinkk.jpg">
				      <div class="caption">
				        <h3>食品饮料</h3>
				        <p></p>
				        <p><a href="IndexServlet" class="btn btn-primary" role="button">进入</a> </p>
				      </div>
				    
			</div> 
		</div>
	</div>
</body>
</html>