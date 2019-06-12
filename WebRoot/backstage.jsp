<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/frameset.dtd">
<HTML xmlns="http://www.w3.org/1999/xhtml">
<HEAD><TITLE>音乐超市后台管理系统</TITLE>
	<base href="<%=basePath %>">
	<META http-equiv=Content-Type content="text/html; charset=utf-8">
	<META content="MSHTML 6.00.2900.3492" name=GENERATOR>
</HEAD>



<FRAMESET frameSpacing=0 rows=80,* frameBorder=0>

<FRAME name=top src="index/top.jsp" frameBorder=0 noResize scrolling=no>

<FRAMESET frameSpacing=0 frameBorder=0 cols=220,*>
<FRAME name=menu src="index/menu.jsp" frameBorder=0 noResize>



<s:if test="#session.sort=='addAdmin'">
	<FRAME name=content src="index/addAdmin.jsp" frameBorder=0 >
</s:if>
<s:elseif test="#session.sort=='deleteAdmin'">
	<frame name=content src="index/deleteAdmin.jsp" frameBorder=0 >
</s:elseif>
<s:elseif test="#session.sort=='adminList'">
	<frame name=content src="index/showAdmin.jsp" frameBorder=0 >
</s:elseif>
<s:elseif test="#session.sort=='userList'">
	<frame name=content src="index/showUser.jsp" frameBorder=0 >
</s:elseif>
<s:elseif test="#session.sort=='deleteUser'">
	<frame name=content src="index/deleteUser.jsp" frameBorder=0 >
</s:elseif>
<s:elseif test="#session.sort=='addAlbum'">
	<frame name=content src="index/addAlbum.jsp" frameBorder=0 >
</s:elseif>
<s:elseif test="#session.sort=='changeAlbum'">
	<frame name=content src="index/changeAlbum.jsp" frameBorder=0 >
</s:elseif>
<s:elseif test="#session.sort=='deleteAlbum'">
	<frame name=content src="index/deleteAlbum.jsp" frameBorder=0 >
</s:elseif>
<s:elseif test="#session.sort=='orderList'">
	<frame name=content src="index/orderList.jsp" frameBorder=0 >
</s:elseif>
<s:elseif test="#session.sort=='deleteOrder'">
	<frame name=content src="index/deleteOrder.jsp" frameBorder=0 >
</s:elseif>

</FRAMESET>
<NOFRAMES>
        <p>
            This page requires frames, but your browser does not support them.</p>
    </NOFRAMES>
    </FRAMESET>
    </HTML>
