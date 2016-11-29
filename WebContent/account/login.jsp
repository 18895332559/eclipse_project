<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="../common/common.jsp" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
</head>
<body>
	<h1 align="center">文件系统-登录</h1>
	<div id="loginDiv">
	    <form id="ff" method="post" action="${pageContext.request.contextPath}/login.action">
	        <div>
	            <label for="accountName">账号:</label>
	            <!-- 采用 js验证 -->
	            <input type="text" id="accountName" name="account.accountName"   />
	        </div>
	        <div>
	            <label for="accountPsd">密码:</label>
	            <input type="password" id="accountPsd" name="account.accountPsd" />
	        </div>
	    </form>
	  	  <!-- 回显错误信息 -->
	    <div style="color:red">${requestScope.msg}</div>
	</div>
	<script type="text/javascript">
	    $("[name='accLogin']").validatebox({
	        required: true,
	        missingMessage: '请填写账号！'
	    });
	    $("[name='accPass']").validatebox({
	        required: true,
	        missingMessage: '请填写密码！'
	    });
	    //禁用验证
	    $("#ff").form("disableValidation");
	
	    //把div的内容作为对话框方式弹出
	    $('#loginDiv').dialog({
	        title: '登陆入口',
	        width: 250,
	        height: 150,
	        closed: false,
	        cache: false,
	        //设置关闭按钮可见
	        closable: false,
	        //模式化窗口.如果为true将锁屏
	        modal: true,
	        buttons: [{
	            text: '登陆',
	            handler: function () {
	                //重新启动启用验证
	                $("#ff").form("enableValidation");
	                //进行验证，通过就提交
	                if ($("#ff").form("validate")) { // 这是真正验证的代码
	                    //提交
	                    $("#ff").submit();
	                }
	            }
	        }, {
	            text: '取消',
	            handler: function () {
					alert("取消");
	            }
	        }]
	
	    });
	
	</script>
	
</body>
</html>