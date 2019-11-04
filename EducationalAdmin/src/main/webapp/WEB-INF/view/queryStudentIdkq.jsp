<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>学生考勤</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/pintuer.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/admin.css">
<script src="${pageContext.request.contextPath }/js/jquery.js"></script>
<script src="${pageContext.request.contextPath }/js/pintuer.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
</head>
<body>
		<div class="panel admin-panel">
  <div class="panel-head"><strong><span class="icon-pencil-square-o"></span>修改学生考勤</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="${pageContext.request.contextPath}/user/update/studentkq">
    <c:forEach var="s" items="${kao1}" varStatus="vs">
      <div class="form-group">
        <div class="label">
          <label for="sitename">学号：</label>
        </div>
        <div class="field">
          <label style="line-height:33px;">
           <input type="text" class="input w50" name="tkid" size="50"  value="${s.tkid}" readonly/>       
          </label>
        </div>
      </div>      
      <div class="form-group">
        <div class="label">
          <label for="sitename">时间：</label>
        </div>
        <div class="field">
          <input type="date" class="input w50" name="ttime" size="50" value="${s.ttime}"/>       
        </div>
      </div>      
      <div class="form-group">
        <div class="label">
          <label for="sitename">考勤情况：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="tkcontebt" size="50" value="${s.tkcontebt}" />         
        </div>
      </div>
      </c:forEach>
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
</body>
</html>
