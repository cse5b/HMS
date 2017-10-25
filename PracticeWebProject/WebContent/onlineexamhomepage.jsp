<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>onlile exam hompage</title>
<link type="text/css" rel="stylesheet" href="style/onlineexamhomepage.css" />
</head>
<body>
<%=session.getAttribute("USERID") %>>
<div id="wrapper">
	<div id="header">
	
	 <ul>
	 <li><a href="#">Home</a></li>
	 <li><a href="#">AboutUs</a></li>
	  <li><a href="#">Sign In</a></li>
	 <li><a href="signup.jsp">Sign Up</a></li>
	 </ul>
	 <div id="signout" style="float:right;color:white;margin-top:60px;margin-right:25px">
		<a href="signout.jsp" style="color:white;text-decoration: none;font-size: 20px">SignOut</a>
	 </div>
	</div>
		<div id="menu">
			<ul>
				<li><a href="iassubject.jsp">UPSC/IAS</a></li>
				<li><a href="b.tech.jsp">B.TECH</a></li>
				<li><a href="mtech.jsp">M.TECH</a></li>
				<li><a href="mba.jsp">MBA</a></li>
				<li><a href="bba.jsp">BBA</a></li>
				<li><a href="bankpo.jsp">BANKPO</a></li>
				<li><a href="ssc.jsp">SSC</a></li>
			</ul>
		</div>
		<div  id="leftpart">
			<div id="imagesaliderpart">
				<div id="slider">
					<div id="outerbox">
						<div id="sliderbox">
						  <img src="images/on2.jpg">
	                       <img src="images/on3.jpg">
	                       <img src="images/on4.jpg">
	                        <img src="images/on5.jpg">
	                     </div>
				     </div>
			    </div>
				<div id="footer">
				This is &copy write section.
				</div>
			
</div>
</div>
<div id="rightpart">
	<div id="Text">
	Please First signup</br> if you are a new user.
	</div>
</div>
</div>
</body>
</html>