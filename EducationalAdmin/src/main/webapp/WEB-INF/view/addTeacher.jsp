<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title></title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/pintuer.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css">
<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/js/pintuer.js"></script>
</head>
<body>
<div class="panel admin-panel">
  <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>增加教师</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="${pageContext.request.contextPath}/head/add/teacher">  
      <div class="form-group">
        <div class="label">
          <label>姓名：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" value="" name="tname" data-validate="required:请输入姓名" />
          <div class="tips"></div>
        </div>
      </div>
	  <div class="form-group">
	    <div class="label">
	      <label>编号：</label>
	    </div>
	    <div class="field">
	      <input type="text" class="input w50" value="" name="ton" data-validate="required:请输入编号" />
	      <div class="tips"></div>
	    </div>
	  </div>
	  <div class="form-group">
	    <div class="label">
	      <label>密码：</label>
	    </div>
	    <div class="field">
	      <input type="text" class="input w50" value="" name="tpwd" data-validate="required:请输入密码" />
	      <div class="tips"></div>
	    </div>
	  </div>
     
      
     
        <div class="form-group">
          <div class="label">
            <label>性别：</label>
          </div>
          <div class="field">
            <select name="tsex" class="input w50">
              <option value="男">男</option>
              <option value="女">女</option>
              
            </select>
            <div class="tips"></div>
          </div>
        </div>
		<div class="form-group">
		  <div class="label">
		    <label>教授课程：</label>
		  </div>
		  <div class="field">
		    <select name="tcourse" class="input w50">
		      <option value="1">计算机网络</option>
		      <option value="2">数据库</option>
		       <option value="3">JAVA</option>
			    <option value="4">C语言</option>
				 <option value="5">概率论与统计</option>
		    </select>
		    <div class="tips"></div>
		  </div>
		</div>
		<div class="form-group">
		  <div class="label">
		    <label>权限：</label>
		  </div>
		  <div class="field">
		    <select name="rid" class="input w50">
		      <option value="4">普通教师</option>
			    <option value="3">班主任</option>
		        <option value="2">教导主任</option>
				
		    </select>
		    <div class="tips"></div>
		  </div>
		</div>
      <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
        </div>
      </div>
    </form>
  </div>
</div>

</body></html>