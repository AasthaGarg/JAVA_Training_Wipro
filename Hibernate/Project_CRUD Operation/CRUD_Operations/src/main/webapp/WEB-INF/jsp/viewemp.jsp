<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employees List</title>
</head>
<body>
	<h1>Employees List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Gender</th><th>Designation</th><th>Salary</th><th>City</th><th>Email Id</th><th>Mobile No</th></tr>  
   <c:forEach var="employee" items="${list}">   
   <tr>  
   <td>${employee.id}</td>  
   <td>${employee.name}</td> 
   <td>${employee.gender}</td>  
   <td>${employee.designation}</td> 
   <td>${employee.salary}</td>  
   <td>${employee.city}</td> 
   <td>${employee.email}</td>
   <td>${employee.mobileno}</td>    
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="welcome">Welcome Page</a>  
</body>
</html>