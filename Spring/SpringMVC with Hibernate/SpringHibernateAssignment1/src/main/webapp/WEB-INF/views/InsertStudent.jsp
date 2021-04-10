<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><pre>
<sp:form action="InsertStudent" method="post" modelAttribute="student">
Enter Student RollNo: <sp:input path="rollno" />
Enter Student Name: <sp:input path="name" />
Enter Student Address: <sp:input path="address" />
<input type="submit"/>
</sp:form>
</pre>
</body>
</html>