/**
 * 
 */
function changeValidateCode(obj) {
		//获取当前的时间作为参数，无具体意义   
		var timenow = new Date().getTime();
		//每次请求需要一个不同的参数，否则可能会返回同样的验证码，
		//因为如果每次请求路径都是同样的，浏览器会从缓存中获取数据。
		//这和浏览器的缓存机制有关系，也可以把页面设置为不缓存，这样就不用这个参数了。   
		obj.src = "randAc.action?d=" + timenow;
	}