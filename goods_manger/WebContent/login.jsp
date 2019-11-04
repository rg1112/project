<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录界面</title>
<link  rel="stylesheet" type="text/css" href="bootstrap-3.3.7-dist/css/bootstrap.css" />
<script type="text/javascript" src="jq/jquery.js"></script>
<script type="text/javascript" src="bootstrap-3.3.7-dist/js/bootstrap.js"></script>
<style type="text/css">
.container{
padding-left: 300px;
padding-top: 50px;
background-color: rgba(255, 255, 255, 0.3);
}
h1{
padding-left: 300px;
}
body{
background-image: url(img/timg.jpg)
}
</style>
</head>
<body>
<div class="header">
		<div class="navbar navbar-default">
			<ul class="nav navbar-nav">
				<li class="actice">
					<button class="btn btn-link" onclick="window.close()">关闭</button>			
				</li>
			</ul>		
		</div>	
	</div>
	<div class="container img-rounded">
	<h1 >登录</h1>
<form class="form-horizontal" action="LoginFilter" method="post" >
  <div class="form-group">
    <label for="inputEmail3" class="col-sm-2 control-label">用户名</label>
    <div class="col-sm-6">
      <input name="user" type="text" class="form-control" id="inputEmail3" placeholder="用户名">
    </div>
  </div>
 
  <div class="form-group">
    <label for="inputPassword3" class="col-sm-2 control-label">密码</label>
    <div class="col-sm-6">
    <input name="pwd" type="password" class="form-control"  id="m_pwd"  placeholder="请输入密码">
    </div>
  </div>
  
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <div class="checkbox">
        <label>
          <input type="checkbox"> Remember me
        </label>
      </div>
    </div>
  </div>
  <div style="padding-left: 150px">管理员<input type="radio" name="type" value="管理员">
  		用户<input type="radio" name="type" value="用户">
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-info">Sign in</button>
    </div>
  </div>
</form>
</div>
</body>
</html>