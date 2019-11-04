<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="jq/echarts.js"></script>
<script type="text/javascript" src="jq/jquery.js"></script>
<script type="text/javascript">
function show() {
	var echart=echarts.init(document.getElementById('main'))
	 var url="http://localhost:8080/five-c3po-day1-day40/Echart"
	 alert(url);
	$.ajax({
		url:url,
		dataType:"json",
		type:"post",
		success:function(json){
			alert(json.nameList);
			alert(json.profitList);
			   var nameList = json.nameList;
			   var profitList = json.profitList;
			   var value = [];
			   
			   //将名称列表和利润列表封装成二维数组
			   for(var i =0; i< nameList.length;i++){
				   value[i] = {"name":nameList[i],"value":profitList[i]};
			   }
			   var option = {
	
					   tooltip:{
						   show:true
					   },
					   legend:{
						 data:nameList  
					   },
					   series:[{
						   radius:"50%",
						   name:"利润饼图",
						   data:value,
						   type:"pie"
					   }]
			   }
			   echart.setOption(option);
		   }
		
	});
}

</script>
</head>

<body>
<button onclick="show()">触发</button>
<div id="main" style="width: 400px;height: 600px"></div>
</body>
</html>