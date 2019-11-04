<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://shiro.apache.org/tags" prefix="shiro"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title>后台管理中心</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/pintuer.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/admin.css">
<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
</head>
<body class="easyui-layout" style="background-color: #f2f9fd;">
	<div class="header bg-main">
		<div class="logo margin-big-left fadein-top">
			<h1>
				<img src="images/y.jpg" class="radius-circle rotate-hover"
					height="50" alt="" />后台管理中心
			</h1>
		</div>
		<div class="head-l">
			<a class="button button-little bg-green" href="" target="_blank"><span
				class="icon-home"></span> 前台首页</a> &nbsp;&nbsp;<a href="##"
				class="button button-little bg-blue"><span class="icon-wrench"></span>
				清除缓存</a> &nbsp;&nbsp;<a class="button button-little bg-red"
				href="login.html"><span class="icon-power-off"></span> 退出登录</a>
			&nbsp;&nbsp;<font size="4" color="#FFFFFF">欢迎您，<span
				class="dl-log-user">${ton}用户</span></font>
		</div>
	</div>
	<div class="leftnav">
		<div class="leftnav-title">
			<strong><span class="icon-list"></span>菜单列表</strong>
		</div>
		<shiro:hasAnyRoles name="校长,教导主任,班主任,普通老师,学生">
			<h2>
				<span class="icon-user"></span>基本设置
			</h2>
			<ul style="display: block">
				<!-- <li><a href="info.html" target="right"><span class="icon-caret-right"></span>网站设置</a></li> -->
				<li><a href="${pageContext.request.contextPath }/user/update/pwd" target="right"><span
						class="icon-caret-right"></span>修改密码</a></li>
				<li><a href="${pageContext.request.contextPath }/user//query/grxinxi" target="right"><span
						class="icon-caret-right"></span>个人信息</a></li>

			</ul>
		</shiro:hasAnyRoles>

		<shiro:hasRole name="校长">
			<h2>
				<span class="icon-pencil-square-o"></span>老师管理
			</h2>
			<ul>
				<li><a
					href="${pageContext.request.contextPath }/user/query/allTeacher"
					target="right"><span class="icon-caret-right"></span>查询所有老师</a></li>
				<li><a href="${pageContext.request.contextPath }/user/add/teacher" target="right"><span
						class="icon-caret-right"></span>添加老师</a></li>
				
			</ul>
		</shiro:hasRole>

		<shiro:hasRole name="校长,教导主任">
			<h2>
				<span class="icon-pencil-square-o"></span>学生管理
			</h2>
			<ul>
				<li><a
					href="${pageContext.request.contextPath }/user/query/allTeacher"
					target="right"><span class="icon-caret-right"></span>查询所有学生</a></li>
				<li><a href="addTeacher.jsp" target="right"><span
						class="icon-caret-right"></span>添加学生</a></li>
				<li><a href="addTeacher.jsp" target="right"><span
						class="icon-caret-right"></span>删除学生</a></li>
				<li><a href="addTeacher.jsp" target="right"><span
						class="icon-caret-right"></span>修改学生信息</a></li>
			</ul>
		</shiro:hasRole>

		<shiro:hasAnyRoles name="校长,教导主任,班主任,普通老师">
			<h2>
				<span class="icon-pencil-square-o"></span>考勤管理
			</h2>
		</shiro:hasAnyRoles>
		<ul>
			<shiro:hasAnyRoles name="校长,教导主任">
				<li><a
					href="${pageContext.request.contextPath }/kaoqing/query/findTkaoqingAll"
					target="right"><span class="icon-caret-right"></span>查询教师考勤</a>
				</li>
			</shiro:hasAnyRoles>
			
			
			<shiro:hasAnyRoles name="班主任,普通老师">
				<li><a
					href="${pageContext.request.contextPath }/user/query/personkq"
					target="right"><span class="icon-caret-right"></span>查询个人考勤</a></li>
			</shiro:hasAnyRoles>
			<shiro:hasAnyRoles name="校长,教导主任,班主任,普通老师">
				<li><a
					href="${pageContext.request.contextPath }/user/query/studentkq"
					target="right"><span class="icon-caret-right"></span>学生考勤信息</a></li>
			</shiro:hasAnyRoles>
		</ul>

<shiro:hasAnyRoles name="校长,教导主任,班主任,普通老师">
			<h2>
				<span class="icon-pencil-square-o"></span>学生信息管理
			</h2>
		</shiro:hasAnyRoles>
		<ul>
			<shiro:hasAnyRoles name="校长,教导主任">
				<li><a
					href="${pageContext.request.contextPath }/kaoqing/query/findstuall"
					target="right"><span class="icon-caret-right"></span>查询学生信息</a>
				</li>
			</shiro:hasAnyRoles>
		</ul>
		


		<shiro:hasAnyRoles name="校长,教导主任,班主任,普通老师">
			<h2>
				<span class="icon-pencil-square-o"></span>学生成绩管理
			</h2>
			<ul>
				<li><a
					href="${pageContext.request.contextPath }/user/query/studentgrade"
					target="right"><span class="icon-caret-right"></span>学生成绩信息</a></li>
		
			</ul>
		</shiro:hasAnyRoles>

		<shiro:hasRole name="学生">
			<h2>
				<span class="icon-pencil-square-o"></span>信息查询
			</h2>
			<ul>
				<li><a
					href="${pageContext.request.contextPath }/user/query/studentg"
					target="right"><span class="icon-caret-right"></span>查询成绩</a></li>
				<li><a
					href="${pageContext.request.contextPath }/user/query/personkq"
					target="right"><span class="icon-caret-right"></span>查询考勤</a></li>
				<%-- <li><a
					href="${pageContext.request.contextPath }/kaoqing/query/studentgc"
					target="right"><span class="icon-caret-right"></span>查询课程</a></li> --%>
			</ul>
		</shiro:hasRole>
	</div>
	<script type="text/javascript">
		$(function() {
			$(".leftnav h2").click(function() {
				$(this).next().slideToggle(200);
				$(this).toggleClass("on");
			})
			$(".leftnav ul li a").click(function() {
				$("#a_leader_txt").text($(this).text());
				$(".leftnav ul li a").removeClass("on");
				$(this).addClass("on");
			})
		});
	</script>
	<ul class="bread">
		<li><a href="${pageContext.request.contextPath }/images/bj.jpg"
			target="right" class="icon-home"> 首页</a></li>
		<li><a href="##" id="a_leader_txt">网站信息</a></li>
		<li><b>当前语言：</b><span style="color: red;">中文</php></span>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;切换语言：<a href="##">中文</a> &nbsp;&nbsp;<a
			href="##">英文</a></li>
	</ul>
	<div class="admin">
		<iframe scrolling="auto" rameborder="0"
			src="${pageContext.request.contextPath }/images/bj.jpg" name="right"
			width="100%" height="100%"></iframe>
	</div>
</body>
</html>