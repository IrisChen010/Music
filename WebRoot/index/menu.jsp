﻿<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<HTML xmlns="http://www.w3.org/1999/xhtml">
<HEAD id=Head1><TITLE>导航</TITLE>
	<base href="<%=basePath %>">
<META http-equiv=Content-Type content="text/html; charset=utf-8">
<STYLE type=text/css>BODY {
	PADDING-RIGHT: 0px; PADDING-LEFT: 0px; PADDING-BOTTOM: 0px; MARGIN: 0px; PADDING-TOP: 0px; BACKGROUND-COLOR: #2a8dc8
}
BODY {
	FONT-SIZE: 16px; COLOR: #003366; FONT-FAMILY: Verdana
}
TD {
	FONT-SIZE: 16px; COLOR: #003366; FONT-FAMILY: Verdana
}
DIV {
	FONT-SIZE: 20px; COLOR: #003366; FONT-FAMILY: Verdana
}
P {
	FONT-SIZE: 20px; COLOR: #003366; FONT-FAMILY: Verdana
}
.mainMenu {
	FONT-WEIGHT: bold; FONT-SIZE: 14px; CURSOR: hand; COLOR: #000000
}
A.style2:link {
	PADDING-LEFT: 4px; COLOR: #0055bb; TEXT-DECORATION: none
}
A.style2:visited {
	PADDING-LEFT: 4px; COLOR: #0055bb; TEXT-DECORATION: none
}
A.style2:hover {
	PADDING-LEFT: 4px; COLOR: #ff0000; TEXT-DECORATION: none
}
A.active {
	PADDING-LEFT: 4px; COLOR: #ff0000; TEXT-DECORATION: none
}
.span {
	COLOR: #ff0000
}
</STYLE>

<SCRIPT language=javascript>
		function MenuDisplay(obj)
		{
		    for(var i=1;i<=6;i++)
		    {
		        document.getElementById('table_'+i).style.display='none';
				document.getElementById('table_'+i+'Span').innerText='＋';
		    }
			if(document.getElementById(obj).style.display=='none')
			{
				document.getElementById(obj).style.display='block';
				document.getElementById(obj+'Span').innerText='－';
			}
			else
			{
				document.getElementById(obj).style.display='none';
				document.getElementById(obj+'Span').innerText='＋';
			}
		}
    </SCRIPT>

<META content="MSHTML 6.00.2900.3492" name=GENERATOR></HEAD>
<BODY>
<FORM id=form1 name=form1 action=YHMenu.aspx method=post>
<TABLE cellSpacing=0 cellPadding=0 width=210 align=center border=0>
  <TBODY>
  <TR>
    <TD width=15><IMG src="index/YHMenu.files/new_005.jpg" border=0></TD>
    <TD align=middle width=180 background=index/YHMenu.files/new_006.jpg 
      height=35><B>后台管理菜单</B> </TD>
    <TD width=15><IMG src="index/YHMenu.files/new_007.jpg" 
border=0></TD></TR></TBODY></TABLE>
<TABLE cellSpacing=0 cellPadding=0 width=200 align=center border=0>
  <TBODY>
  <TR>
    <TD width=15 background=index/YHMenu.files/new_008.jpg></TD>
    <TD vAlign=top width=180 bgColor=#ffffff>
      <TABLE cellSpacing=0 cellPadding=3 width=165 align=center border=0>
        <TBODY>
        <TR>
          <TD class=mainMenu onClick="MenuDisplay('table_1');"><SPAN 
            class=span id=table_1Span>＋</SPAN> 管理员管理</TD></TR>
        <TR>
          <TD>
            <TABLE id=table_1 style="DISPLAY: none" cellSpacing=0 cellPadding=2 
            width=155 align=center border=0>
              <TBODY>
              <TR>
                <TD class=menuSmall><A class=style2 
                  href="adminSFAc!showFrame?sort=addAdmin" 
                  target=dmMain>增加管理员</A></TD></TR>
              <TR>
                <TD class=menuSmall><A class=style2 
                  href="adminSFAc!showFrame?sort=deleteAdmin" 
                  target=dmMain>删除管理员</A></TD></TR>
              <TR>
                <TD class=menuSmall><A class=style2 
                  href="adminSFAc!showFrame?sort=adminList" 
                  target=dmMain> 管理员列表</A></TD></TR>
              </TBODY></TABLE></TD></TR>
        <TR>
          <TD background=index/YHMenu.files/new_027.jpg height=1></TD></TR>
        <TR>
          <TD class=mainMenu onClick="MenuDisplay('table_2');"><SPAN 
            class=span id=table_2Span>＋</SPAN>用户管理 </TD></TR>
        <TR>
          <TD>
            <TABLE id=table_2 style="DISPLAY: none" cellSpacing=0 cellPadding=2 
            width=155 align=center border=0>
              <TBODY>
              <TR>
                <TD class=menuSmall><A class=style2 
                  href="adminSFAc!showFrame?sort=userList" 
                  target=dmMain>用户列表</A></TD></TR>
              <TR>
                <TD class=menuSmall><A class=style2 
                  href="adminSFAc!showFrame?sort=deleteUser" 
                  target=dmMain> 删除用户</A></TD></TR>
              
           </TBODY></TABLE></TD></TR>
        <TR>
          <TD background=index/YHMenu.files/new_027.jpg height=1></TD></TR>
        <TR>
          <TD class=mainMenu onClick="MenuDisplay('table_3');"><SPAN 
            class=span id=table_3Span>＋</SPAN> 专辑管理</TD></TR>
        <TR>
          <TD>
            <TABLE id=table_3 style="DISPLAY: none" cellSpacing=0 cellPadding=2 
            width=155 align=center border=0>
              <TBODY>
              <TR>
                <TD class=menuSmall><A class=style2 
                  href="adminSFAc!showFrame?sort=addAlbum" 
                  target=dmMain>  添加专辑</A></TD></TR>
              <TR>
                <TD class=menuSmall><A class=style2
                  href="adminSFAc!showFrame?sort=deleteAlbum" target=dmMain>
                  删除专辑</A></TD></TR>
                    <TR>
                <TD class=menuSmall><A class=style2 
                  href="adminSFAc!showFrame?sort=changeAlbum" target=dmMain> 
                  更改专辑信息</A></TD></TR></TBODY></TABLE></TD></TR>
        <TR>
          <TD background=index/YHMenu.files/new_027.jpg height=1></TD></TR>
        <TR>
          <TD class=mainMenu onClick="MenuDisplay('table_4');"><SPAN 
            class=span id=table_4Span>＋</SPAN>订单管理</TD></TR>
        <TR>
          <TD>
            <TABLE id=table_4 style="DISPLAY: none" cellSpacing=0 cellPadding=2 
            width=155 align=center border=0>
              <TBODY>
              <TR>
                <TD class=menuSmall><A class=style2 
                  href="adminSFAc!showFrame?sort=orderList" 
                  target=dmMain>订单列表</A></TD></TR>
              <TR>
                <TD class=menuSmall><A class=style2 
                  href="adminSFAc!showFrame?sort=deleteOrder" 
                  target=dmMain> 删除订单</A></TD></TR>
              </TBODY></TABLE></TD></TR>
        <TR>
          <TD background=index/YHMenu.files/new_027.jpg height=1></TD></TR>
        <TR>
          <TD class=mainMenu onClick="MenuDisplay('table_5');"><SPAN 
            class=span id=table_5Span>＋</SPAN>其他管理 </TD></TR>
        <TR>
          <TD>
            <TABLE id=table_5 style="DISPLAY: none" cellSpacing=0 cellPadding=2 
            width=155 align=center border=0>
              <TBODY>
              <TR>
                <TD class=menuSmall><A class=style2 
                  href="#" 
                  target=dmMain>广告管理</A></TD></TR>
              <TR>
                <TD class=menuSmall><A class=style2 
                  href="#" 
                  target=dmMain>统计分析</A></TD></TR></TBODY></TABLE></TD></TR>
        <TR>
          <TD background=index/YHMenu.files/new_027.jpg height=1></TD></TR>
        <TR>
          <TD class=mainMenu onClick="MenuDisplay('table_6');"><SPAN 
            class=span id=table_6Span>＋</SPAN> 注销</TD></TR>
        <TR>
          <TD>
            <TABLE id=table_6 style="DISPLAY: none" cellSpacing=0 cellPadding=2 
            width=155 align=center border=0>
              <TBODY>
              <TR>
                <TD class=menuSmall><A class=style2 
                  href="#" 
                  target=dmMain>安全注销</A></TD></TR></TBODY></TABLE></TD>
    <TD width=15 background=index/YHMenu.files/new_009.jpg></TD></TR></TBODY></TABLE>
<TABLE cellSpacing=0 cellPadding=0 width=206 align=center border=0>
  <TBODY>
  <TR>
    <TD width=15><IMG src="index/YHMenu.files/new_010.jpg" border=0></TD>
    <TD align="middle" width=180 background=index/YHMenu.files/new_011.jpg 
    height=15></TD>
    <TD width=15><IMG src="index/YHMenu.files/new_012.jpg" 
border=0></TD></TR></TBODY></TABLE></FORM></BODY></HTML>
