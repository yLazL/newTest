<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'inde.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript">
	$(function(){
		if(IsPC()){
			window.location.href="index.jsp";
			/* window.location.href="page/login.jsp"; */
			}else{  
				window.location.href="index.jsp";
		  
			}  
			  
			function IsPC()    
			{    
			           var userAgentInfo = navigator.userAgent;    
			           var Agents = new Array("Android", "iPhone", "SymbianOS", "Windows Phone", "iPad", "iPod");    
			           var flag = true;    
			           for (var v = 0; v < Agents.length; v++) {    
			               if (userAgentInfo.indexOf(Agents[v]) > 0) { flag = false; break; }    
			           }    
			           return flag;    
			} 
		
		
	});
	
	
	</script>
  </head>
  
  <body>
     <br>
  </body>
</html>
