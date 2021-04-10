<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<h2 align="center">Add Employee</h2>
	<form:form id="empForm" modelAttribute="employee" action="save" method="post">
		<table align="center">
			<tr>
				<td><form:label path="id">Id : </form:label></td>
				<td><form:input path="id" name="id" id="id" /></td>
			</tr>
			<tr>
				<td><form:label path="name">Name :</form:label></td>
				<td><form:input path="name" name="name"	id="name" /></td>
			</tr>
			<tr>    
          <td><form:label path="gender">Gender : </form:label></td>   
          <td><form:input path="gender" /></td>  
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
          <td><form:input path="city" /></td>  
         </tr> 
         <tr>    
          <td><form:label path="email">Email Id : </form:label></td>   
          <td><form:input path="email" /></td>  
         </tr> 
         <tr>    
          <td><form:label path="mobileno">Mobile No : </form:label></td>   
          <td><form:input path="mobileno" /></td>  
         </tr>
			<tr>
				<td></td>
				<td align="left"><form:button id="save" name="Add">Add</form:button></td>
			</tr>

			<tr></tr>
			<tr>
				<td></td>
				<td><a href="welcome">Welcome Page</a></td>
			</tr>
		</table>
	</form:form>
</body>
</html>