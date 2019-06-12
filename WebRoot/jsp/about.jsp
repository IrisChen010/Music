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

	<link rel="stylesheet" type="text/css" href="css/about.css" charset="utf-8">

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
        
        <center><h2>欢迎注册Music++网站！请认真阅读以下内容，方便我们为您提供更好的服务，谢谢！</h2></center>
        <div id="content" style="font-family: 微软雅黑; width: 80%; margin-left: 12%;">
        	
<h3> 一、本站服务条款的确认和接纳</h3>
<p>本站的各项电子服务的所有权和运作权归本站。本站提供的服务将完全按照其发布的服务条款和操作规则严格执行。用户同意所有服务条款并完成注册程序，才能成为本站的正式用户。用户确认：本协议条款是处理双方权利义务的约定，除非违反国家强制性法律，否则始终有效。在下订单的同时，您也同时承认了您拥有购买这些产品的权利能力和行为能力，并且将您对您在订单中提供的所有信息的真实性负责。</p>

<h3>二、服务简介</h3>
<p>本站运用自己的操作系统通过国际互联网络为用户提供网络服务。同时，用户必须：</p>
  <ul type="disc">
			<li>自行配备上网的所需设备，包括个人电脑、调制解调器或其它必备上网装置。</li> 
             <li>自行负担个人上网所支付的与此服务有关的电话费用、网络费用。</li>
  </ul> 
	<p>基于本站所提供的网络服务的重要性，用户应同意</p>
	<ul>
			<li>提供详尽、准确的个人资料。</li> 
			<li>不断更新注册资料，符合及时、详尽、准确的要求。</li>
	</ul> 
 	<p>本站保证不公开用户的真实姓名、地址、电子邮箱和联系电话等用户信息， 除以下情况外：</p>
		<ul>
			<li>用户授权本站透露这些信息。</li> 
			<li>相应的法律及程序要求本站提供用户的个人资料。 </li>
		</ul>
<h3>三、价格和数量</h3>
<p>本站将尽最大努力保证您所购商品与网站上公布的价格一致。</p>

<p>产品的价格和可获性都在本站上指明，这类信息将随时更改。</p>

<p>您所订购的商品，如果发生缺货，您有权取消定单。</p>

 <h3>四、送货</h3>
 <p>本站将会把产品送到您所指定的送货地址。所有在本站上列出的送货时间为参考时间，参考时间的计算是根据库存状况、正常的处理过程和送货时间、送货地点的基础上估计得出的。</p>

 <p>请清楚准确地填写您的真实姓名、送货地址及联系方式。因如下情况造成订单延迟或无法配送等，本站将无法承担迟延配送的责任：</p>
<ul>
         	<li>客户提供错误信息和不详细的地址；</li>
   			<li>货物送达无人签收，由此造成的重复配送所产生的费用及相关的后果。 </li>
			<li>不可抗力，例如：自然灾害、交通戒严、突发战争等。</li> 
</ul>
<h3>五、服务条款的修改</h3>
<p>本站将可能不定期的修改本用户协议的有关条款，一旦条款及服务内容产生变动，本站将会在重要页面上提示修改内容。</p>

<h3>六、用户隐私制度</h3>
<p>尊重用户个人隐私是本站的一项基本政策。所以，作为对以上第二条注册资料分析的补充，本站一定不会在未经合法用户授权时公开、编辑或透露其注册资料及保存在本站中的非公开内容。
</p>
<h3>七、用户的帐号，密码和安全性 </h3>
<p>用户一旦注册成功，成为本站的合法用户，将得到一个密码和用户名。您可随时根据指示改变您的密码。用户需谨慎合理的保存、使用用户名和密码。用户若发现任何非法使用用户帐号或存在安全漏洞的情况，请立即通知本站和向公安机关报案。
</p>
<h3>八、对用户信息的存储和限制</h3>
<p>如果用户违背了国家法律法规规定或本协议约定，本站有视具体情形中止或终止对其提供网络服务的权利。
</p>
<h3>九、用户管理 </h3>
<p>本协议依据国家相关法律法规规章制定，用户同意严格遵守以下条款：</p>
<ul>
			<li>从中国境内向外传输技术性资料时必须符合中国有关法规。 </li>
			<li>不利用本站从事非法活动。 </li>
			<li>不干扰或混乱网络服务。</li>
			<li>遵守所有使用网络服务的网络协议、规定、程序和惯例。 </li>
</ul>
<p>用户须承诺不传输任何违法犯罪的、骚扰性的、中伤他人的、辱骂性的、恐吓性的、伤害性的、庸俗的，淫秽的、不文明的等信息资料；不传输损害国家社会公共利益和涉及国家安全的信息资料；不传输教唆他人从事本条所述行为的信息资料。
</p>
<p>未经许可而非法进入其它电脑系统是禁止的。</p>

<p>若用户的行为不符合以上提到的服务条款，本站将作出独立判断立即取消用户服务帐号。用户需对自己在网上的行为承担法律责任。用户若在本站上散布和传播反动、色情或其它违反国家法律的信息，本站的系统记录有可能作为用户违反法律的证据。
</p>
<h3>十、通告</h3>
<p>所有发给用户的通告都可通过重要页面的公告或电子邮件或常规的信件传送。用户协议条款的修改、服务变更、或其它重要事件的通告都会以此形式进行。</p>

<h3>十一、网络服务内容的所有权</h3>
<p>本站定义的网络服务内容包括：文字、软件、声音、图片、录象、图表、广告中的全部内容；电子邮件的全部内容；本站为用户提供的其它信息。所有这些内容受版权、商标、标签和其它财产所有权法律的保护。所以，用户只能在本站和广告商授权下才能使用这些内容，而不能擅自复制、再造这些内容、或创造与内容有关的派生产品。本站所有的文章版权归原文作者和本站共同所有，任何人需要转载本站的文章，必须征得原文作者和本站授权。
</p>
<h3>十二、责任限制</h3>
<p>如因不可抗力或其它本站无法控制的原因使本站销售系统崩溃或无法正常使用导致网上交易无法完成或丢失有关的信息、记录等本站会尽可能合理地协助处理善后事宜，并尽最大努力使客户免受损失。
</p>
<h3>十三、法律管辖和适用</h3>
<p>本协议的订立、执行和解释及争议的解决均应适用中国法律。</p>

<p>如发生本站服务条款与中国法律相抵触时，则这些条款将完全按法律规定重新解释，而其它有效条款继续有效。</p>

<p>如双方就本协议内容或其执行发生任何争议，双方应尽力友好协商解决；协商不成时，任何一方均可向人民法院提起诉讼。</p>
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
	
    </div></div>
  </body>
</html>

