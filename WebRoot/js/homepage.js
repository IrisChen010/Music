/**
 * 
 */
var roll_image = new Array;
var image_link = new Array;
var small_img = new Array;

roll_image[0] = 'images/qinbujin.jpg';
image_link[0] = 'albumAc!getAlbum?albId=143';
small_img[0] = 'images/main_flash_button1_on.gif';

roll_image[1] = 'images/shuidonglewodeqinxian.jpg';
image_link[1] = 'albumAc!getAlbum?albId=36';
small_img[1] = 'images/main_flash_button2_on.gif';

roll_image[2] = 'images/ruguonishiwodechuanshuo.jpg';
image_link[2] = 'albumAc!getAlbum?albId=120';
small_img[2] = 'images/main_flash_button3_on.gif';

roll_image[3] = 'images/yanweidie.jpg';
image_link[3] = 'albumAc!getAlbum?albId=166';
small_img[3] = 'images/main_flash_button4_on.gif';

roll_image[4] = 'images/shibabanwuyi.jpg';
image_link[4] = 'albumAc!getAlbum?albId=127';
small_img[4] = 'images/main_flash_button5_on.gif';

roll_image[5] = 'images/Goodbye & Hello.jpg';
image_link[5] = 'albumAc!getAlbum?albId=163';
small_img[5] = 'images/main_flash_button6_on.gif';

roll_image[6] = 'images/shangwuloudekuaihuo.jpg';
image_link[6] = 'albumAc!getAlbum?albId=105';
small_img[6] = 'images/main_flash_button7_on.gif';

var cliImg = '';
var cliImgSrc = '';
var imgNo = Math.round(Math.random() * 7);

var interval = 3000;
var setTime = '';

function click_simg(ci, no) {
	var pImg = document.all.bigimg;
	var pLink = document.all.imglink;

	if (cliImg == '') {
		cliImg = ci;
		cliImgSrc = ci.src;
		ci.src = small_img[no];
		imgNo = no;
		pImg.src = roll_image[no];
		pLink.href = image_link[no];
	} else if (cliImg != ci) {
		cliImg.src = cliImgSrc;
		cliImg = ci;
		cliImgSrc = ci.src;
		ci.src = small_img[no];
		imgNo = no;
		pImg.src = roll_image[no];
		pLink.href = image_link[no];
	}
	clearTimeout(setTime);
	setTime = setTimeout("rotate()", interval);
}

function rotate() {
	imgNo = (imgNo >= 6) ? 0 : imgNo + 1;
	var ci = eval('document.all.num_img' + imgNo);

	document.all.bigimg.filters.blendTrans.apply();
	document.all.imglink.href = image_link[imgNo];
	document.all.bigimg.src = roll_image[imgNo];
	document.all.bigimg.filters.blendTrans.play();

	if (cliImg == '') {
		cliImg = ci;
		cliImgSrc = ci.src;
		ci.src = small_img[imgNo];
	} else if (cliImg != ci) {
		cliImg.src = cliImgSrc;
		cliImg = ci;
		cliImgSrc = ci.src;
		ci.src = small_img[imgNo];
	}

	setTime = setTimeout("rotate()", interval);
}