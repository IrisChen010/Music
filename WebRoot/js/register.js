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
//		alert("����������!" );
//	}
//		
//	
//}
//function checkphone()
//{
//	var phone=document.frm.phone;
//	if(phone==""||phone.value.length!=11)
//		alert("��������ȷ���ֻ����룬�Է�����������µ������");
//	}
//
////function checkName() {
////	
////	var flag = document.getElementById("check").value;
////	if(!flag) {
////		alert("��Ǹ�����û����Ѿ���ռ�ã�");
////	}
////	
////}
//
//function checkpwd()
//{
//	var pwd=document.frm.pwd;
//	var repwd=document.frm.repassword;
//	if(pwd!=repwd)
//		alert("�����������벻��ͬ������������");
//}

var xhr ;

function send() {

	//��ȡName
	var name = document.frm.nickName.value;
	

	//�����첽��������
	xhr =  new XMLHttpRequest();
	//ָ���ͷ����������ķ�ʽ�Լ�·���� 
	xhr.open("get" , "http://localhost:8080/Music++/servlet/AjaxServlet?name="+name , true );
	//ָ���ص�������
	xhr.onreadystatechange = display ; //���������ã�
	//�������ݣ���ʼ����
	xhr.send();

}

//��ʾ�ܷ�ʹ�ô��û����ĺ���
function display() {
	//���������Ѿ��ɹ����������ҳɹ��������ݵ�ʱ��
	if(xhr.readyState == 4 && xhr.status == 200 ) {
		var res = xhr.responseText;   //��ȡ�������˴��ص����ݡ�   
		var resp = eval("("+res+")");
		//��ȡ��ʾ�Ĳ�
		var result = document.getElementById("result");
		if(resp) {
			result.innerHTML = "���û����Ѿ���ռ�ã�";
		}else {
			result.innerHTML ="�Ͽ�ע��ɣ�";
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
			alert("Please enter the same password��");
			return false;
			}
		else if(gender=="")
			{
			alert("Please choose your gender��");
			return false;
			}
		else if(upload=="")
			{
		alert("Are you sure not to upload your image?");
		return false;
			}
		else if(phone==""||phone.length!=11)
			{
			alert("Please enter your right cellphone number��");
			return false;
			}
		else if(postNum=="")
			{
			alert("Pleasr enter the postNum��");
			return false;
			}
		else if(address=="")
			{
			alert("Please enter your address to get the goods��");
			return false;
			}
		else if(email=="")
			{
			alert("please enter the email!")
			return false;
			}
		return true;
			
}
