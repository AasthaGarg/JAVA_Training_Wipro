
function loginValidation(){
var userName = document.myform.uname.value;
var password = document.myform.pwd.value;
if(userName==""||password==""){
alert("Fields can not be empty");
return false;
}
var pattern=/(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}/;
if(!pattern.test(password)){
	alert("Password pattern not matching");
	return false;
}
return true;

}
