<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<script>
function checkPass(){
	var pass=document.regForm.password;
	if(pass.length!=6){
		alert("Password must be of exact 6 characters");
		return false;
	}
	return true;
}
</script>
</head>
<body>
<h2 align="center">Registration form</h2>
	<form:form id="regForm" modelAttribute="user" action="registerProcess"
		method="post">

		<table align="center">
			<tr>
				<td><form:label path="username">Username</form:label></td>
				<td><form:input path="username" name="username" id="username" required="true"/></td>
			</tr>
			<tr>
				<td><form:label path="password">Password</form:label></td>
				<td><form:password path="password" name="password" onkeyup="return checkPass()" id="password" required="true"/></td>
			</tr>
			<tr>
				<td><form:label path="empname">Employee Name</form:label></td>
				<td><form:input path="empname" name="empname" id="empname" required="true"/></td>
			</tr>
			<tr>
				<td><form:label path="empno">Employee Number</form:label></td>
				<td><form:input path="empno" name="empno" id="empno" required="true"/></td>
			</tr>
			<tr>
				<td><form:label path="email">Email</form:label></td>
				<td><form:input path="email" name="email" id="email" required="true"/></td>
			</tr>

			<tr>
				<td></td>
				<td><form:button id="register" name="register">Register</form:button></td>
			</tr>
			<tr></tr>
			<tr>
				<td></td>
				<td><a href="index.jsp">Home</a></td>
			</tr>
		</table>
	</form:form>
</body>
</html>