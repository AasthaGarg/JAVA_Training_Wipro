<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Employee</title>
</head>
<body>
	<h1>Edit Employee</h1>  
       <form:form action="SaveEmployee" modelAttribute="employee" >    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden  path="eid" /></td>  
         </tr>   
         <tr>    
          <td><form:label path="ename">Name : </form:label></td>   
          <td><form:input path="ename"  /></td>  
         </tr>   
         <tr>    
          <td><form:label path="esalary">Salary : </form:label></td>  
          <td><form:input path="esalary"  /></td>  
         </tr>    
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
        </table>    
       </form:form>
       <a href="home">Home Page</a> 
</body>
</html>