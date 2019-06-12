<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<style>
#tableofdeleteuser
{
position: relative;
left:170px;
}

</style>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Deleteuser.jsp' starting page</title>
    
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
   <div id="deleteuser">

<div id="titleofdeleteuser">
<h2>用户列表</h2>

</div>

	<s:form action="adminManiAc">
		<s:url id="btn_admin_show" value="images/btn_admin_show.jpg"></s:url>
		<s:submit method="showDeleteUser" type="image" src="%{btn_admin_show}"></s:submit>
	</s:form>

<div id="tableofdeleteuser">
<table bgcolor="#ffffff"  bordercolor="red" border="1" cellpadding="10"  >
<tr>
<td width="50" height="20" align="center">编号</td>
<td width="80" height="20" align="center">用户昵称</td>
<td width="80" height="20" align="center">真实姓名</td>
<td width="60" height="20" align="center">年龄</td>
<td width="60" height="20" align="center">性别</td>
<td width="60" height="20" align="center">省份</td>
<td width="60" height="20" align="center">城市</td>
<td width="80" height="20" align="center">电子邮箱</td>
<td width="60" height="20" align="center">操作</td>
</tr>

	<s:iterator var="user" value="#session.users" status="index">
		<tr><td>${index.count }</td>
			<td>${user.nickName }</td>
			<td>${user.realName }</td>
			<td>${user.age }</td>
			<td>${user.gender }</td>
			<td>${user.province }</td>
			<td>${user.city }</td>
			<td>${user.email }</td>
			<td><a href="adminManiAc!deleteUserById?userId=<s:property value="#user.id"/>">删除</a></td></tr>
	</s:iterator>
</table>
</div>


</div>
  </body>
</html>
