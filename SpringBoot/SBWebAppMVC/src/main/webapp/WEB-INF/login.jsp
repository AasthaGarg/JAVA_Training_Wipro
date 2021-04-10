<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Login Form</title>
</head>
<body>
<form:form action="message" method="post" modelAttribute="user">
<table align="center">
			<tr>
				<td><form:label path="name">Name : </form:label></td>
				<td><form:input path="name" name="name" id="name" /></td>
			</tr>
			<tr>
				<td><form:label path="password">Password :</form:label></td>
				<td><form:password path="password" name="pwd"	id="pwd" /></td>
			</tr>
			<tr>
				<td></td>
				<td align="left"><form:button id="save" name="Login">Login</form:button></td>
			</tr>

			<tr></tr>
</table>
</form:form>
</body>
</html>