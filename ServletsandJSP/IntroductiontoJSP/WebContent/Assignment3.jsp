<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%! 
int fact(int num){
	if(num==1)
		return 1;
	return num*fact(num-1);
}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Factorial table</title>
</head>
<body>
<h1>Factorial table</h1>
<table border="1">
<tr><th>Number</th><th>Factorial</th></tr>
<% for(int i=1;i<10;i++){ %>
<tr><td><%= i %></td><td><%= fact(i) %></td></tr>
<% }%>
</table>
</body>
</html>