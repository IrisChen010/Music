/**
 * 
 */
charset="utf-8";

//function checkname()
//{ 
//	
//	var name = document.frm.realName.value;
//
//	if(name===""){
//		
//		alert("请输入姓名!" );
//	}
//		
//	
//}
//function checkphone()
//{
//	var phone=document.frm.phone;
//	if(phone==""||phone.value.length!=11)
//		alert("请输入正确的手机号码，以方便您获得最新的情况！");
//	}
//
////function checkName() {
////	
////	var flag = document.getElementById("check").value;
////	if(!flag) {
////		alert("抱歉，此用户名已经被占用！");
////	}
////	
////}
//
//function checkpwd()
//{
//	var pwd=document.frm.pwd;
//	var repwd=document.frm.repassword;
//	if(pwd!=repwd)
//		alert("两次密码输入不相同，请重新输入");
//}

var xhr ;

function send() {

	//获取Name
	var name = document.frm.nickName.value;
	

	//创建异步交互对象！
	xhr =  new XMLHttpRequest();
	//指定和服务器交互的方式以及路径！ 
	xhr.open("get" , "http://localhost:8080/Music++/servlet/AjaxServlet?name="+name , true );
	//指定回调函数！
	xhr.onreadystatechange = display ; //函数的引用！
	//发送数据，开始交互
	xhr.send();

}

//提示能否使用此用户名的函数
function display() {
	//服务器端已经成功交互，并且成功返回数据的时候！
	if(xhr.readyState == 4 && xhr.status == 200 ) {
		var res = xhr.responseText;   //获取服务器端传回的数据。   
		var resp = eval("("+res+")");
		//获取显示的层
		var result = document.getElementById("result");
		if(resp) {
			result.innerHTML = "此用户名已经被占用！";
		}else {
			result.innerHTML ="赶快注册吧！";
		}
	}
	
}
function checkAll()
{
	var name = document.frm.nickName.value;
	var phone=document.frm.phone.value;
	var pwd=document.frm.pwd.value;
	var repwd=document.frm.repassword.value;
	var gender=document.frm.gender.value;
	var upload=document.frm.upload.value;
	var address=document.frm.address.value;
	var postNum=document.frm.postNum.value;
	var email=document.frm.email.valuel;
	if(name=="")
		{
		alert("Please enter your nickName to login!");
		return false;
		}
		else if(pwd!=repwd)
			{
			alert("Please enter the same password！");
			return false;
			}
		else if(gender=="")
			{
			alert("Please choose your gender！");
			return false;
			}
		else if(upload=="")
			{
		alert("Are you sure not to upload your image?");
		return false;
			}
		else if(phone==""||phone.length!=11)
			{
			alert("Please enter your right cellphone number！");
			return false;
			}
		else if(postNum=="")
			{
			alert("Pleasr enter the postNum！");
			return false;
			}
		else if(address=="")
			{
			alert("Please enter your address to get the goods！");
			return false;
			}
		else if(email=="")
			{
			alert("please enter the email!")
			return false;
			}
		return true;
			
}
