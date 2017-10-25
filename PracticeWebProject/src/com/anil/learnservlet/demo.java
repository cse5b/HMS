package com.anil.learnservlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class demo
 */
@WebServlet("/demo")
public class demo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			String uid = request.getParameter("uid");
			String pass = request.getParameter("pass");
			String  qual = request.getParameter("qual");
			String email = request.getParameter("email");
			String mobile = request.getParameter("mobile");
			//String sql=" insert into students(Id,FirstName,LastName,Password,E_mail,Mobile,Address,country) values (null,?,?,?,?,?,?,?)";
			String sql=" insert into usersignup values (null,?,?,?,?,?,?,?)";
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam","root","anil");
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, uid);
			ps.setString(4, pass);
			ps.setString(5, qual);
			ps.setString(6, email);
			ps.setInt(7, Integer.parseInt(mobile));
			ps.executeUpdate();
			PrintWriter out = response.getWriter();
		      out.println("you have success fully register");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

