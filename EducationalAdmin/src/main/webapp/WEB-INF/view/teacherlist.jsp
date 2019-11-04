<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	href="${pageContext.request.contextPath }/css/pintuer.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/admin.css">
<script src="${pageContext.request.contextPath }/js/jquery.js"></script>
<script src="${pageContext.request.contextPath }/js/pintuer.js"></script>
</head>
<script type="text/javascript">
	  
	  
	function del1(tid,n) {
		if(confirm("您确定要删除吗?")){
		$.ajax({
			type:"POST",
			url:"${pageContext.request.contextPath }/user/delete/teacher",
			dataType:"json",
			contentType:"application/json",
			data:JSON.stringify(tid),
			success:function(data){
				if(data==1){
					 var tr = n.parentNode.parentNode.parentNode;
						console.log(tr)
						var tbody = n.parentNode.parentNode.parentNode.parentNode;
						console.log(tbody)
						tbody.removeChild(tr);
					alert("删除成功")
					
					}else{
						alert("删除失败")
					};
				}
			});
	}
		
	}
$("#checkall").click(function(){ 
  $("input[name='id[]']").each(function(){
	  if (this.checked) {
		  this.checked = false;
	  }
	  else {
		  this.checked = true;
	  }
 
})
})
function DelSelect(){
	var Checkbox=false;
	 $("input[name='id[]']").each(function(){
	  if (this.checked==true) {		
		Checkbox=true;	
	  }
	});
	if (Checkbox){
		var t=confirm("您确认要删除选中的内容吗？");
		if (t==false) return false; 		
	}
	else{
		alert("请选择您要删除的内容!");
		return false;
	}
}

</script>
<body>
	<form method="post" action="">
		<div class="panel admin-panel">
			<div class="panel-head">
				<strong class="icon-reorder"> 教师管理</strong>
			</div>
			<div class="padding border-bottom">
				<ul class="search">
					<li>
						<!-- <button type="button" class="button border-green" id="checkall">
							<span class="icon-check"></span> 全选
						</button>
						<button type="submit" class="button border-red">
							<span class="icon-trash-o"></span> 批量删除
						</button> -->
					</li>
				</ul>
			</div>
			<table class="table table-hover text-center">
				<tr>
					<th width="120">ID</th>
					<th>姓名</th>
					<th>编号</th>
					<th>性别</th>
					<th>教授课程</th>
					<th>职位</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${pageInfo.list}" var="tea" varStatus="v">
					<tr>
						<td><input type="checkbox" name="id[]" value="${tea.tid }" />
							${v.count}</td>
						<td>${tea.tname}</td>
						<td>${tea.ton}</td>
						<td>${tea.tsex}</td>
						<td>${tea.course.cname}</td>
						<td>${tea.role.rname}</td>

						<td><div class="button-group">
								<a class="button border-main"
									href="${pageContext.request.contextPath }/user/query/gxinxi?tid=${tea.tid}"><span
									class="icon-edit"></span> 修改</a> <a class="button border-red"
									id="del" href="#" onclick="del1(${tea.tid},this)"><span
									class="icon-trash-o"></span>删除</a>
							</div></td>
					</tr>
				</c:forEach>
				<tr>


				</tr>
				<tr>
					<td colspan="8"><div class="pagelist">
					<a
								 href="${pageContext.request.contextPath}/user/query/allTeacher?currentPage=${pageInfo.firstPage}">首页</a>
							<a
								<c:if test="${pageInfo.pageNum != pageInfo.firstPage}"> href="${pageContext.request.contextPath}/user/query/allTeacher?currentPage=${pageInfo.pageNum - 1 }"</c:if>
								<c:if test="${pageInfo.pageNum == pageInfo.firstPage}"> href="javascript:void(0)" class="disabled"</c:if>>上一页</a>
							<c:forEach begin="1" end="${pageInfo.pages }" varStatus="status">
								<a
									href="${pageContext.request.contextPath}/user/query/allTeacher?currentPage=${status.count }"
									<c:if test="${status.count == pageInfo.pageNum}">class="select"</c:if>>${status.count }</a>
							</c:forEach>
							<a
								<c:if test="${pageInfo.pageNum == pageInfo.lastPage}">class="disabled" href="javascript:void(0)"</c:if>
								<c:if test="${pageInfo.pageNum != pageInfo.lastPage}"> href="${pageContext.request.contextPath}/user/query/allTeacher?currentPage=${pageInfo.pageNum + 1 }"</c:if>>下一页</a><a
								 href="${pageContext.request.contextPath}/user/query/allTeacher?currentPage=${pageInfo.lastPage}">尾页</a>
						</div>  </td>
				</tr>
			</table>
		</div>
	</form>

</body>

</html>