<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="bean.com.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="style/signin.css">
<style>
	.login p{
		color:red;
	}
</style>
</head>
<body>
<div id="background">
<div id="text">
<h1>login Form</h1>
	<div class="login">
	<% String msg=(String)Validate.getMessage(); %>
	<p><%=msg %></p>
		<form action="LoginController" method="POST">
			<table style="with: 50%">
			 
				<tr>
					<td>UserId</td>
					<td><input type="text" name="uid" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="pass" /></td>
				</tr>
				
			</table>
			<input type="submit" value="Login" />
		</form>
		</div>
	</div>
	</div>
</body>
</html>