<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="AuctionFormStyle.css">
<script type="text/javascript" src="AuctionFormScript.js"></script>
<title>Insert title here</title>
</head>
<body>

<form id="myform2">
<h3>Bid Submitted</h3>
Your bid is now active.If your bid is successful,you will be notified within 24 hours of the close of bidding.<br/>
<table align="center">
<tr class="iname">
<td class="iname"><%= request.getAttribute("iname") %></td>
</tr>
<tr>
<td>Item ID:<%= request.getAttribute("id") %></td>
</tr>
<tr>
<td>Name:<%= request.getAttribute("uname") %></td>
</tr>
<tr>
<td>Email address:<%= request.getAttribute("email") %></td>
</tr>
<tr>
<td>Bid price: Rs<%= request.getAttribute("amount") %></td>
</tr>
<tr>
<td>Auto-increment price:<%= request.getAttribute("inc") %></td>
</tr>
</table>
</form>
</body>
</html>