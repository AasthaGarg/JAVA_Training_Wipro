<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Delete Employee</h1>
<form:form method="GET" action="deleteemp" modelAttribute="employee">
<table >    
         <tr>    
          <td><form:label path="id">Employee Id: </form:label></td>   
          <td><form:input path="id"  /></td>  
         </tr>   
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Delete" /></td>    
         </tr>
</table>
</form:form>

</body>
</html>