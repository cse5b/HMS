package com.anil.learnservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationController
 */
@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String fname = request.getParameter("fname");
		
		String lname = request.getParameter("lname");
		
		String uid = request.getParameter("uid");
		
		String pass = request.getParameter("pass");
		
		String qual = request.getParameter("qual");
		
		String email = request.getParameter("email");
		
		String mobile = request.getParameter("mobile");
		
		
		if (fname.isEmpty() || lname.isEmpty() || uid.isEmpty() || pass.isEmpty() || qual.isEmpty() || email.isEmpty()
				|| mobile.isEmpty()) {
			RequestDispatcher rd = request.getRequestDispatcher("signup.jsp");
			out.println("<font color=red>Please fill all the fields</font>");
			rd.include(request, response);

		} else {

			try {
				

				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam", "root", "anil");
				String query = "insert into usersignup values(null,?,?,?,?,?,?,?)";
			
				PreparedStatement ps = con.prepareStatement(query);
				ps.setString(1, fname);
				ps.setString(2, lname);
				ps.setString(3, uid);
				ps.setString(4, pass);
				ps.setString(5, qual);
				ps.setString(6, email);
				ps.setInt(7, Integer.parseInt(mobile));
				ps.executeUpdate(); // execute it on test database
				System.out.println("successfuly inserted");
				ps.close();
				con.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			RequestDispatcher rd = request.getRequestDispatcher("onlineexamhomepage.jsp");
			rd.forward(request, response);
		}
	}

}
