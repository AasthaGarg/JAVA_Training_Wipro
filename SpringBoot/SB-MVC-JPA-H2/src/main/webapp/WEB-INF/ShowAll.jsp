<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee CRUD</title>
</head>
<body>
<h1>Employees List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Salary</th></tr>  
   <c:forEach var="employee" items="${list}">   
   <tr>  
   <td>${employee.eid}</td>  
   <td>${employee.ename}</td> 
   <td>${employee.esalary}</td>     
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="home">Home Page</a>  
</body>
</html>