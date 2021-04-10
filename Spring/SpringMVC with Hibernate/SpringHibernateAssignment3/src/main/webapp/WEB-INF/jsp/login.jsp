<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body bgcolor="orange">
	<h2>Enter your Login Details</h2>
	<br>
	<form:form id="loginForm" modelAttribute="customer" action="loginProcess" method="post">
		<table>
			<tr>
				<td> <form:label path="customerid">Customer ID : </form:label></td>
				<td> <form:input path="customerid" /></td>
			</tr>
			<tr>
				<td><form:label path="password">Password :</form:label> </td>
				<td> <form:input path="password" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr>    
	          <td> </td>    
	          <td><input type="submit" value="Login" /></td>    
	         </tr>
		</table>
	</form:form>
</body>
</html>