<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<style  type="text/css">
#tableofchangealbum
{
position: relative;
left:300px;
}

</style>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Changealbum.jsp' starting page</title>
    
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
   <div id="changealbum">
  <div id="titleofchangealbum">
  <h2>删除商品</h2>
  </div>
  <div id="tableofchangealbum">
				<table>
					<tr>
						<td>专辑名
						</td>
						<td>
						<input type="text" >
						</td>
					</tr>
					<tr>
						<td>价格
						</td>
						<td>
						<input type="text" >
						</td>
					</tr>
					<tr>
						<td>库存量
						</td>
						<td>
						<input type="text" >
						</td>
					</tr>
					<tr>
						<td>
						</td>
						<td>
						<input type="submit" value="提交">
						</td>
					</tr>
				</table>
			</div>
  </div>
  
  
 
  </body>
</html>
