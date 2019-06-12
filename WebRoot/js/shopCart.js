/**
 * 
 */

function $(e){
	return document.getElementById(e);
}

var xhr;
function createXHR() {
	return  new XMLHttpRequest();
}

function reduce(scId, index, price) {
	var numId = "number" + index;
	
	var number =$(numId).value;
	number = parseInt(number)-1;
	$(numId).value = number;
	
	var sum = parseFloat($('sum').value);
	sum -= parseFloat(price);
	$('sum').value = sum;
	
	xhr = createXHR();
	url = "shopCartAc!reduceNum.action?scId=" + scId;
	xhr.open("post" , url, true);
	xhr.onreadystatechange = handle;
	xhr.send();
}

function add(scId, index, price) {
	var numId = "number" + index;
	
	var number=$(numId).value;
	number=parseInt(number)+1;
	$(numId).value=number;
	
	var sum = parseInt($('sum').value);
	sum += parseInt(price);
	$('sum').value = sum;
	
	xhr = createXHR();
	url = "shopCartAc!addNum.action?scId=" + scId;
	xhr.open("post" , url, true);
	xhr.onreadystatechange = handle;
	xhr.send();
}

function change(scId, index, price, pNum) {
	var numId = "number" + index;

	var number=parseInt($(numId).value);
	
	sub = number - pNum;
	var sum = parseFloat($('sum').value);
	sum += price * sub;
	$('sum').value = sum;
	
	xhr = createXHR();
	url = "shopCartAc!changeNum.action?scId=" + scId;
	url = url +"&" +"num=" +number;
	xhr.open("post" , url, true);
	xhr.onreadystatechange = handle;
	xhr.send();
}

//»Øµ÷º¯Êı
function handle() {
}





















//function $(e){
//return document.getElementById(e);
//}
//function add(){
//	var sl=$('number').value;
//		sl=parseInt(sl)+1;
//		$('number').value=sl;
//		$('sum').innerHTML=sl*150;
//}
//function reduce(){
//	var sl=$('number').value;
//		if (sl>1){
//			sl=parseInt(sl)-1;
//		}
//		$('number').value=sl;
//		$('sum').innerHTML=sl*150;
//}
//function abc(){
//	var sl=$('number').value;
//		if (sl>0){
//			sl=parseInt(sl);
//		}else{
//			sl=0;
//		}
//		$('number').value=sl;
//		$('sum').innerHTML=sl*150;
//}