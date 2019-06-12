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

	<link rel="stylesheet" type="text/css" href="css/homepage.css">
	<script type="text/javascript" src="js/homepage.js"></script>

  </head>

<body>

<SCRIPT language=JavaScript1.2>

function move(x, y) {
if (document.all) {
object1.style.pixelLeft += x;
object1.style.pixelTop  += y;}
else
if (document.layers) {
document.object1.left += x;
document.object1.top  += y;
}};

function position() {
document.object1.left += -200;
document.object1.top  += 0;
document.object1.visibility = "show"
};

function makeStatic() {
if (document.all) {object1.style.pixelTop=document.body.scrollTop+100}
else {eval('document.object1.top=eval(window.pageYOffset+20)');}
setTimeout("makeStatic()",0);}

</SCRIPT>
<!-- 左隐藏菜单结束 -->

<!-- 左隐藏菜单BIG -->
<LAYER class=NS onmouseover=move(580,0) 
onmouseout="move(-580, 0)" left="0" name="object1" visibility="hide" top="20">
<SCRIPT language=JavaScript1.2>
if (document.all)
document.write('<DIV ID="object1" style="Position : Absolute ;Left : -125px ;Top : 20px ;Width : 0px ;Z-Index : 20">')
</SCRIPT>

<TABLE onmouseover=move(120,0) onMouseOut="move(-120, 0)" cellSpacing=1 
cellPadding=2 border=0>
  <TBODY>
  <TR>
    <TD>
      <STYLE type=text/css>BODY {
	MARGIN: 0px
}
</STYLE>

      <TABLE cellSpacing=0 cellPadding=0 width=118 align=center border=0>
        <TBODY>
        <TR>
          <TD><IMG height=160 alt="" 
            src="images/servicepic_01.jpg" width=118 
            border=0 name=servicepic_01></TD></TR>
        <TR>
          <TD>
            <TABLE cellSpacing=0 cellPadding=0 width=118 align=left border=0>
              <TBODY>
              <TR>
                <TD 
                  background=images/servicepic_02.jpg><IMG 
                  height=25 alt="" 
                  src="images/servicepic_02.jpg" 
                  width=14 border=0 name=servicepic_02></TD>
                <TD align=middle width=89 bgColor=#f8f6f7 height=25><A 
                  href="tencent://message/?uin=396367738&amp;Site=Music++&amp;Menu=yes" 
                  target=blank><IMG alt=点击这里给我发消息 
                  src="images/10_online.gif" 
                  border=0></A></TD>
                <TD 
                  background=images/servicepic_04.jpg><IMG 
                  height=25 alt="" 
                  src="images/servicepic_04.jpg" 
                  width=15 border=0 
name=servicepic_04></TD></TR></TBODY></TABLE></TD></TR>
        <TR>
          <TD><IMG height=17 alt="" 
            src="images/servicepic_05.jpg" width=118 
            border=0 name=servicepic_05></TD></TR>
        <TR>
          <TD>
            <TABLE cellSpacing=0 cellPadding=0 width=118 align=left border=0>
              <TBODY>
              <TR>
                <TD 
                  background=images/servicepic_06.jpg><IMG 
                  height=24 alt="" 
                  src="images/servicepic_06.jpg" 
                  width=14 border=0 name=servicepic_06></TD>
                <TD align=middle width=89 bgColor=#f8f6f7 height=24><A 
                  href="http://amos1.taobao.com/msg.ww?v=2&amp;uid=396367738&amp;s=1" 
                  target=_blank><IMG alt=点击这里给我发消息 
                  src="images/offline.gif" 
                border=0></A></TD>
                <TD 
                  background=images/servicepic_08.jpg><IMG 
                  height=24 alt="" 
                  src="images/servicepic_08.jpg" 
                  width=15 border=0 name=servicepic_08></TD></TR>
              <TR>
                <TD 
                background=images/servicepic_06.jpg>　</TD>
                <TD align=middle bgColor=#f8f6f7 height=35>
                  <TABLE cellSpacing=1 cellPadding=2 width="88%" align=center 
                  bgColor=#ffa800 border=0>
                    <TBODY>
                    <TR>
                      <TD align=middle bgColor=#ffffff><A 
                        href="http://www.lanrentuku.com/xbook/" target=_blank><SPAN 
                        style="FONT-SIZE: 9pt">站点留言簿</SPAN></A></TD></TR></TBODY></TABLE></TD>
                <TD 
                background=images/servicepic_08.jpg>　</TD></TR></TBODY></TABLE></TD></TR>
        <TR>
          <TD><IMG height=22 alt="" 
            src="images/servicepic_09.jpg" width=118 
            border=0 name=servicepic_09></TD></TR></TBODY></TABLE></TD>
    <TD vAlign=top align=middle width=12 rowSpan=100><IMG height=109 
      src="images/kefu.gif" width=20> </TD></TR>
  <SCRIPT language=JavaScript1.2>
<!--
if (document.all||document.layers)
makeStatic();

if (document.layers) {
window.onload=position;
}

var sitems=new Array();
var sitemlinks=new Array();

function hl(n) {
n.className='hl'}
function n(h) {
h.className='n'}
//--></SCRIPT>
  </TBODY></TABLE>
<SCRIPT language=JavaScript1.2>
if (document.all)
document.write('<\/DIV>')
</SCRIPT>
</LAYER>



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
        
        
        
        <div id="content_up">
        	<div id="up_left">
        		<table cellSpacing=0 cellPadding=0 width=600 border=0>
				  <tbody>
				    <tr>
				      <td height=400>
				      	<A onfocus=this.blur() href="albumAc!getAlbum?albId=105" name=imglink>
				      	<IMG style="FILTER: blendTrans(duration=1)" height=100% src="images/shangwuloudekuaihuo.jpg" width=100% border=0 name=bigimg></A>
				      </td>
				    </tr>
				    <tr>
				      <td height=27><table cellSpacing=0 cellPadding=0 width="100%" border=0>
				        <tbody>
				          <tr>
				            <td width=6></td>
				            <td width=61><IMG style="CURSOR: hand" 
				                        onmouseover="click_simg(this, 0);" height=15 
				                        src="images/main_flash_button1.gif" width=61 
				                        border=0 name=num_img0></td>
				            <td width=3></td>
				            <td width=61><IMG style="CURSOR: hand" 
				                        onmouseover="click_simg(this, 1);" height=15 
				                        src="images/main_flash_button2.gif" width=61 
				                        border=0 name=num_img1></td>
				            <td width=3></td>
				            <td width=61><IMG style="CURSOR: hand" 
				                        onmouseover="click_simg(this, 2);" height=15 
				                        src="images/main_flash_button3.gif" width=61 
				                        border=0 name=num_img2></td>
				            <td width=3></td>
				            <td width=61><IMG style="CURSOR: hand" 
				                        onmouseover="click_simg(this, 3);" height=15 
				                        src="images/main_flash_button4.gif" width=61 
				                        border=0 name=num_img3></td>
				            <td width=3></td>
				            <td width=61><IMG style="CURSOR: hand" 
				                        onmouseover="click_simg(this, 4);" height=15 
				                        src="images/main_flash_button5.gif" width=61 
				                        border=0 name=num_img4></td>
				            <td width=3></td>
				            <td width=61><IMG style="CURSOR: hand" 
				                        onmouseover="click_simg(this, 5);" height=15 
				                        src="images/main_flash_button6.gif" width=61 
				                        border=0 name=num_img5></td>
				            <td width=3></td>
				            <td width=61><IMG style="CURSOR: hand" 
				                        onmouseover="click_simg(this, 6);" height=15 
				                        src="images/main_flash_button7.gif" width=61 
				                        border=0 name=num_img6></td>
				            <td 
				              width=72><br><br></td>
				          </tr>
				        </tbody>
				      </table></td>
				    </tr>
				  </tbody>
				</table>
        	</div>
        	<div id="up_right">
        		<div id="login">
        			<s:if test="#session.user==null">
        				<a href="loginAc!loginByCookie"><img src="images/btn_login.jpg" /></a>&nbsp;&nbsp;
        				<a href="jsp/register.jsp"><img src="images/btn_register.jpg" /></a>
        			</s:if>
        			<s:else>
        				<span><font size="4px" color="#ffffff">欢迎您 ！ <s:property value="#session.user.nickName" /></font></span>&nbsp;&nbsp;
        				<span><s:a action="loginAc"  method="logout"><img src="images/btn_logout.jpg" /></s:a></span>
        			</s:else>
        		</div>
        		<div id="board">
        		
        		<div class="title">
        	<span >	<h2><font style="font-family: 微软雅黑; color: #AACDED;">公告</font></h2></span>
        		</div>
        		
        			<div id=link_logo style="OVERFLOW: hidden; WIDTH: 270px; HEIGHT: 235px">
  <div id=link_logo1 style="OVERFLOW: hidden">
    <table align="center" cellspacing=0 cellpadding=0 width=210 border=0>
    <tr><td><font color="white">公告：暑促大集结 &nbsp; 所有专辑裸奔价</font></td></tr>
    <tr><td><font color="white">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font></td></tr>
   <tr><td><font color="white">买专辑送海报！</font></td></tr>
   <tr><td><font color="white">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font></td></tr>
    <tr><td><font color="white">大陆专辑打折最后三天</font></td></tr>
    <tr><td><font color="white">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font></td></tr>
     <tr><td><font color="white">艾薇儿新出专辑 &nbsp;广大歌友速来认购</font></td></tr>
     <tr><td><font color="white">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font></td></tr>
      <tr><td><font color="white">经典专辑合集已发行 ，找出你喜欢的那一款吧</font></td></tr>
      <tr><td><font color="white">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font></td></tr>
       <tr><td><font color="white">购买专辑时支付方式为货到付款 不喜欢不花钱</font></td></tr>
       <tr><td><font color="white">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font></td></tr>
     <tr><td><font color="white">美图欣赏有木有 ，震撼人心的娱乐世界</font></td></tr>
       <tr><td><font color="white">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font></td></tr>
      <tr><td><font color="white">欢迎光临本网站，为您服务是我们最大的心意</font></td></tr>
          <tr><td><font color="white">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font></td></tr>
      </table>
  </div>
  <div id=link_logo2></div>
</div>
<p>
  <script>
 var speed=60;
  link_logo2.innerHTML=link_logo1.innerHTML
    function Marquee2(){
	  if(link_logo2.offsetTop-link_logo.scrollTop<=0)
	     link_logo.scrollTop-=link_logo1.offsetHeight
		   else{
		    link_logo.scrollTop++
			   }
			      }
				     var MyMar2=setInterval(Marquee2,speed)
					    link_logo.onmouseover=function() {clearInterval(MyMar2)};
						   link_logo.onmouseout=function() {MyMar2=setInterval(Marquee2,speed)};
</script>
        		</div>
        	</div>
        	
        	
        	
        	
        </div>
       
        
        
        <div id="hr">
         <hr color="#999999" size="2"/>
        </div>
        <div id="content_down">
        	<div id="down_left">
        	<div id="makewing">
        	<script  type="text/javascript">
        	 marqueesHeight=380;
         stopscroll=false;
          with(makewing){
	  style.width=0;
	  style.height=marqueesHeight;
	  style.overflowX="visible";
	  style.overflowY="hidden";
	  noWrap=true;
	  onmouseover=new Function("stopscroll=true");
	  onmouseout=new Function("stopscroll=false");
  }
  preTop=0; currentTop=marqueesHeight; stoptime=0;
  makewing.innerHTML+=makewing.innerHTML;
  

function init_srolltext(){
  makewing.scrollTop=0;
  setInterval("scrollUp()",1);
}init_srolltext();

function scrollUp(){
  if(stopscroll==true) return;
  currentTop+=1;
  if(currentTop==marqueesHeight+1)
  {
  	stoptime+=1;
  	currentTop-=1;
  	if(stoptime==300) 
  	{
  		currentTop=0;
  		stoptime=0;  		
  	}
  }
  else {  	
	  preTop=makewing.scrollTop;
	  makewing.scrollTop+=1;
	  if(preTop==makewing.scrollTop){
	    makewing.scrollTop=marqueesHeight;
	    makewing.scrollTop+=1;
	    
	  }
  }

}
init_srolltext();
        	  </script>
        	<table>
        	<tr><td><span><h2><font color="AACDED">大陆专辑推荐</font></h2></span></td></tr>
        	<tr><td><div class="hot_item">
        			<div class="hot_item_image"><a href="albumAc!getAlbum?albId=156&userId=<s:property value="#session.user.id"/>"><img src="images/album_img/Ang 5.0.jpg" width="120" height="90"></a></div>
        			<div class="hot_item_content"><a href="albumAc!getAlbum?albId=156&userId=<s:property value="#session.user.id"/>"><font style="font-family: 微软雅黑;">Ang 5.0-张韶涵</font></a></div></div>
        		<div class="hot_item">
        			<div class="hot_item_image"><a href="albumAc!getAlbum?albId=109&userId=<s:property value="#session.user.id"/>"><img src="images/album_img/renleba.jpg" width="120" height="90"></a></div>
        			<div class="hot_item_content"><a href="albumAc!getAlbum?albId=109&userId=<s:property value="#session.user.id"/>"><font style="font-family: 微软雅黑;">认了吧-陈奕迅</font></a></div></div>
        		<div class="hot_item">
        			<div class="hot_item_image"><a href="albumAc!getAlbum?albId=266&userId=<s:property value="#session.user.id"/>"><img src="images/album_img/00063710.jpg" width="120" height="90"></a></div>
        			<div class="hot_item_content"><a href="albumAc!getAlbum?albId=266&userId=<s:property value="#session.user.id"/>"><font style="font-family: 微软雅黑;">Britney-布兰妮</font></a></div></div>
        		<div class="hot_item">
        			<div class="hot_item_image"><a href="albumAc!getAlbum?albId=18&userId=<s:property value="#session.user.id"/>"><img src="images/album_img/zidingyi.jpg" width="120" height="90"></a></div>
        			<div class="hot_item_content"><a href="albumAc!getAlbum?albId=18&userId=<s:property value="#session.user.id"/>"><font style="font-family: 微软雅黑;">自定义-许嵩</font></a></div></div></td></tr>
        	<tr><td>	<div class="hot_item">
        			<div class="hot_item_image"><a href="albumAc!getAlbum?albId=30&userId=<s:property value="#session.user.id"/>"><img src="images/album_img/xinsuandelangman.jpg" width="120" height="90"></a></div>
        			<div class="hot_item_content"><a href="albumAc!getAlbum?albId=30&userId=<s:property value="#session.user.id"/>"><font style="font-family: 微软雅黑;">心酸的浪漫-那英</font></a></div></div>
        		<div class="hot_item">
        			<div class="hot_item_image"><a href="albumAc!getAlbum?albId=207&userId=<s:property value="#session.user.id"/>"><img src="images/album_img/3114520617304680082.jpg" width="120" height="90"></a></div>
        			<div class="hot_item_content"><a href="albumAc!getAlbum?albId=207&userId=<s:property value="#session.user.id"/>"><font style="font-family: 微软雅黑;">Freedom Piano Stories 4—久石让</font></a></div></div>
        		<div class="hot_item">
        			<div class="hot_item_image"><a href="albumAc!getAlbum?albId=116&userId=<s:property value="#session.user.id"/>"><img src="images/album_img/yiqizouguoderizi.jpg" width="120" height="90"></a></div>
        			<div class="hot_item_content"><a href="albumAc!getAlbum?albId=116&userId=<s:property value="#session.user.id"/>"><font style="font-family: 微软雅黑;">一起走过的日子-刘德华</font></a></div></div>
        		<div class="hot_item">
        			<div class="hot_item_image"><a href="albumAc!getAlbum?albId=168&userId=<s:property value="#session.user.id"/>"><img src="images/album_img/yongqi.jpg" width="120" height="90"></a></div>
        			<div class="hot_item_content"><a href="albumAc!getAlbum?albId=168&userId=<s:property value="#session.user.id"/>"><font style="font-family: 微软雅黑;">勇气-梁静茹</font></a></div></div></td></tr>
        			<tr><td height=60></td></tr>
        		
        			<tr><td><span><h2><font color="AACDED">最新专辑出品</font></h2></span></td></tr>
        			
        	<tr><td>	<div class="hot_item">
        			<div class="hot_item_image"><a href="albumAc!getAlbum?albId=184&userId=<s:property value="#session.user.id"/>"><img src="images/album_img/henyuquan.jpg" width="120" height="90"></a></div>
        			<div class="hot_item_content"><a href="albumAc!getAlbum?albId=184&userId=<s:property value="#session.user.id"/>"><font style="font-family: 微软雅黑;">很羽泉 EP-羽泉</font></a></div></div>
        		<div class="hot_item">
        			<div class="hot_item_image"><a href="albumAc!getAlbum?albId=200&userId=<s:property value="#session.user.id"/>"><img src="images/album_img/SHERO.jpg" width="120" height="90"></a></div>
        			<div class="hot_item_content"><a href="albumAc!getAlbum?albId=200&userId=<s:property value="#session.user.id"/>"><font style="font-family: 微软雅黑;">SHERO-SHE</font></a></div></div>
        		<div class="hot_item">
        			<div class="hot_item_image"><a href="albumAc!getAlbum?albId=136&userId=<s:property value="#session.user.id"/>"><img src="images/album_img/Private Corner.jpg" width="120" height="90"></a></div>
        			<div class="hot_item_content"><a href="lbumAc!getAlbum?albId=136&userId=<s:property value="#session.user.id"/>"><font style="font-family: 微软雅黑;">Private Corner 迷你音乐会-张学友</font></a></div></div>
        		<div class="hot_item">
        			<div class="hot_item_image"><a href="albumAc!getAlbum?albId=170&userId=<s:property value="#session.user.id"/>"><img src="images/album_img/wanmeideyitian.jpg" width="120" height="90"></a></div>
        			<div class="hot_item_content"><a href="albumAc!getAlbum?albId=170&userId=<s:property value="#session.user.id"/>"><font style="font-family: 微软雅黑;">完美的一天-孙燕姿</font></a></div></div></td></tr>
        	<tr><td>	<div class="hot_item">
        			<div class="hot_item_image"><a href="albumAc!getAlbum?albId=177&userId=<s:property value="#session.user.id"/>"><img src="images/album_img/Joanna .jpg" width="120" height="90"></a></div>
        			<div class="hot_item_content"><a href="albumAc!getAlbum?albId=177&userId=<s:property value="#session.user.id"/>"><font style="font-family: 微软雅黑;">Joanna & 王若琳</font></a></div></div>
        		<div class="hot_item">
        			<div class="hot_item_image"><a href="albumAc!getAlbum?albId=224&userId=<s:property value="#session.user.id"/>"><img src="images/album_img/u=2242476380,1567702387&fm=0&gp=0.jpg" width="120" height="90"></a></div>
        			<div class="hot_item_content"><a href="albumAc!getAlbum?albId=224&userId=<s:property value="#session.user.id"/>"><font style="font-family: 微软雅黑;">不得不在乎-SARA</font></a></div></div>
        		<div class="hot_item">
        			<div class="hot_item_image"><a href="albumAc!getAlbum?albId=270&userId=<s:property value="#session.user.id"/>"><img src="images/album_img/14_101011132730_1.jpg" width="120" height="90"></a></div>
        			<div class="hot_item_content"><a href="albumAc!getAlbum?albId=270&userId=<s:property value="#session.user.id"/>"><font style="font-family: 微软雅黑;">The Fame -Lady Gaga</font></a></div></div>
        		<div class="hot_item">
        			<div class="hot_item_image"><a href="albumAc!getAlbum?albId=280&userId=<s:property value="#session.user.id"/>"><img src="images/album_img/3569_a.jpg" width="120" height="90"></a></div>
        			<div class="hot_item_content"><a href="albumAc!getAlbum?albId=280&userId=<s:property value="#session.user.id"/>"><font style="font-family: 微软雅黑;">You Raise Me Up EP-西城男孩</font></a></div></div></td></tr>
        			<tr><td height=60>a</td></tr>
        			<tr><td><span><h2><font color="AACDED">网友专辑推荐</font></h2></span></td></tr>
        	<tr><td>	<div class="hot_item">
        			<div class="hot_item_image"><a href="albumAc!getAlbum?albId=126&userId=<s:property value="#session.user.id"/>"><img src="images/album_img/taipingshengshi.jpg" width="120" height="90"></a></div>
        			<div class="hot_item_content"><a href="albumAc!getAlbum?albId=126&userId=<s:property value="#session.user.id"/>"><font style="font-family: 微软雅黑;">太平盛世-陶喆</font></a></div></div>
        		<div class="hot_item">
        			<div class="hot_item_image"><a href="albumAc!getAlbum?albId=28&userId=<s:property value="#session.user.id"/>"><img src="images/album_img/kewang.jpg" width="120" height="90"></a></div>
        			<div class="hot_item_content"><a href="albumAc!getAlbum?albId=28&userId=<s:property value="#session.user.id"/>"><font style="font-family: 微软雅黑;">渴望-毛阿敏</font></a></div></div>
        		<div class="hot_item">
        			<div class="hot_item_image"><a href="albumAc!getAlbum?albId=264&userId=<s:property value="#session.user.id"/>"><img src="images/album_img/Folder.jpg" width="120" height="90"></a></div>
        			<div class="hot_item_content"><a href="albumAc!getAlbum?albId=264&userId=<s:property value="#session.user.id"/>"><font style="font-family: 微软雅黑;">Alice (Single)-艾薇儿</font></a></div></div>
        		<div class="hot_item">
        			<div class="hot_item_image"><a href="albumAc!getAlbum?albId=255&userId=<s:property value="#session.user.id"/>"><img src="images/album_img/20101119131148640.jpg" width="120" height="90"></a></div>
        			<div class="hot_item_content"><a href="albumAc!getAlbum?albId=255&userId=<s:property value="#session.user.id"/>"><font style="font-family: 微软雅黑;">血洗舞池-迈克尔杰克逊</font></a></div></div></td></tr>
        	<tr><td>	<div class="hot_item">
        			<div class="hot_item_image"><a href="albumAc!getAlbum?albId=102&userId=<s:property value="#session.user.id"/>"><img src="images/album_img/Taste The Atmosphere.jpg" width="120" height="90"></a></div>
        			<div class="hot_item_content"><a href="albumAc!getAlbum?albId=102&userId=<s:property value="#session.user.id"/>"><font style="font-family: 微软雅黑;">Taste The Atmosphere EP-陈奕迅</font></a></div></div>
        		<div class="hot_item">
        			<div class="hot_item_image"><a href="albumAc!getAlbum?albId=33&userId=<s:property value="#session.user.id"/>"><img src="images/album_img/tahetamen.jpg" width="120" height="90"></a></div>
        			<div class="hot_item_content"><a href="albumAc!getAlbum?albId=33&userId=<s:property value="#session.user.id"/>"><font style="font-family: 微软雅黑;">她和她们-孙悦</font></a></div></div>
        		<div class="hot_item">
        			<div class="hot_item_image"><a href="albumAc!getAlbum?albId=213&userId=<s:property value="#session.user.id"/>"><img src="images/album_img/rain_er_a.jpg" width="120" height="90"></a></div>
        			<div class="hot_item_content"><a href="albumAc!getAlbum?albId=213&userId=<s:property value="#session.user.id"/>"><font style="font-family: 微软雅黑;">Vol.1-First Drop-RAIN</font></a></div></div>
        		<div class="hot_item">
        			<div class="hot_item_image"><a href="albumAc!getAlbum?albId=198&userId=<s:property value="#session.user.id"/>"><img src="images/album_img/tingbudao.jpg" width="120" height="90"></a></div>
        			<div class="hot_item_content"><a href="albumAc!getAlbum?albId=198&userId=<s:property value="#session.user.id"/>"><font style="font-family: 微软雅黑;">听不到 EP-五月天</font></a></div></div>  </td></tr>
         </table>
        	  </div>
        	</div>
        	
        	
        	
        	<div id="down_right">
        		<span >	<h2><font style="font-family: 微软雅黑; color: #AACDED;">热门音乐</font></h2></span>
        		<object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000"  width="300" height="400" id="mp3player"
						codebase="http://fpdownload.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=8,0,0,0" >
					<param name="movie" value="flash/mp3player.swf?config=config_1.xml&file=playlist_1.xml" />
					<param nam="allowScriptAccess" value="always">
					<embed src="flash/mp3player.swf?config=config_1.xml&file=playlist_1.xml" allowScriptAccess="always" width="300" height="200" name="mp3player"
						type="application/x-shockwave-flash" pluginspage="http://www.macromedia.com/go/getflashplayer" />
				</object>
        </div>
        	</div>
        	
        	
        	
        	
        		 <div id="line">
         <hr color="#999999" size="2"/>
        </div>
        		
        		
       <div id="third">
        <div id="third-left">
        	<span >	<h2><font style="font-family: 微软雅黑; color: #AACDED;">热门视频</font></h2></span>
        	<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000"
				codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=6,0,29,0"
				width="550" height="400" 
				>
				<param name="movie"
					value="flash/vcastr.swf?vcastr_xml_url=vcastr.xml">
				<param name="quality" value="high">
				<embed
					src="flash/vcastr.swf?vcastr_xml_url=vcastr.xml"
					quality="high"
					pluginspage="http://www.macromedia.com/go/getflashplayer"
					type="application/x-shockwave-flash" width="480" height="233"></embed>
			</object>
			</div>
        	<div id="third-right">
        	
        	
        	<div id="rank_artist" style="font-family: 微软雅黑; color: #ffffff;">
        		
        			<span >	<h2><font style="font-family: 微软雅黑; color: #AACDED;">热门歌手</font></h2></span>
        			<table>
        				<tr><td>
        			<ul id="rank_artist_left" type="disc">
        				<li style="width: 100px;"><a href="albumAc!getArtistAlbums?artId=24">张韶涵</a></li>
        				<li><a href="albumAc!getArtistAlbums?artId=1">胡彦斌</a></li>
        				<li><a href="albumAc!getArtistAlbums?artId=2">老狼</a></li>
        				<li><a href="albumAc!getArtistAlbums?artId=3">孙楠</a></li>
        				<li><a href="albumAc!getArtistAlbums?artId=4">汪峰</a></li>
        				<li><a href="albumAc!getArtistAlbums?artId=5">许嵩</a></li>
        				<li><a href="albumAc!getArtistAlbums?artId=6">许巍</a></li>
        				<li><a href="albumAc!getArtistAlbums?artId=7">郑源</a></li>
        				<li><a href="albumAc!getArtistAlbums?artId=9">李宇春</a></li>
        				<li><a href="albumAc!getArtistAlbums?artId=13">张靓颖</a></li>
        				<li><a href="albumAc!getArtistAlbums?artId=14">周笔畅</a></li>
        			</ul></td>
        				<td>
        			<ul>	
        				<li><a href="albumAc!getArtistAlbums?artId=15">陈奕迅</a></li>
        				<li><a href="albumAc!getArtistAlbums?artId=17">刘德华</a></li>
        				<li><a href="albumAc!getArtistAlbums?artId=21">张学友</a></li>
        				<li><a href="albumAc!getArtistAlbums?artId=22">周传雄</a></li>
        				<li><a href="albumAc!getArtistAlbums?artId=23">周杰伦</a></li>
        				<li><a href="albumAc!getArtistAlbums?artId=26">梁静茹</a></li>
        				<li><a href="albumAc!getArtistAlbums?artId=27">孙燕姿</a></li>
        				<li><a href="albumAc!getArtistAlbums?artId=31">羽泉</a></li>
        				<li><a href="albumAc!getArtistAlbums?artId=35">五月天</a></li>
        				<li><a href="albumAc!getArtistAlbums?artId=37">苏打绿</a></li>
        				<li><a href="albumAc!getArtistAlbums?artId=38">久石让</a></li>
        			</ul></td></tr></table>
        	</div>
        	</div>
        	
        </div>
        	
        	<div align="center">
			
        </div>
    </div>
    
    
    
    

    <div id="footer">
    <div>


</div>
      
<div class="w" id="footer">
	<div class="flinks"><a href="http://www.360buy.com/intro/about.aspx" target="_blank">关于我们</a>|<a href="http://www.360buy.com/contact/" target="_blank">联系我们</a>|<a href="http://www.360buy.com/intro/job.aspx" target="_blank">人才招聘</a>|<a href="http://www.qianxun.com/" target="_blank">千寻网</a>|<a href="http://www.360buy.com/contact/joinin.aspx" target="_blank">商家入驻</a>|<a href="http://www.360buy.com/intro/service.aspx" target="_blank">广告服务</a>|<a href="http://app.360buy.com/" target="_blank">移动终端</a>|<a href="http://club.360buy.com/links.aspx" target="_blank">友情链接</a>|<a href="http://cps.360buy.com/" target="_blank">销售联盟</a></div>
	<div class="copyright"><font color="#ffffff">天津市南开区公安分局备案编号：1101081681&nbsp;&nbsp;津ICP证070359号&nbsp;&nbsp;<a href="http://misc.360buyimg.com/skin/df/i/com/f_music.jpg" target="_blank">音像制品经营许可证南开大学批5 号</a>&nbsp;&nbsp;互联网信息服务资格证编号:(津)-经营性-2011-0034</font>
<br><font color="#ffffff">Copyright&copy;2011-08&nbsp;&nbsp;MUSIC++&nbsp;版权所有</font></div>
	
    </div></div>

  </body>
</html>
