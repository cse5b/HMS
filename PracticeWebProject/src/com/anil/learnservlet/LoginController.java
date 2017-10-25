package com.anil.learnservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.com.Validate;
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		String uid = request.getParameter("uid");
		String pass = request.getParameter("pass");
		String dbUserId=null;
		String dbPassword=null;
		String sql= "select * from usersignup where UserId=? and Password=?";
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam", "root", "anil");
	PreparedStatement ps = con.prepareStatement(sql); 
		ps.setString(1, uid);
		ps.setString(2, pass);
		ResultSet rs = ps.executeQuery();
		PrintWriter out = response.getWriter();
		while(rs.next()) {
			
			dbUserId = rs.getString("UserId");
			dbPassword = rs.getString("Password");
		}
		if(uid.equals(dbUserId) && pass.equals(dbPassword)) {
			HttpSession session=request.getSession();
			session.setAttribute("USERID", uid);
			//out.println("You have login successfuly");
			response.sendRedirect("onlineexamhomepage.jsp");
		}
		else
		{
			String msg="UserId or Password Incorrect !";
			Validate vd=new Validate();
			vd.setMessage(msg);
			response.sendRedirect("signin.jsp");
			//out.println("please enter valid userid and password");
		}
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}catch(SQLException e) {
		e.printStackTrace();
	}
	}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
