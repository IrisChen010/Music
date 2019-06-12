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

	<link rel="stylesheet" type="text/css" href="css/userinfo.css">
	<script type="text/javascript" >
	
		function Show1(index){
		   base.style.visibility=index;
		}
		function Show2(index){
		   other.style.visibility=index;
		}
		function Show3(index){
		   image.style.visibility=index;
		}
	</script>
	
  </head>

<body>

     <div  id="topest">
    
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
            <ul>
            	<li><s:if test="#session.user==null">
            			<a href="jsp/homepage.jsp"><img src="images/home.png"></a></s:if>
            		<s:else><a href="loginAc!backToHome?userId=<s:property value="#session.user.id" />"><img src="images/home.png"></a></s:else></li>
                <li><a href="albumAc!getAllAlbums"><img src="images/allAlbum.png"></a></li>
                <li><s:if test="#session.user==null">
    					<a href="jsp/login.jsp"><img src="images/profile.png"></a></s:if>
    				<s:else><a href="userInfoAc!showUserInfo?userId=<s:property value="#session.user.id" />"><img src="images/profile.png"></a></s:else></li>
                <li><a href="jsp/gallery.jsp"><img src="images/album.png"></a></li>
                <li><a href="jsp/about.jsp"><img src="images/about.png"></a></li>
                
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
    
				
        
        <div id="content">
        	<div id="content_left">
        	<div class="section" style="visibility: visible;;" id="image">
        			<h2>个人头像</h2>
        			<s:form action="userInfoAc" name="frm">
        			     <img src="<s:property value="#session.userinfo.path"/>" border="0"  height="100" width="100">
         </s:form>
        			</div>
          <ul id="nav">
                <li><a  onclick="Show3('visible')">显示个人头像</a></li>
           		<li><a  onclick="Show3('hidden')">隐藏个人头像</a></li>
           		<li><a  onclick="Show1('visible')">显示基本信息</a></li>
           		<li><a  onclick="Show1('hidden')">隐藏基本信息</a></li>
           		<li><a  onclick="Show2('visible')">显示辅助信息</a></li>
           		<li><a  onclick="Show2('hidden')">隐藏辅助信息</a></li>
           		
          </ul>
        </div>
        <div id="content_right" >
        	
                       
        			<div class="section first" id="base" style="visibility: visible;;">
        			<h2>基本信息</h2>
        			<ul>
        			   <li>昵称：<s:property value="#session.userinfo.nickName"/></li>
        			   <li>性别：<s:property value="#session.userinfo.gender"/></li>
        			   <li>籍贯：<s:property value="#session.userinfo.province"/>省
        			             <s:property value="#session.userinfo.city"/> 市</li>       			   
        			   <li>联系电话:
        			    <s:iterator var="ucp" value="#session.usercontact">
        			    <s:property value="#ucp.phone"/>
        			    </s:iterator>
        			    </li>
        			   <li>邮政编码:
        			   <s:iterator var="ucpn" value="#session.usercontact">
        			    <s:property value="#ucpn.postNum"/>
        			    </s:iterator>
        			    </li>
        			    <li>家庭住址:
        			    <s:iterator var="ucd" value="#session.usercontact">
        			    <s:property value="#ucd.address"/>
        			    </s:iterator>
        			    </li>
        			    <li>E-mail:<s:property value="#session.userinfo.email"/></li>
        			   </ul>
        			</div>
        			
        			
        			
        			<div class="section clearfix" style="visibility: visible;;" id="other">
        			<h2>辅助信息</h2>
        			   <ul>
        			  <li>喜欢的明星: 
        			  <s:property value="#session.art.artName"/>
        			  </li>
        			  <li>偏好的语言：&nbsp;&nbsp;<s:property value="#session.hobby.language.name"/></li>
        			  <li>偏好的流派:&nbsp; &nbsp;<s:property value="#session.hobby.genre.name"/></li>
        			   </ul>
        			</div>
        </div>
        </div>
        <div id="flash1">
        <object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000"
					codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=5,0,0,0"
					width="1010" height="300">
					<param name=movie value="./flash/3.swf">
					<param name=quality value=high>
					<param name=wmode value=transparent>
					<embed src="./flash/3.swf" quality=high
						pluginspage="http://www.macromedia.com/shockwave/download/index.cgi?P1_Prod_Version=ShockwaveFlash"
						type="application/x-shockwave-flash" width="1010" height="320">
					</embed>
				</object>
        
        </div>


    <div class="w" id="footer">
	<div class="flinks"><a href="http://www.360buy.com/intro/about.aspx" target="_blank">关于我们</a>|<a href="http://www.360buy.com/contact/" target="_blank">联系我们</a>|<a href="http://www.360buy.com/intro/job.aspx" target="_blank">人才招聘</a>|<a href="http://www.qianxun.com/" target="_blank">千寻网</a>|<a href="http://www.360buy.com/contact/joinin.aspx" target="_blank">商家入驻</a>|<a href="http://www.360buy.com/intro/service.aspx" target="_blank">广告服务</a>|<a href="http://app.360buy.com/" target="_blank">移动终端</a>|<a href="http://club.360buy.com/links.aspx" target="_blank">友情链接</a>|<a href="http://cps.360buy.com/" target="_blank">销售联盟</a></div>
	<div class="copyright">天津市南开区公安分局备案编号：1101081681&nbsp;&nbsp;津ICP证070359号&nbsp;&nbsp;<a href="http://misc.360buyimg.com/skin/df/i/com/f_music.jpg" target="_blank">音像制品经营许可证南开大学批5 号</a>&nbsp;&nbsp;互联网信息服务资格证编号:(津)-经营性-2011-0034
<br>
		Copyright&copy;2011-08&nbsp;&nbsp;MUSIC++&nbsp;版权所有</div>
	
    </div>
    </div>

  </body>
</html>












