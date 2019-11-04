<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title></title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/pintuer.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/admin.css">
<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/js/pintuer.js"></script>
</head>
<body>
	<div class="panel admin-panel">
		<div class="panel-head" id="add">
			<strong><span class="icon-pencil-square-o"></span>个人信息</strong>
		</div>
		<div class="body-content">
			<form method="post" class="form-x" action="">

				<div class="form-group">
					<div class="label">
						<label>姓名：</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" value="${stu.sname} "
							readonly="readonly" name="tname" />
						<div class="tips"></div>
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label>编号：</label>
					</div>
					<div class="field">
						<input readonly="readonly" type="text" class="input w50" value="${stu.sno}" name="ton" />
						<div class="tips"></div>
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label>性别：</label>
					</div>
					<div class="field">
						<input readonly="readonly" type="text" class="input w50" value="${stu.sex}" name="ton" />
						<div class="tips"></div>
					</div>
				</div>


				<div class="form-group">
					<div class="label">
						<label>班级：</label>
					</div>

					<div class="field">

						<input readonly="readonly" type="text" class="input w50" value="${stu.banji.bname}"
							name="cname" />

						<div class="tips"></div>
					</div>

				</div>
				<div class="form-group">
					<div class="label">
						<label>班级编号：</label>
					</div>

					<div class="field">

						<input readonly="readonly" type="text" class="input w50" value="${stu.banji.bno}"
							name="cname" />

						<div class="tips"></div>
					</div>

				</div>


				<div class="form-group">
					<div class="label">
						<label>班主任：</label>
					</div>
					<div class="field">

						<input readonly="readonly" type="text" class="input w50" value="${stu.teacher.tname}"
							name="rname" />

						<div class="tips"></div>
					</div>
				</div>




			</form>
		</div>
	</div>

</body>
</html>