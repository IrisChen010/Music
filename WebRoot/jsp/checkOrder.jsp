<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<base href="<%=basePath%>">
    <title>Welcome to Music++</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="content-type" content="text/html; charset=utf-8" />

	<link rel="stylesheet" type="text/css" href="css/shopCart.css">
	<script type="text/javascript" src="js/shopCart.js"></script>

  </head>

<body>
<div id="topest">

</div>
  <div  id="flash2">
				<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000"
					codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=5,0,0,0"
					width="1010" height="300">
					<param name=movie value="./flash/star.swf">
					<param name=quality value=high>
					<param name=wmode value=transparent>
					<embed src="./flash/star.swf" quality=high
						pluginspage="http://www.macromedia.com/shockwave/download/index.cgi?P1_Prod_Version=ShockwaveFlash"
						type="application/x-shockwave-flash" width="1010" height="320">
					</embed>
				</object>
				</div>
    <div id="container">
           <form>
    <div id="top">
    
    <ul>
    <li><a style="cursor: hand" onclick="this.style.behavior='url(#default#homepage)'; this.setHomePage('http://localhost:8080/Music++/jsp/homepage.jsp');">设为首页</a></li>
    <li><a onclick="window.external.AddFavorite(location.href,document.title)" style="cursor:hand;">加入收藏</a></li>
    <li><a href="#">曲风</a></li>
    <li><a href="#">排行榜</a></li>
    <li><a href="#">专辑归档</a></li>
    <li><a href="#">美图</a></li>
    <li><a href="#">娱乐</a></li>
    <s:if test="#session.user==null">
    	<li style="margin-left: 60px"><a href="jsp/login.jsp">个人空间</a>
    	<li><a href="albumAc!getAllAlbums">所有专辑</a></li>
    	<li><a href="jsp/login.jsp">收藏夹</a>
    	<li><a href="jsp/login.jsp">购物车</a></li>
    	<li><a href="loginAc!loginByCookie">登录</a>
    </s:if>
    <s:else>
    	<li style="margin-left: 60px"><a href="userInfoAc!showUserInfo?userId=<s:property value="#session.user.id" />">个人空间</a></li>
     	<li><a href="albumAc!getAllAlbumsUsePages?userId=<s:property value="#session.user.id" />">所有专辑</a></li>
     	<li><a href="favAc!showFav?userId=<s:property value="#session.user.id" />">收藏夹</a></li>
     	<li><a href="shopCartAc!showShopCart?userId=<s:property value="#session.user.id" />">购物车</a>
     	<li><a href="loginAc!logout">注销</a>
     </s:else>
    </ul>
    </div>
    </form>
    	<div id="header">
        	<h1><a href="#">Music++</a></h1>
            <ul><s:if test="#session.user==null">
            	<li><a href="jsp/homepage.jsp"><img src="images/home.png"></a>
                <li><a href="albumAc!getAllAlbums"><img src="images/allAlbum.png"></a></li>
                <li><a href="jsp/login.jsp"><img src="images/profile.png"></a></li>
                <li><a href="jsp/gallery.jsp"><img src="images/album.png"></a></li>
                <li><a href="jsp/about.jsp"><img src="images/about.png"></a></li>
                </s:if>
                <s:else>
                	<li><a href="loginAc!backToHome?userId=<s:property value="#session.user.id" />"><img src="images/home.png"></a></li>
                	<li><a href="albumAc!getAllAlbumsUsePages?userId=<s:property value="#session.user.id" />"><img src="images/allAlbum.png"></a></li>
                	<li><a href="userInfoAc!showUserInfo?userId=<s:property value="#session.user.id" />"><img src="images/profile.png"></a></li>
                	<li><a href="loginAc!gallery?userId=<s:property value="#session.user.id" />"><img src="images/album.png"></a></li>
                	<li><a href="loginAc!about?userId=<s:property value="#session.user.id" />"><img src="images/about.png"></a></li>
                </s:else>
               </ul>
            <div id="search">
            	<s:form action="searchAc" theme="simple">
            		<p><s:select name="choice" list="#{1:'根据专辑', 2:'根据歌曲', 3:'艺术家'}" listKey="key" listValue="value"></s:select>
            			<input type="text" name="search"/>&nbsp;&nbsp;
            			<s:url id="searchImage"  value="images/btn_search.jpg"></s:url>
            			<s:submit method="showAlbumsBySearch" type="image" src="%{searchImage}" theme="simple"></s:submit>
            			</p>
            		</s:form>
            </div>
        </div>
        
        <div id="Top1_FeeInfo" class="mycart_tip">
			<img id="myCartTipImg" src="images/cart02.png">
		</div>
        <form name="frm">
        <div class="List_cart">
			<h2><strong>我的专辑订单</strong></h2>
			<div id="content">
        		<table class="Table" cellpadding="0" cellspacing="0" width="100%" id="CartTb">
        			<tr class="align_Center Thead" height="30px"  style="color: #4e872c;">
       					<td width="10%">编号</td>
       					<td width="10%">专辑编号</td>
       					<td>专辑名称</td>
       					<td width="12%">专辑单价</td>
       					<td width="9%">数量</td>
       					<td width="9%">删除专辑</td>
       				</tr>
        			<s:iterator var="sc" value="#session.user.shopCarts" status="index">
   						<tr class="align_Center">
   							<td style="padding:5px 0 5px 0;"><s:property value="#index.count"/></td>
   							<td style="padding:5px 0 5px 0;"><s:property value="#sc.album.id"/></td>
   							<td class="align_Left"><a href="albumAc!getAlbum?albId=<s:property value="#sc.album.id"/>&userId=<s:property value="#session.user.id"/>"><s:property value="#sc.album.name"/></a></td>
  							<td class="price">￥
								<s:i18n name="format">
  								<s:text name="format.float" >
  								<s:param value="#sc.album.price"/>  
  								</s:text>
  								</s:i18n>
							</td>
   							<td>
   								<a onclick="reduce(<s:property value="#sc.id"/>, <s:property value="#index.count"/>, <s:property value="#sc.album.price"/>)" style="margin-right:2px;">
   									<img style="display:inline" src="images/reduce.gif" border="none"/>
  								</a>
  								<input id="number<s:property value="#index.count"/>" maxlength="4" style="width: 30px" value="<s:property value="#sc.number"/>"
  									onchange="change(<s:property value="#sc.id"/>, <s:property value="#index.count"/>, <s:property value="#sc.album.price"/>, <s:property value="#sc.number"/>)"/>
   								<a onclick="add(<s:property value="#sc.id"/>, <s:property value="#index.count"/>, <s:property value="#sc.album.price"/>)" style="margin-left:2px;">
   									<img style="display:inline" src="images/add.gif" border="none"/>
   								</a>
   							</td>
   							<td>
   								<a href="shopCartAc!deleteShopCart?id=<s:property value="#sc.id"/>&userId=<s:property value="#session.user.id"/>">删除
  								</a>
   							</td>
   						</tr>
   					</s:iterator>
   					<tr class="align_Center"><td colspan="6" align="left" height="40px">&nbsp;</td></tr>
   					<tr class="align_Center"><td colspan="6" align="left"><h2><strong>我的确认信息</strong></h2></td></tr>
   					<tr class="align_Center Thead" height="30px"  style="color: #4e872c;">
   						<td>名称</td>
   						<td>邮编</td>
   						<td>地址</td>
   						<td>手机号码</td>
   						<td colspan="2">电子邮件</td>
   					</tr>
   					<tr class="align_Center">
   						<td style="padding:5px 0 5px 0;"><s:property value="#session.user.nickName"/></td>
   						<td><s:property value="#session.usercontact.postNum"/></td>
   						<td><s:property value="#session.usercontact.address"/></td>
   						<td><s:property value="#session.usercontact.phone"/></td>
   						<td colspan="2"><s:property value="#session.user.email" /></td>
   					</tr>
   					<tr class="align_Center"><td colspan="6" align="left" height="40px">&nbsp;</td></tr>
   					<tr>        			
        				<td class="align_Right Tfoot" colspan="6" style="height:30px">
       						<span style="font-size:14px">
       							<b><font color="#4e872c">商品总金额：</font><span class="price">￥<input id="sum" value="<s:property value="#session.totalPrice"/>"/></span>元</b>
       						</span>
       					</td>        			
       				</tr>
       			</table>
       		</div>
        		
        	<ul class="cart_op" style="margin-bottom:0px;">			
				<li class="li3">
					<div id="submit_btn" style="text-align:right">
					<a id="gotoOrderInfo" href="userInfoAc!addHistory?userId=<s:property value="#session.user.id" />">
						<img alt="去结算" src="images/pay.png">
					</a>
					</div>
				</li>
			</ul>
        </div>
       </form>
    </div>
    <div  id="flash1">
				<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000"
					codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=5,0,0,0"
					width="1010" height="300">
					<param name=movie value="./flash/1.swf">
					<param name=quality value=high>
					<param name=wmode value=transparent>
					<embed src="./flash/1.swf" quality=high
						pluginspage="http://www.macromedia.com/shockwave/download/index.cgi?P1_Prod_Version=ShockwaveFlash"
						type="application/x-shockwave-flash" width="1010" height="320">
					</embed>
				</object>
				</div>
    <div>
    </div>
    

    <div class="w" id="footer">
	<div class="flinks"><a href="http://www.360buy.com/intro/about.aspx" target="_blank">关于我们</a>|<a href="http://www.360buy.com/contact/" target="_blank">联系我们</a>|<a href="http://www.360buy.com/intro/job.aspx" target="_blank">人才招聘</a>|<a href="http://www.qianxun.com/" target="_blank">千寻网</a>|<a href="http://www.360buy.com/contact/joinin.aspx" target="_blank">商家入驻</a>|<a href="http://www.360buy.com/intro/service.aspx" target="_blank">广告服务</a>|<a href="http://app.360buy.com/" target="_blank">移动终端</a>|<a href="http://club.360buy.com/links.aspx" target="_blank">友情链接</a>|<a href="http://cps.360buy.com/" target="_blank">销售联盟</a></div>
	<div class="copyright">天津市南开区公安分局备案编号：1101081681&nbsp;&nbsp;津ICP证070359号&nbsp;&nbsp;<a href="http://misc.360buyimg.com/skin/df/i/com/f_music.jpg" target="_blank">音像制品经营许可证南开大学批5 号</a>&nbsp;&nbsp;互联网信息服务资格证编号:(津)-经营性-2011-0034
<br>
		Copyright&copy;2011-08&nbsp;&nbsp;MUSIC++&nbsp;版权所有</div>
	
    </div>

  </body>
</html>