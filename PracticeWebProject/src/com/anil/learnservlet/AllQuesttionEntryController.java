package com.anil.learnservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
/**
 * Servlet implementation class QuestionController
 */
@WebServlet("/AllQuestionEntryController")
public class AllQuesttionEntryController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String subc = request.getParameter("subc");
		String subn = request.getParameter("subn");
		String comm = request.getParameter("comm");
		String ans = request.getParameter("ans");
		String OptionA = request.getParameter("OptionA");
		String OptionB = request.getParameter("OptionB");
		String OptionC = request.getParameter("OptionC");
		String OptionD = request.getParameter("OptionD");
		if (subc.isEmpty() || subn.isEmpty() ||comm.isEmpty() || ans.isEmpty() || OptionA.isEmpty() || OptionB.isEmpty() || OptionC.isEmpty() || OptionD.isEmpty()) {
			out.println("<font color=red>Please fill all the fields</font>");
			RequestDispatcher rd = request.getRequestDispatcher("aquectionentry.jsp");
			rd.include(request, response);
			} else {
				try {

				Class.forName("com.mysql.jdbc.Driver");
				Connection con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexam", "root", "anil");
				String query1 = "insert into allquestion values(?,?,?,?,?,?,?,?,null)";
			
				PreparedStatement ps = (PreparedStatement) con.prepareStatement(query1);
				ps.setString(1, subc);
				ps.setString(2, subn);
				ps.setString(3, comm);
				ps.setString(4, ans);
				ps.setString(5, OptionA);
				ps.setString(6, OptionB);
				ps.setString(7, OptionC);
				ps.setString(8, OptionD);
				ps.executeUpdate(); // execute it on test database
				System.out.println("successfuly inserted");
				ps.close();
				con.close();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			out.println("Inserted success fully");
			/*RequestDispatcher rd = request.getRequestDispatcher("aquectionentry.jsp");
			rd.forward(request, response);*/
		}
	}

}
