<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<style  type="text/css">
#tableofdeleteadmin
{
position: relative;
left:300px;

}

</style>




<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<HTML xmlns="http://www.w3.org/1999/xhtml"><HEAD id=Head1><TITLE>模板</TITLE>
	<base href="<%=basePath %>">
<META http-equiv=Content-Type content="text/html; charset=utf-8"><LINK 
href="YHChannelApply.files/Manage.css" type=text/css rel=stylesheet>

<div id="deleteadmin">

<div id="titleofdeleteadmin">
<h2>删除管理员</h2>

</div>

	<s:form action="adminManiAc">
		<s:url id="btn_admin_show" value="images/btn_admin_show.jpg"></s:url>
		<s:submit method="showDeleteAdmin" type="image" src="%{btn_admin_show}"></s:submit>
	</s:form>

<div id="tableofdeleteadmin">
		<table bgcolor="#ffffff" bordercolor="red" border="1"
			cellpadding="10">
			<tr>
				<td width="50" height="20">
					编号
				</td>
				<td width="60" height="20">
					用户名
				</td>
				<td width="100" height="20">
					电子邮箱
				</td>
				<td width="100" height="20">
					操作
				</td>
			</tr>
			<s:iterator var="admin" value="#session.admins" status="index">
			<tr>
				<td>${index.count }</td>
				<td>${admin.name }</td>
				<td>${admin.email }</td>
				<td>
					<a href="adminManiAc!deleteAdminById?adminId=<s:property value="#admin.id"/>">删除</a>
				</td>
			</tr>
			</s:iterator>
		</table>
			</div>


</div>
