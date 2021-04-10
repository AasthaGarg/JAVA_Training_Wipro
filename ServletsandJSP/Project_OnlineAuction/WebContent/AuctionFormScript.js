function validation(){
	var item_id=document.myform1.iid.value;
	var item_name=document.myform1.iname.value;
	var user_name=document.myform1.uname.value;
	var email=document.myform1.email.value;
	var amt=document.myform1.amount.value;
	
	if(!item_id){
		document.getElementById("miss2").innerText="Required Field! ";
		document.getElementById("miss2").style.color="red";
		document.getElementById("miss1").innerText="Require Data Missing!";
		document.getElementById("miss1").style.color="red";
		msg.textContent="Enter and Resubmit";
		return false;
	}
	
	if(item_name==""||item_name==null){
		document.getElementById("miss3").innerText="Required Field! ";
		document.getElementById("miss3").style.color="red";
		document.getElementByID("miss1").innerText="Require Data Missing!";
		document.getElementByID("miss1").style.color="red";
		document.getElementByID("msg").innerText="Enter and Resubmit";
		return false;
	}
	
	if(user_name==""||user_name==null){
		document.getElementById("miss4").innerHTML="Required Field! ";
		document.getElementById("miss4").style.color="red";
		document.getElementByID("miss1").innerHTML="Require Data Missing!";
		document.getElementByID("miss1").style.color="red";
		document.getElementByID("msg").innerHTML="Enter and Resubmit";
		return false;
	}
	
	if(email==""||email==null){
		document.getElementById("miss5").innerHTML="Required Field! ";
		document.getElementById("miss5").style.color="red";
		document.getElementByID("miss1").innerHTML="Require Data Missing!";
		document.getElementByID("miss1").style.color="red";
		document.getElementByID("msg").innerHTML="Enter and Resubmit";
		return false;
	}
	
	if(!amt){
		document.getElementById("miss6").innerHTML="Required Field! ";
		document.getElementById("miss6").style.color="red";
		document.getElementByID("miss1").innerHTML="Require Data Missing!";
		document.getElementByID("miss1").style.color="red";
		document.getElementByID("msg").innerHTML="Enter and Resubmit";
		return false;
	}
	return true;
	
}