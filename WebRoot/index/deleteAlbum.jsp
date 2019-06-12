<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<style  type="text/css">
#tableofdeletealbum
{
position: relative;
left:150px;
}

</style>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Deletealbum.jsp' starting page</title>
    
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
  <div id="deletealbum">
  <div id="titleofdeletealbum">
  <h2>删除商品</h2>
  </div>
  
  	<s:form action="adminManiAc">
		<s:url id="btn_admin_show" value="images/btn_admin_show.jpg"></s:url>
		<s:submit method="showDeleteAlbum" type="image" src="%{btn_admin_show}"></s:submit>
	</s:form>
  
  <div id="tableofdeletealbum">
		<table bgcolor="#ffffff" bordercolor="red" border="1"
			cellpadding="10">
			<tr>
				<td width="50" height="20">
					编号
				</td>
				<td width="60" height="20">
					专辑名
				</td>
				<td width="100" height="20">
					艺术家
				</td>
				<td width="100" height="20">
					操作
				</td>
			</tr>
			<s:iterator var="album" value="#session.albums" status="index">
			<tr>
				<td>${index.count }</td>
				<td>${album.name }</td>
				<td>${album.artist.artName }</td>
				<td>
					<a href="adminManiAc!deleteAlbumById?albId=<s:property value="#album.id"/>">删除</a>
				</td>
			</tr>
			</s:iterator>
		</table>
			</div>
  </div>
  </body>
</html>
