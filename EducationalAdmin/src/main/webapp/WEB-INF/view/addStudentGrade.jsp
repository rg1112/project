<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>成绩添加</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/pintuer.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/admin.css">
<script src="${pageContext.request.contextPath }/js/jquery.js"></script>
<script src="${pageContext.request.contextPath }/js/pintuer.js"></script>
</head>
<body>
	<div class="panel admin-panel margin-top">
		<div class="panel-head" id="add">
			<strong><span class="icon-pencil-square-o"></span>录入成绩</strong>
		</div>
		<div class="body-content">
			<form method="post" class="form-x" action="${pageContext.request.contextPath }/user/add/studentgarde">
				<div class="form-group">
					<div class="label">
						<label>学号：</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" name="sid" />
						<div class="tips"></div>
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label>计算机网络：</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" name="g1" />
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label>数据库：</label>
					</div>
					<div class="field">
						<input type=text" class="input w50" name="g2" />
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label>JAVA：</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" name="g3" />
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label>C语言：</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" name="g4" />
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label>概率论与统计：</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" name="g5" />
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label></label>
					</div>
					<div class="field">
						<button class="button bg-main icon-check-square-o" type="submit">
							提交</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>