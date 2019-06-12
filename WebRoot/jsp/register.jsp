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

	<link rel="stylesheet" type="text/css" href="css/register.css" charset="utf-8">
	<script type="text/javascript" src="js/register.js" charset="utf-8"></script>

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
            			<s:submit method="showAlbumsBySearch" type="image" src="%{searchImage}" theme="simple"></s:submit></span>
            			</p>
            		</s:form>
            </div>
        </div>
        
        <div id="content">
        	<s:form action="regAc" name="frm" enctype ="multipart/form-data" onsubmit="return checkAll()">
        	<input type="hidden"  id="check"  value="${check }" />
		        <div id="register">
		  		  <div align="center" id="reginfo" title="注册">
		  		  <table>
		  		  <tr><td>
		  		  <table align="center" border="0" style="margin-left:15%; border-right:solid 1px #CCC" width="90%">
		  		  	<tr><s:textfield name="realName" id="realName" onblur="checkname()" label="姓名"></s:textfield></tr>
		  		  	<tr><s:textfield name="nickName" id="nickName" label="昵称"></s:textfield><span id="result"></span></tr>
		  		  	<tr><s:radio list="#{0:'女',1:'男' }" name="gender" label="性别"></s:radio></tr>
		  		  	<tr> <s:password name="pwd" id="pwd" label="密码"></s:password> </tr>
		  		    <tr><s:password  name="repassword" id="repassword"  label="重输密码"></s:password></tr>
		  		    <tr> <s:file name ="upload" label="头像" value="浏览"/>  </tr>
		  		    <tr><s:set name="area" value="#{'请选择省份':{'请选择城市'},
		                    '北京':{'北京'},
		                     '天津':{'天津'},
		                     '河北':{'石家庄','唐山','秦皇岛','邯郸','邢台','保定','张家口','承德','沧州','廊坊','衡水'},
		                     '山西':{'太原','大同','阳泉','长治','晋城','朔州','晋中','运城','忻州','临汾','吕梁'},
		                     '内蒙古自制区':{'呼和浩特','包头','乌海','赤峰','通辽','鄂尔多斯','呼伦贝尔','巴彦淖尔','乌兰察布','兴安盟','锡林郭勒盟','阿拉善盟'},
		                     '辽宁':{'沈阳','大连','鞍山','抚顺','本溪','丹东','锦州','营口','阜新','辽阳','盘锦','铁岭','朝阳','葫芦岛'},
		                     '吉林':{'长春','吉林','四平','辽源','通化','白山','松原','白城','延边朝鲜族自治州'},
		                     '黑龙江':{'哈尔滨','齐齐哈尔','鸡西','鹤岗','双鸭山','大庆','伊春','佳木斯','七台河','牡丹江','黑河','绥化','大兴安岭地区'},
		                     '上海':{'上海'},
		                     '江苏':{'南京','无锡','徐州','常州','苏州','南通','连云港','淮安','盐城','扬州','镇江','泰州','宿迁'},
		                     '浙江':{'杭州','宁波','温州','嘉兴','湖州','绍兴','金华','衢州','舟山','台州','丽水'},
		                     '安徽':{'合肥','芜湖','蚌埠','淮南','马鞍山','淮北','铜陵','安庆','黄山','滁州','阜阳','宿州','巢湖','六安','亳州','池州','宣城'},
		                     '福建':{'福州','厦门','莆田','三明','泉州','漳州','南平','龙岩','宁德'},
		                     '江西':{'南昌','景德镇','萍乡','九江','新余','鹰潭','赣州','吉安','宜春','抚州','上饶'},
		                     '山东':{'济南','青岛','淄博','枣庄','东营','烟台','潍坊','济宁','泰安','威海','日照','莱芜','临沂','德州','聊城','滨州','菏泽'},
		                     '河南':{'郑州','开封','洛阳','平顶山','安阳','鹤壁','新乡','焦作','濮阳','许昌','漯河','三门峡','南阳','商丘','信阳','周口','驻马店','济源'},
		                     '湖北':{'武汉','黄石','十堰','宜昌','襄樊','鄂州','荆门','孝感','荆州','黄冈','咸宁','随州','恩施土家族苗族自治州','省直辖县级行政单位'},
		                     '湖南':{'长沙','株洲','湘潭','衡阳','邵阳','岳阳','常德','张家界','益阳','郴州','永州','怀化','娄底','湘西土家族苗族自治州'},
		                     '广东':{'广州','韶关','深圳','珠海','汕头','佛山','江门','湛江','茂名','肇庆','惠州','梅州','汕尾',' 河源','阳江','清远','东莞','中山','潮州','揭阳','云浮'},
		                     '广西壮族自治区':{'南宁','柳州','桂林','梧州','北海','防城港','钦州','贵港','玉林','百色','贺州','河池','来宾','崇左'},
		                     '海南':{'海口','三亚','省直辖县级行政单位'},
		                     '重庆':{'重庆'},
		                     '四川':{'成都','自贡','攀枝花','德阳','绵阳','广元','遂宁','内江','乐山','南充','眉山','宜宾','广安 ','达州','雅安','巴中','资阳','阿坝藏族羌族自治州','甘孜藏族自治州','凉山彝族自治州'},
		                     '贵州':{'贵阳','六盘水','遵义','安顺','铜仁地区','黔西南布依族苗族自治州','毕节地区','黔东南苗族侗族自治州','黔南布依族苗族自治州','辽阳','盘锦','铁岭','朝阳','葫芦岛'},
		                     '云南':{'昆明','曲靖','玉溪','保山','昭通','丽江','普洱','临沧','楚雄彝族自治州','红河哈尼族彝族自治州','文山壮族苗族自治州','西双版纳傣族自治州','大理白族自治州','德宏傣族景颇族自治州','怒江傈僳族自治州','迪庆藏族自治州'},
		                    '西藏自治区':{'拉萨市','昌都地区','山南地区','日喀则地区','那曲地区','阿里地区','林芝地区'},
		                     '陕西':{'西安','铜川','宝鸡','咸阳','渭南','延安','汉中','榆林','安康','商洛'},
		                     '甘肃':{'兰州','嘉峪关','金昌','白银','天水','武威','张掖','平凉','酒泉','庆阳','定西','陇南','临夏回族自治州','甘南藏族自治州'},
		                     '青海':{'西宁市','海东地区','海北藏族自治州','黄南藏族自治州','海南藏族自治州','果洛藏族自治州','玉树藏族自治州','海西蒙古族藏族自治州'},
		                     '宁夏回族自治区':{'银川','石嘴山','吴忠','固原','中卫'},
		                     '新疆维吾尔自治区':{'乌鲁木齐','克拉玛依','吐鲁番地区','哈密地区','昌吉回族自治州','博尔塔拉蒙古自治州','巴音郭楞蒙古自治州','阿克苏地区','克孜勒苏柯尔克孜自治州','喀什地区','和田地区','伊犁哈萨克自治州','塔城地区','阿勒泰地区','自治区直辖县级行政区划'},
		                     '台湾':{'台北','高雄','基隆','台中','台南','新竹','嘉义'},
		                     '香港特别行政区':{'香港'},
		                     '澳门特别行政区':{'澳门'}
		                 }" />
		                 
		                 <s:doubleselect label="地域" list="#area.keySet()" name="province"
		                 	doubleName="city" formName="frm" doubleList="#area[top]" />
					</tr>
					<tr><s:textfield name="phone" id="phone"  label="联系电话"></s:textfield></tr>
					<tr><s:textfield name="postNum" label="邮政编码"></s:textfield></tr>
					<tr><s:textfield name="address" id="address" label="家庭住址"></s:textfield></tr>
					<tr><s:textfield name="email" id="email" label="E-mail"></s:textfield></tr>
					<tr><s:url id="btn_register" value="images/btn_register.jpg"></s:url>
						<s:submit type="image" src="%{btn_register}" method="addUser" style="margin-right: 70px; margin-top: 20px;"></s:submit></tr>
					</table></td>
					<td>
					<table style="margin-left: 15%" width="90%">
					<tr>
					<td><font color="#AACDED" face="华文行楷" size="5">本站服务宗旨：</font></td>
					</tr>
					<tr>
					<td><font color="#AACDED" face="华文行楷" size="4">&nbsp;&nbsp;&nbsp;拒绝盗版，倾心为您打造最正统最享受的音乐盛宴！</font></td>
					</tr>
					<tr>
					<td><font color="#AACDED" face="华文行楷" size="5">本站服务热线:</font></td>
					</tr>
					<tr>
					<td><font color="#AACDED" face="华文行楷" size="4">&nbsp;&nbsp;&nbsp;000-0000000,11111111111</font></td>
					</tr>
					<tr>
					<td><font color="#AACDED" face="华文行楷" size="5">本站相关注意事项:</font></td>
					</tr>
					<tr>
					<td colspan="1" width="250">
					<iframe src="jsp/AboutOurWeb.html"></iframe></td></tr>
					</table>
					</td>
					</tr>
					</table>
		  		</div>
		  		</div>
  		 	</s:form>
  		
  		
  		
  		</div>
  		
  		
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
