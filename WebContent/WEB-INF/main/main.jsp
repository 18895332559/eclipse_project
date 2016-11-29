<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../../common/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script type="text/javascript">
	$(function() {
		$("a[title]").click(function() {
			alert(this.title);
		});
	});
</script>
</head>
<body>
	<div id="mainPage" class="easyui-layout" style="width:600px;height:400px;" data-options="fit:true">   
	    <div data-options="region:'north',title:'文件管理系统',split:false" style="height:200px;">
	    </div>   
	    <div data-options="region:'west',title:'${requestScope.account.accountName }',split:false" style="width:200px;">
	    	<div id="aa" class="easyui-accordion" style="width:300px;height:200px;">   
			     <div title="操作">
		            <!-- list-style: none去左边的点；text-decoration: none：去超链接下划线,title用来区分后继定位这里的超链接 -->
		            <ul style="list-style: none;padding: 0px;margin:0px;">
		                <li style="padding: 6px;"><a href="#" title="上传"
		                                             style="text-decoration: none;display: block;font-weight:bold;">上传</a>
		                </li>
		                <li style="padding: 6px;"><a href="#" title="下载"
		                                             style="text-decoration: none;display: block;font-weight:bold;">下载</a>
		                </li>
		                <li style="padding: 6px;"><a href="#" title="查看"
		                                             style="text-decoration: none;display: block;font-weight:bold;">查看</a>
		                </li>
		            </ul>
		        </div>
			</div>  
	    </div>   
	    <div data-options="region:'center',title:'主界面'" style="padding:5px;background:#eee;"></div>   
	</div>  
	
</body>
</html>