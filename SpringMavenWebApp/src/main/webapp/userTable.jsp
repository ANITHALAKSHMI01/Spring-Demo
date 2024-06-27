<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="com.chainsys.SpringMavenWebApp.model.User" %>
    <%@ page import="java.util.List" %>
     <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All User Details</title>
</head>
<body>
<h1>User Details</h1>
<form action="/search" method="get">
	<input type="search" name="searchData" placeholder="Search">
</form><br><br>
<table border="1px" cellspacing="0px">
	<thead>
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Phone Number</th>
		<th>Email</th>
		<th>Update</th>
		<th>Delete</th>
	</tr>
	</thead>
	<tbody>
		<%List<User> users=(ArrayList<User>)request.getAttribute("users");
		 if (users != null && !users.isEmpty())
		  {
			 try
			  {
				for (User user : users)
  				{
		%>
		<tr>
			<td><%=user.getId() %></td>
			<td><%=user.getName() %></td>
			<td><%=user.getPhoneNo() %></td>
			<td><%=user.getEmail() %></td>
			<td>
				<form action="updateUser.jsp">
					<input type="hidden" name="id" value="<%=user.getId() %>">
					<button>Edit</button>
				</form>
			</td>
			<td>
				<form action="/delete" method="get">
				    <input type="hidden" name="id" value="<%=user.getId() %>">
					<button>Delete</button>
				</form>
			</td>
		</tr>
		<%
			   }
				  		
				  }
				  catch (Exception e) 
				  { 
						e.printStackTrace();
				  }
			  } 
				else 
				{
	        %>
	        <tr>
	            <td colspan="15">No Records found</td>
	        </tr>
	         <%
	        }
	        %>
	</tbody>
	
</table>
</body>
</html>