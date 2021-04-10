<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Employee CRUD</title>
</head>
<body>
<h1>Employee ${emp.eid} details</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Salary</th></tr>    
   <tr>  
   <td>${emp.eid}</td>  
   <td>${emp.ename}</td> 
   <td>${emp.esalary}</td>      
   </tr>   
   </table>  
   <br/>  
   <a href="home">Home Page</a> 
</body>
</html>