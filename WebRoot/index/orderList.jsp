<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"  %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<style  type="text/css">
#tableoforderlist
{
position: relative;
left:300px;
}

</style>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Oderlist.jsp' starting page</title>
    
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
   <div id="orderlist">
   <div id="titleoforderlist">
   <h2>订单列表</h2>
   </div>
   
   <s:form action="adminManiAc">
		<s:url id="btn_admin_show" value="images/btn_admin_show.jpg"></s:url>
		<s:submit method="showOrder" type="image" src="%{btn_admin_show}"></s:submit>
	</s:form>
   
   <div id="tableoforderlist">
   <table bgcolor="#ffffff"  bordercolor="red" border="1" cellpadding="10" >
   <tr>
   <td width=50 align="center">订单号</td>
   <td width=60 align="center">专辑名</td>
   <td width=60 align="center">数量</td>
   <td width=60 align="center">用户</td>
   <td width=100 align="center">交易日期</td>
   
   </tr>
   
   <s:iterator var="order" value="#session.orders" status="index">
   		<tr><td>${index.count }</td>
   			<td>${order.album.name }</td>
   			<td>${order.number }</td>
   			<td>${order.userInfo.nickName }</td>
   			<td>${order.tradeBegin }</td></tr>
   </s:iterator>
   
   </table>
   </div>
   </div>
  </body>
</html>
