<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="style/quesentry.css">
</head>
<body>
<div id="wrapper">
<div id="header">
<div id="text">
<h3><marquee> You are an Administrator</marquee></h3>
</div>
</div>
<div id="questions">
<div id="question">

<form action="QuestionController" method="post">
<table>
<tr>
	<td>Question</td>
	<td><input type="text" name="comm" /></td>
	
</tr>
<tr>
	<td>Answer</td>
	<td><input type="text" name="ans" /></td>
</tr>
<tr>
	<td>OPtionA</td>
	<td><input type="text" name="OptionA" /></td>
</tr>
<tr>
	<td>OptionB</td>
	<td><input type="text" name="OptionB" /></td>
</tr>
<tr>
	<td>OptionC</td>
	<td><input type="text" name="OptionC" /></td>
</tr>
<tr>
	<td>OPtionD</td>
	<td><input type="text" name="OptionD" /></td>
</tr>
</table>
<input type="submit" value="submit">
<input type="reset" value="Reset">
</form>

</div>
</div>
<div id="rightdivisions">
</div>
<div id="footer">
</div>
</div>

</body>
</html>