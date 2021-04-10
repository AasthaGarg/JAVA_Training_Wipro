function loginValidation(){
	var id=document.myform.uid.value;
	
	if(id.length<4 || id.length>8){
		alert("Length of user id must be within 4-8 characters");
		return false;
	}
	var password=document.myform.pwd.value;
	var pattern=/(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}/;
	if(!pattern.test(password)){
		alert("Password pattern not matching");
		return false;
	}
	var date=document.myform.dob.value;
	var date_pattern=/^[0-9]{2}[\/][0-9]{2}[\/][0-9]{4}$/;
	if(!date_pattern.test(date)){
		alert("DOB pattern mm/dd/yyyy not matching");
		return false;
	}
	var mydate=new Date(date);
	var today=new Date();
	if(mydate>=today){
		alert("DOB must be less than today's date");
		return false;
	}
	var num=document.myform.num.value;
	var numlen=String.valueOf(num).length();
	if(numlen!=10){
		alert("Contact number must be of length 10");
		return false;
	}
	
	return true;
}