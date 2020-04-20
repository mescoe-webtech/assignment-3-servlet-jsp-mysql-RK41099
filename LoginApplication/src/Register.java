
import java.io.*;
import java.io.IOException;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * import com.mysql.jdbc.Connection;
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String uname = request.getParameter("uname");
		String pass1 = request.getParameter("password");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String mobile = request.getParameter("phn");
		String dob = request.getParameter("dob");
		String gender = request.getParameter("gender");
		String bg = request.getParameter("bg");
		String add = request.getParameter("add");
		String hob = request.getParameter("hob");
		String branch = request.getParameter("eng");
		String JdbcURL = "jdbc:mysql://localhost:3306/register?useSSL=false";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection(JdbcURL,"root","rajkaste4mysql");
			PreparedStatement ps =con.prepareStatement("insert into record values(?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,uname);
			ps.setString(2,pass1);
			ps.setString(3,fname);
			ps.setString(4,lname);
			ps.setString(5,email);
			ps.setString(6,mobile);
			ps.setString(7,dob);
			ps.setString(8,gender);
			ps.setString(9,bg);
			ps.setString(10,add);
			ps.setString(11,hob);
			ps.setString(12,branch);
			
			int i = ps.executeUpdate();
			if(i>0) {
				out.println("You are Registered Successfully!");
				out.println("<a href='login.jsp'>Click Here for Login</a>");
				}
			else {
				out.println("Try Again!");
			}
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		
		
	}

}
