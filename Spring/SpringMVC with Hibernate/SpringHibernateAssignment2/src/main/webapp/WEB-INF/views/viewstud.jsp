<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>RollNo</th><th>Name</th><th>Address</th></tr>  
   <c:forEach var="student" items="${list}">   
   <tr>  
   <td>${student.rollno}</td>  
   <td>${student.name}</td>  
   <td>${student.address}</td>   
   </tr>  
   </c:forEach>  
</table>  
   <br/>   
</body>
</html>