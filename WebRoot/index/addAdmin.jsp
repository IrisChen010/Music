<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<style  type="text/css">
#tableofaddadmin
{
position: relative;
left:300px;
}

</style>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Addadmin.jsp' starting page</title>
    
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
  	
		<div id="addadmin">
			<div id="titleofaddadmin">
				<h2>
					添加管理员
				</h2>
			</div>
	
	<s:form action="adminManiAc">
			<div id="tableofaddmin">
				<table>
					<tr>
						<td>
							用户名
						</td>
						<td>
							<input type="text" name="name">
						</td>
					</tr>
					<tr>
						<td>
							密码
						</td>
						<td>
							<input type="text" name="pwd">
						</td>
					</tr>
					<tr>
						<td>
							Email
						</td>
						<td>
							<input type="text" name="email">
						</td>
					</tr>
					<tr>
						<td></td>
						<td>
							<s:submit method="addAdmin" value="添加"></s:submit>
						</td>
					</tr>
				</table>
			</div>
	</s:form>
	
		</div>
  	
  </body>
</html>
