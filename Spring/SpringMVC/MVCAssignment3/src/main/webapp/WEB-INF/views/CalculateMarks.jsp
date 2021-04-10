<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><pre>
<sp:form action="CalculateMarks" method="post" modelAttribute="marks">
Enter maths marks: <sp:input path="maths"/>
Enter english marks: <sp:input path="english"/>
Enter science marks: <sp:input path="science"/>
<input type="submit"/>
</sp:form>
</pre>
</body>
</html>