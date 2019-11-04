<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品展示</title>
<link rel="stylesheet" type="text/css" href="bootstrap-3.3.7-dist/css/bootstrap.css" /><base>
<script type="text/javascript">
function zx() {
	if(confirm("确定注销")){
		window.location.href="login.jsp"
	}
}
</script>
</head>
<body>
<div class="header">
		<div class="navbar navbar-default">
			<ul class="nav navbar-nav">
				<li class="actice">
					<button class="btn btn-link" onclick="zx()">注销</button>			
				</li>
			</ul>		
		</div>	
	</div>
	<div class="container">
<table class="table table-striped table-bordered table-hover">
<tr>
	
	<th>编号</th>
	<th>商品名</th>
	<th>成本价</th>
	<th>售价</th>
	<th>交易数量</th>
	<th>交易次数</th>
	<th>利润</th>

</tr>
<c:forEach var="g" items="${list}" varStatus="vs">
<tr>

<td>${vs.count}</td>
<td>${g.g_name}</td>
<td>${g.g_cb_price}</td>
<td>${g.g_xs_price}</td>
<td>${g.j_num}</td>
<td>${g.j_c_num}</td>
<td>${g.j_profit}</td>
</tr>
</c:forEach>
	</table>
	<center>
	<a href="ShowGoods" class="btn btn-success">商品管理</a>
	</center>
</div>
</body>

</html>