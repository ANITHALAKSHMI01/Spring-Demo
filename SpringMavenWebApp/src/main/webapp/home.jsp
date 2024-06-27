<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<script type="text/javascript">
	function validation()
	{
		var name=document.getElementById("user");
		var phoneNo=document.getElementById("phoneNo");
		var email=document.getElementById("emailId");
		var password=document.getElementById("password");
		if(!name.checkValidity())
		{
			alert("Name should be alphabet.");
			return;
		}
		if(!phoneNo.checkValidity())
		{
			alert("PhoneNo should start(6-9) and 10 digits must.");
			return;
		}
		if(!email.checkValidity())
		{
			alert("Invalid Email.");
			return;
		}
		if(!password.checkValidity())
		{
			alert("Password should contain atleast one uppercase,lowercase,number,special character and 6 characters only allowed.");
			return;
		}
	}
</script>
<body>
	<h1>User Registration</h1>
	<form action="/register" method="post">
		<label>Name</label>
		<input type="text" placeholder="Name" name="name" id="user" pattern="^[A-Za-z]*"  required><br><br>
		<label>Phone No.</label>
		<input type="tel" placeholder="Phone Number" name="phoneNo" id="phoneNo" pattern="[6789][0-9]{9}" maxlength=10 required><br><br>
		<label>Email</label>
		<input type="email" placeholder="Email" name="email" id="emailId" pattern="[a-z0-9_/-/.]+[@][a-z]+[/.][a-z]{2,7}$" required><br><br>
		<label>Password</label>
		<input type="password" placeholder="Password" name="password" id="password" pattern="(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@!#$%^&*]).{6}$" maxlength=6 required><br><br>
		<button onclick="validation()">Register</button>
	</form><br><br>
	<form action="/view" method="get">
		<button>View All Users</button>
	</form>
</body>
</html>