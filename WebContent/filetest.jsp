<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../common/common.jsp" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<form id="formId" action="${pageContext.request.contextPath}/fileupload.action" method="post"  enctype="multipart/form-data">
    	文件:<input id="myfile" type="file" name="uploadFile"><br/>
    		<input type="hidden" id="sourceFilePath" name="sourceFilePath">
	    	<input id="btn" type="button"  value="提交"><br/>
	    	<script type="text/javascript">
	    		$("#btn").click(function(){
	    			//获取路径
	    			var path = $("#myfile").val();
	    			alert("path:" + path);
	    			//将获取的路径赋值给隐藏框
	    			$("#sourceFilePath").val(path);
	    			//提交
	    			$("#formId").submit();
	    		});
	    	</script>
</form>
</body>
</html>