

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String uname = request.getParameter("username");
		String pass1 = request.getParameter("password");
		Boolean flag = false;
		String JdbcURL = "jdbc:mysql://localhost:3306/register?useSSL=false";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection(JdbcURL,"root","rajkaste4mysql");
			PreparedStatement ps =con.prepareStatement("select * from record where username=? and password=?");
			ps.setString(1,uname);
			ps.setString(2,pass1);
			ResultSet rs = ps.executeQuery();
			flag = rs.next();
			if(flag==true)
			{
				HttpSession session = request.getSession();
				session.setAttribute("unm", uname);
				RequestDispatcher rds = request.getRequestDispatcher("home.jsp");
				rds.forward(request, response);	
			}
			else
			{
				out.println("Username and Password is Wrong!");
				RequestDispatcher rds = request.getRequestDispatcher("login.jsp"); 
				rds.include(request, response);
			}
		}
		catch(Exception ee) {
			ee.printStackTrace();
		}
	}

}
