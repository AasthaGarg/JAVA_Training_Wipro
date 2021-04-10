function validation1(){
	var username=document.loginForm.uname.value;
	var password=document.loginForm.pwd.value;
	if(username==""|| password==""){
		alert("Username and Password both must be entered");
		return false;
	}
	return true;
}
function validation2(){
	
	var username=document.registerForm.uname.value;
	var password=document.registerForm.pwd.value;
	var passwordMatch=document.registerForm.pwd2.value;
	if(username==""){
		alert("Username must be entered");
		return false;
	}
	if(password==""){
		alert("Password must be entered");
		return false;
	}
	if(passwordMatch==""){
		alert("Re-type password must be entered");
		return false;
	}
	if(password!=passwordMatch){
		alert("Password and Re-type password must be same");
		return false;
	}
	return true;
}
function validation3(){
	var username=document.changePwdForm.uname.value;
	var password=document.changePwdForm.pwd.value;
	var newpassword=document.changePwdForm.pwd3.value;
	var passwordMatch=document.changePwdForm.pwd4.value;
	if(username==""){
		alert("Username must be entered");
		return false;
	}
	if(password==""){
		alert("Password must be entered");
		return false;
	}
	if(newpassword==""){
		alert("New password must be entered");
		return false;
	}
	if(passwordMatch==""){
		alert("Re-type new password must be entered");
		return false;
	}
	if(newpassword!=passwordMatch){
		alert("New password and Re-type password must be same");
		return false;
	}
	return true;
	
}
