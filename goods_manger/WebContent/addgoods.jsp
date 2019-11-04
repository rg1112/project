<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加商品页面</title>
<link rel="stylesheet" type="text/css" href="bootstrap-3.3.7-dist/css/bootstrap.css" />
<script src="jq/jquery.min.js" type="text/javascript" charset="utf-8"></script>
<script src="bootstrap-3.3.7-dist/js/bootstrap.min.js" type="text/javascript" charset="utf-8"></script>
</head>
<script type="text/javascript">
function check() {
	var g_name=document.getElementById("g_name").value.trim()
	var g_xs_price=document.getElementById("g_xs_price").value.trim()
	var g_cb_price=document.getElementById("g_cb_price").value.trim()
	var g_maker=document.getElementById("g_maker").value.trim()
	if(g_name==""){
		alert("商品名不能为空");
		return false;
	}
	
	else if(g_cb_price==""){
		alert("成本价不能为空");
		return false;
	}
	else if(isNaN(g_cb_price)){
		alert("成本价不能为非数字");
		return false;
	}
	else if(g_xs_price==""){
		alert("销售价格不能为空");
		return false;
	}
	else if(isNaN(g_xs_price)){
		alert("销售价不能为非数字");
		return false;
	}
	
	else if(g_maker==""){
		alert("制造商名不能为空");
		return false;
	}
	else{
		alert("添加成功")
		}
}


</script>
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
<div class="container ">
<h1 class="text-center">添加页面</h1>
<form action="AddServlet" method="post" onsubmit="check()" >
<span>商品名:</span><input class="form-control" type="text" id="g_name" name="g_name" value=""><br>
<span>成本价:</span><input class="form-control" type="text" id="g_cb_price" name="g_cb_price" value=""><br>
<span>销售价:</span><input class="form-control" type="text" id="g_xs_price"  name="g_xs_price" value=""><br>
<span>制造商:</span><input class="form-control" type="text" id="g_maker"  name="g_maker" value=""><br>
<input type="submit" value="添加" class="btn btn-success" >
<input type="reset" value="重置" class="btn  btn-danger">
</form>
</div>
</body>
</html>