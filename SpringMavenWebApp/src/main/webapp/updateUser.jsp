<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update User</title>
</head>
<body>
<%
	int id=Integer.parseInt(request.getParameter("id"));
%>
<h2>Update User</h2>
<form action="/update" method="get">
	<label>Id</label>
	<input type="number" name="id" value="<%=id %>" readonly><br><br>
	<label>Phone Number</label>
	<input type="tel" name="phoneNo" id="phone" maxlength=10><br><br>
	<button>Update</button>
</form>
</body>
</html>