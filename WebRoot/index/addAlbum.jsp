<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib  prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<style>

#tableofaddalbum{
position: relative;
left:300px;
}





</style>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Addalbum.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body> 
   <div id="addalbum">
   <div id="titleofaddalbum">
   <h2>添加专辑</h2>
   </div>
   <div id="tableofaddalbum">
<table bgcolor="#ffffff"  bordercolor="red" border="1" cellpadding="10"  >
<tr>
<td>专辑名</td>
<td><input type="text"></td>
</tr>
<tr>
<td>语言</td>
<td><input type="text"></td>
</tr>
<tr>
<td>艺术家</td>
<td><input type="text"></td>
</tr>
<tr>
<td>发行时间</td>
<td><input type="text"></td>
</tr>
<tr>
<td>发行公司</td>
<td><input type="text"></td>
</tr>
<tr>
<td>价格</td>
<td><input type="text"></td>
</tr>
<tr>
<td>库存量</td>
<td><input type="text"></td>
</tr>
<tr>
<td>专辑介绍</td>
<td><textarea cols="40" rows="30"></textarea></td>
</tr>
<tr>
<td></td>
<td> <input type="submit" value="添加"></td>
</tr>




</table>
   
   
   
   </div>
   </div>
  </body>
</html>
