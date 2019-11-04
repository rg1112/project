<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="itcast" uri="http://itcast.cn/common/"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品操作</title>
<script type="text/javascript"src="jq/jquery.js"></script>
<script type="text/javascript"src="bootstrap-3.3.7-dist/js/bootstrap.js"></script>
<link rel="stylesheet" type="text/css" href="bootstrap-3.3.7-dist/css/bootstrap.css" /><base>
<script type="text/javascript">
var id;
function check(){
	$(".id").change(function() {
		id = $("input[name='xz']:checked").val();
		//alert(id);
		console.log("id");
		console.log(id);
	});

}
function del2() {
	console.log("id");
	console.log(id);
	if(id==null||id==""){
		alert("请选择一种商品")
		return;
	}
	if(confirm("确定删除")){
		window.location.href="DelGoods?g_id="+id
	}
}
	function update() {
		console.log("id");
		console.log(id);
		if(id==null||id==""){
			alert("请选择一种商品")
			return;
		}
		if(confirm("确定修改")){
			window.location.href="UpdateShow?g_id="+id
		}
	
}
</script>
</head>
<body>
<div class="header">
		<div class="navbar navbar-default">
			<ul class="nav navbar-nav">
				<li class="actice">
					<button class="btn btn-link" onclick="window.close()">关闭</button>			
				</li>
				<li class="actice">
					<button class="btn btn-link" onclick="history.back()">后退</button>			
				</li>
				<li class="actice">
					<button class="btn btn-link" onclick="history.forward()">前进</button>			
				</li>			
			</ul>		
		</div>	
	</div>
	<div class="container">
<a href="addgoods.jsp" class="btn btn-info">添加</a>
<a href="#" class="btn btn-warning" onclick="update()">修改</a>
<a href="#" class="btn  btn-danger" onclick="del2()">删除</a>
<table class="table table-striped table-bordered table-hover">
<tr>
	<th>选择</th>
	<th>编号</th>
	<th>商品名</th>
	<th>成本价</th>
	<th>售价</th>
	<th>制造商</th>
	<th>操作</th>

</tr>
<c:forEach var="g" items="${list}" varStatus="vs">
<tr>
<td><input type="radio" name="xz" class="id" value="${g.g_id}" onclick="check()"></td>
<td>${vs.count}</td>
<td>${g.g_name}</td>
<td>${g.g_cb_price}</td>
<td>${g.g_xs_price}</td>
<td>${g.g_maker}</td>
<td><a href="UpdateShow?g_id=${g.g_id}" class="btn btn-warning">修改</a> <a href="#" class="btn  btn-danger" onclick="del(${g.g_id})">删除</a></td>
</tr>
</c:forEach>
	</table>
	<center>
	<div>
	<itcast:page url="${pageContext.request.contextPath }/ShowGoods?page =${page.page }" />
<%-- 	<itcast:page url="${pageContext.request.contextPath}/ShowGoods" /> --%>
	</div>
</center>
</div>

</body>
<script type="text/javascript">
	function del(g_id) {
		if(confirm("确定删除")){
			window.location.href="DelGoods?g_id="+g_id
		}
	}
</script>



</html>