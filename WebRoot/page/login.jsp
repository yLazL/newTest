<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户登录</title>
    
	<link rel="stylesheet" type="text/css" href="<%=basePath%>js/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>js/easyui/themes/icon.css">
    <script type="text/javascript" src="<%=basePath%>js/easyui/jquery-1.7.1.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/easyui/jquery.easyui.min.js"></script>
    <script src="<%=basePath%>js/easyui/easyloader.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/login.js"></script></head>
	<style>
	.dialog-button { text-align: center }
	</style>

  </head>
  
  <body>
    <div style="display: none;padding:20px;width:340px;height: 255px;" id="logindlg">
	 <form action="" method="post" id="loginfrm" name="loginfrm"  novalidate>
	<table width="100%" border="0" cellspacing="20" cellpadding="8" style="font-size:15px;"  class="table_input">
     <tr style="margin: 10px;">
      <td align="right" class="td_t" width="40px">账号：</td>
      <td class="td_c"><input name="user.accountNo" id="accountNo"  required="true"  class="easyui-validatebox"  maxlength="20"  ></td>
     </tr>
     <tr style="margin: 10px;">
      <td align="right" class="td_t" width="40px">密码：</td>
      <td class="td_c"><input name="user.password"  id="password"  required="true"  class="easyui-validatebox"  type="password" maxlength="20"></td>
     </tr>
    
	</table>
	</form>
	</div>
    
 </body>
</html>
