<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<link rel="stylesheet" type="text/css" href="./css/index.css">
  </head>
  
  <body>
  	<div id="main_area">
  		<img src="./images/index_bkg.jpg" width="100%" height="100%" usemap="#Map" border="0">
		<map name="Map">
		  	<area shape="rect" coords="300,20,1000,680" href="./jsp/homepage.jsp" title="Go to homepage">
		</map>
  	</div>
  	
  </body>
</html>
