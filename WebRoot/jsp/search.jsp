<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
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

	<link rel="stylesheet" type="text/css" href="css/search.css" charset="utf-8">

  </head>

<body onload="init()" >

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
        
       
        
        
        
        
        <div id="content">
        
             <h2><font color="AACDED" style="font-family:微软雅黑;">搜索结果</font></h2>
        	
        	
        	<table>
        	
        	
        	
        	<tr>
              	    <td align="center" width=100>编号</td>
              	    <td align="center" width=100>图片</td>
              	    <td align="center" width=100>专辑名称</td>
              	    <td align="center"width=100>演唱者</td>
              	    <td align="center" width=100>语言</td>
                      	    
              	</tr>
              	
              	
              		<s:iterator var="album" value="#session.albums"  status="index">
             
              	<tr>
              	    <td align="center"><s:a action="albumAc" method="getAlbum" id="#album.id">${album.id }
              	    	<s:param name="albId">${album.id }</s:param></s:a></td>
              	    <td align="center"><s:a action="albumAc" method="getAlbum"><img src="<s:property value="#album.path"/>" border="0"  height="50" width="50">
              	    	<s:param name="albId">${album.id }</s:param></s:a></td>
                    <td align="center"><s:a action="albumAc" method="getAlbum">${album.name}
                    	<s:param name="albId">${album.id }</s:param></s:a></td>
                    	
                    <td align="center">${album.artist.artName }</td>
                    <td align="center">${album.language.name }</td>

              	</tr>
              	</s:iterator>
              	</table>
              	</div>
              	
              	

        	
  		<div  id="flash1">
				<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000"
					codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=5,0,0,0"
					width="1010" height="300">
					<param name=movie value="./flash/4.swf">
					<param name=quality value=high>
					<param name=wmode value=transparent>
					<embed src="./flash/4.swf" quality=high
						pluginspage="http://www.macromedia.com/shockwave/download/index.cgi?P1_Prod_Version=ShockwaveFlash"
						type="application/x-shockwave-flash" width="1010" height="320">
					</embed>
				</object>
				</div>
  		
    </div>
     

   <div class="w" id="footer">
	<div class="flinks"><a href="http://www.360buy.com/intro/about.aspx" target="_blank">关于我们</a>|<a 

href="http://www.360buy.com/contact/" target="_blank">联系我们</a>|<a href="http://www.360buy.com/intro/job.aspx" 

target="_blank">人才招聘</a>|<a href="http://www.qianxun.com/" target="_blank">千寻网</a>|<a 

href="http://www.360buy.com/contact/joinin.aspx" target="_blank">商家入驻</a>|<a 

href="http://www.360buy.com/intro/service.aspx" target="_blank">广告服务</a>|<a href="http://app.360buy.com/" 

target="_blank">移动终端</a>|<a href="http://club.360buy.com/links.aspx" target="_blank">友情链接</a>|<a 

href="http://cps.360buy.com/" target="_blank">销售联盟</a></div>
	<div class="copyright">天津市南开区公安分局备案编号：1101081681&nbsp;&nbsp;津ICP证070359号&nbsp;&nbsp;<a 

href="http://misc.360buyimg.com/skin/df/i/com/f_music.jpg" target="_blank">音像制品经营许可证南开大学批5 号</a>&nbsp;&nbsp;互

联网信息服务资格证编号:(津)-经营性-2011-0034
<br>
		Copyright&copy;2011-08&nbsp;&nbsp;MUSIC++&nbsp;版权所有</div>
	
    </div>
  
  </body>
</html>
