<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>
    <meta charset="UTF-8">
    <title>用户管理</title>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>js/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>js/easyui/themes/icon.css">
    <script type="text/javascript" src="<%=basePath%>js/easyui/jquery-1.7.1.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/easyui/jquery.easyui.min.js"></script>
    <script src="<%=basePath%>js/easyui/easyloader.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/userlist.js"></script></head>
	<body class="easyui-layout">
	<div class="center" style="width:100%;height:100%;border:1px  blue;">
	<table id="userGrid"></table>
	</div>
	<div style="display: none;padding:20px;width:300px;height: 320px" id="adddlg">
	
	 <form action="" method="post" id="addfrm" name="addfrm" >
	 <div id="checkRes" style="width: 100%;text-align: right;height: 20px;color: green;"></div>
	 <input type="hidden" name="user.userID" id="userID"/>
	 	<table width="100%" border="0" cellspacing="4" cellpadding="4" style="font-size:15px;"  class="table_input">
     <tr style="margin: 10px;">
      <td align="right" class="td_t">账号：</td>
      <td class="td_c"><input name="user.accountNo" id="accountNo" required="true" class="easyui-validatebox"  maxlength="20" ></td>
     
     </tr>
     
     <tr style="margin: 10px;">
      <td align="right" class="td_t">密码：</td>
      <td class="td_c"><input name="user.password"  id="password"   required="true"  class="easyui-validatebox"  type="password" maxlength="20"></td>
     </tr>
      <tr style="margin: 10px;">
      <td align="right" class="td_t">姓名：</td>
      <td class="td_c"><input name="user.name"  id="name"  required="true"  class="easyui-validatebox"  maxlength="20" ></td>
     </tr>
      <tr style="margin: 10px;">
      <td align="right" class="td_t">Email：</td>
      <td class="td_c"><input name="user.email" id="email"  class="easyui-validatebox"  validtype="email" maxlength="30"></td>
     </tr>
       <tr style="margin: 10px;">
      <td align="right" class="td_t">电话：</td>
      <td class="td_c"><input name="user.phone" id="phone"  class="easyui-validatebox"  validtype="number" maxlength="20"></td>
     </tr>
    </table>
	 </form>
   </div>
	<div id="toolbar_search" style="height:28px;background:#efefef;	padding:1px 2px;float: left;">
		 <form action="" method="post" id="searchfrm" name="searchfrm" >
		<div>
			<span>按姓名：</span>
			<input class="easyui-validatebox" name="user.name" id="name"/>
			&nbsp&nbsp
			<span>按账号：</span>
			<input class="easyui-validatebox" name="user.accountNo" id="accountNo"/>			
		</div>	
		</form>
	</div>
	</body>
	
</html>
