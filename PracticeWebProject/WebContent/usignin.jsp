<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>login Form</h1>
	<div class="login">
		<form action="LoginController" method="POST">
			<table style="with: 50%">
				<tr>
					<td>UserId</td>
					<td><input type="text" name="uid" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="text" name="pass" /></td>
				</tr>
			</table>
			<input type="submit" value="Login" />
		</form>
	</div>
</body>
</html>