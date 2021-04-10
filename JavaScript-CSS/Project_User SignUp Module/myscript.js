window.onload=function(){
	setTimeout(function(){alert("3 mins past");},180000);
};
function getTimeAndDate(){
	var today=new Date();
	var date=today.getFullYear()+"-"+today.getMonth()+"-"+today.getDay();
	var time=today.getHours()+":"+today.getMinutes()+":"+today.getSeconds();
	var datetime=date+" "+time;
	setTimeout("getTimeAndDate()",1000);
	document.getElementById('span1').innerHTML=datetime;
}
function validationform(){
	var fname=document.myform.fname.value;
	if(fname==''||fname==null){
		document.getElementById('fname').focus();
		alert("Please enter First Name");
		return false;
	}
	var lname=document.myform.lname.value;
	if(lname==''||lname==null){
		document.getElementById('lname').focus();
		alert("Please enter Last Name");
		return false;
	}
	var pwd=document.myform.pwd.value;
	if(pwd==''||pwd==null){
		document.getElementById('pwd').focus();
		alert("Password must be entered");
		return false;
	}
	if(pwd.length<6 || pwd.length>20){
		document.getElementById('pwd').focus();
		alert("Password must be within 6 to 20 characters");
		return false;
	}
	var cpwd=document.myform.cpwd.value;
	if(cpwd==''||cpwd==null){
		document.getElementById('cpwd').focus();
		alert("Confirm Password must be entered");
		return false;
	}
	if(cpwd!=pwd){
		document.getElementById('cpwd').focus();
		alert("Confirm password not match password");
		return false;
	}
	var num=document.myform.mnum.value;
	var pattern1=/[0-9]{3}-[0-9]{3}-[0-9]{4}/;
	var pattern2=/[0-9]{3} [0-9]{3} [0-9]{4}/;
	var pattern3=/[0-9]{3}.[0-9]{3}.[0-9]{4}/;
	var flag=0;
	if(num==''||num==null){
		document.getElementById('mnum').focus();
		alert("Mobile number must be entered");
	}
	if(pattern1.test(num) || pattern2.test(num) || pattern3.test(num)){
		flag=1;
	}
	if(flag==0){
		document.getElementById('mnum').focus();
		alert(" Mobile no pattern not matching");
		return false;
	}
	var dob=document.myform.dob.value;
	if(dob==''||dob==null){
		document.getElementById('dob').focus();
		alert("Dob must be entered");
		return false;
	}
	var pattern=/\d{2}-\d{2}-\d{4}/ ;
	if(!pattern.test(dob)){
		document.getElementById('dob').focus();
		alert("Dob pattern not matching");
		return false;
	}
	var email=document.myform.email.value;
	if(email==''||email==null){
		document.getElementById('email').focus();
		alert("Email must be entered");
		return false;
	}
	var pattern4=/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
	if(!pattern4.test(email)){
		document.getElementById('email').focus();
		alert("Email pattern not matching");
		return false;
	}
	return true;
}