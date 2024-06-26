<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<h1>User Registration</h1>
	<form action="/register" method="post">
		<label>Name</label>
		<input type="text" placeholder="Name" name="name" id="user" pattern="^[A-Za-z]*"  required><br><br>
		<label>Phone No.</label>
		<input type="tel" placeholder="Phone Number" name="phoneNo" id="phoneNo" pattern="[6789][0-9]{9}" maxlength=10 required><br><br>
		<label>Email</label>
		<input type="email" placeholder="Email" name="email" id="emailId" required><br><br>
		<label>Password</label>
		<input type="password" placeholder="Password" name="password" id="password" pattern="(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@!#$%^&*]).{6}$" maxlength=6><br><br>
		<button>Register</button>
	</form>
	<form action="/view" method="get">
		<button>View All Users</button>
	</form>
</body>
</html>