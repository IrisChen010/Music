<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<HTML xmlns="http://www.w3.org/1999/xhtml">
<HEAD>
	<base href="<%=basePath%>">
	<META http-equiv=Content-Type content="text/html; charset=utf-8">
	<STYLE type=text/css>
		BODY {
			FONT-SIZE: 12px;
			COLOR: #ffffff;
			FONT-FAMILY: 宋体
		}
		
		td {
			FONT-SIZE: 12px;
			COLOR: #ffffff;
			FONT-FAMILY: 宋体
		}
	</STYLE>

	<META content="MSHTML 6.00.6000.16809" name=GENERATOR>
</HEAD>

<BODY>
	<s:form action="adminLoginAc">
	<div id=UpdatePanel1>
		<div id=div1 style="left: 0px; position: absolute; TOP: 0px; background-color: #0066ff"></div>
		<div id=div2 style="left: 0px; position: absolute; TOP: 0px; background-color: #0066ff"></div>
		<script language=JavaScript> 
			var speed=20;
			var temp=new Array(); 
			var clipright=document.body.clientWidth/2,clipleft=0;
			for (i=1;i<=2;i++){ 
				temp[i]=eval("document.all.div"+i+".style");
				temp[i].width=document.body.clientWidth/2;
				temp[i].height=document.body.clientHeight;
				temp[i].left=(i-1)*parseInt(temp[i].width);
			} 
			function openit(){ 
				clipright-=speed;
				temp[1].clip="rect(0 "+clipright+" auto 0)";
				clipleft+=speed;
				temp[2].clip="rect(0 auto auto "+clipleft+")";
				if (clipright<=0)
					clearInterval(tim);
			} 
			tim=setInterval("openit()",100);
		</script>
		
		<div>&nbsp;&nbsp; </div>
		<div>
		<table cellSpacing=0 cellPadding=0 width=900 align=center border=0>
		  <tbody>
		  <tr>
		    <td style="height: 105px"><img src="images/admin_login_1.gif" border=0></td></tr>
		  <tr>
		    <td background=images/admin_login_2.jpg height=300>
		      <table height=300 cellPadding=0 width=900 border=0>
		        <tbody>
		        <tr>
		          <td colSpan=2 height=35></td></tr>
		        <tr>
		          <td width=360></td>
		          <td>
		            <table cellSpacing=0 cellPadding=2 border=0>
		              <tbody>
		              <tr>
		                <td style="height: 28px" width=80>登 录 名：</td>
		                <td style="height: 28px" width=150><input id=txtName style="WIDTH: 130px" name="name"></td>
		                <td style="height: 28px" width=370><span id=RequiredFieldValidator3 
		                  style="FONT-WEIGHT: bold; VISIBILITY: hidden; COLOR: white">请输入登录名</span></td></tr>
		              <tr>
		                <td style="height: 28px">登录密码：</td>
		                <td style="height: 28px"><input id=txtPwd style="WIDTH: 130px" type=password name="pwd"></td>
		                <td style="height: 28px"><span id=RequiredFieldValidator4 
		                  style="FONT-WEIGHT: bold; VISIBILITY: hidden; COLOR: white">请输入密码</span></td></tr>
<!--		              <tr>-->
<!--		                <td style="height: 28px">验证码：</td>-->
<!--		                <td style="height: 28px"><input id=txtcode style="WIDTH: 130px" name="checkCode"></td>-->
<!--		                <td style="height: 28px">&nbsp;</td></tr>-->
		              <tr>
		                <td style="height: 18px"></td>
		                <td style="height: 18px"></td>
		                <td style="height: 18px"></td></tr>
		              <tr>
		                <td></td>
		                <td><s:url id="adminLoginImg" value="images/admin_login_button.gif"></s:url>
			        	<s:submit method="login" type="image" src="%{adminLoginImg}" align="center"></s:submit>
		              </td></tr></tbody></table></td></tr></tbody></table></td></tr>
		  <tr>
		    <td><img src="images/admin_login_3.jpg" border=0></td></tr></tbody></table></div></div>
	
	</s:form>
</BODY>
</HTML>