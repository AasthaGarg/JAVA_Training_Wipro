<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Employee CRUD</title>
</head>
<body>
<h1>Add Employee</h1>
<form:form action="SaveEmployee">
Employee Id: <input type="text" name="eid" /><br>
Employee Name: <input type="text" name="ename" /><br>
Employee Salary: <input type="text" name="esalary" /><br>
<input type="submit" value="AddEmployee" />
</form:form>
<a href="home">Home Page</a> 
</body>
</html>