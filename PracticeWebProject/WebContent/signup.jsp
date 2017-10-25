<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>signup</title>
<link type="text/css" rel="stylesheet" href="style/signup.css">
</head>
<body>
	<div id="resform">
	<h1>Registration Form</h1>
		<form action="RegistrationController" method="POST">
			<table style="with: 50%">
				<tr>
					<td>FirstName</td>
					<td><input type="text" name="fname" /></td>
				</tr>
				<tr>
					<td>LastName</td>
					<td><input type="text" name="lname" /></td>
				</tr>
				<tr>
					<td>UserId</td>
					<td><input type="text" name="uid" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="pass" /></td>
				</tr>
				
				<tr>
					<td>Qualification</td>
					<td><input type="text" name="qual" /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email" /></td>
				</tr>
				<tr>
					<td>Mobile</td>
					<td><input type="tel" name="mobile" /></td>
				</tr>
			</table>
			<input type="submit" value="register" />
			<input type="reset" value="reset" />
		</form>
		</div>
</body>
</html>