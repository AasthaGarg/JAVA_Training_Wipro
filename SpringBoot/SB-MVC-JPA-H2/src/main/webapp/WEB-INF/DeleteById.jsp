<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee CRUD</title>
</head>
<body>
<h1>Enter Id to Delete Record</h1>
<form:form action="DeleteEmployee">
Employee Id: <input type="text" name="eid" /><br>
<input type="submit" value="Delete Employee">
</form:form>
<a href="home">Home Page</a>
</body>
</html>