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
       <form:form method="POST" action="editsave" modelAttribute="employee">    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden  path="id" /></td>  
         </tr>   
         <tr>    
          <td><form:label path="name">Name : </form:label></td>   
          <td><form:input path="name"  /></td>  
         </tr>   
         <tr>    
          <td><form:label path="gender">Gender : </form:label></td>  
          <td><form:input path="gender"  /></td>  
         </tr> 
         <tr>    
          <td><form:label path="designation">Designation : </form:label></td>   
          <td><form:input path="designation" /></td>  
         </tr>
         <tr>    
          <td><form:label path="salary">Salary : </form:label></td>   
          <td><form:input path="salary" /></td>  
         </tr>   
         <tr>    
          <td><form:label path="city">City : </form:label></td>
          <td><form:input path="city"  /></td>  
         </tr>    
         <tr>    
          <td><form:label path="email">Email Id : </form:label></td>   
          <td><form:input path="email"  /></td>  
         </tr>  
         <tr>    
          <td><form:label path="mobileno">Mobile No : </form:label></td>   
          <td><form:input path="mobileno"  /></td>  
         </tr>     
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
        </table>    
       </form:form>
</body>
</html>