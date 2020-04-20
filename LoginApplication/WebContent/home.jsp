<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<%Class.forName("com.mysql.cj.jdbc.Driver");%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home Page</title>
</head>
<body>
<%
if(session.getAttribute("unm")==null)
{
	response.sendRedirect("login.jsp");
}
String uname = request.getParameter("username");
String pass1 = request.getParameter("password");
%>
<h1>Welcome to First Page <%= uname%></h1>
<hr>
<%
String JdbcURL = "jdbc:mysql://localhost:3306/register?useSSL=false";
Connection con =DriverManager.getConnection(JdbcURL,"root","rajkaste4mysql");
PreparedStatement ps =con.prepareStatement("select * from record where username=? and password=?");
ps.setString(1,uname);
ps.setString(2,pass1);
ResultSet rs = ps.executeQuery();
%>

<table border="1">
<tr>
<th>Username</th>
<th>Password</th>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Mobile Number</th>
<th>DOB</th>
<th>Gender</th>
<th>Blood Group</th>
<th>Address</th>
<th>Hobbies</th>
<th>Branch</th>
</tr>
<% while(rs.next()){ %>	
<tr>
<td><%= rs.getString(1) %></td>
<td><%= rs.getString(2) %></td>
<td><%= rs.getString(3) %></td>
<td><%= rs.getString(4) %></td>
<td><%= rs.getString(5) %></td>
<td><%= rs.getString(6) %></td>
<td><%= rs.getString(7) %></td>
<td><%= rs.getString(8) %></td>
<td><%= rs.getString(9) %></td>
<td><%= rs.getString(10) %></td>
<td><%= rs.getString(11) %></td>
<td><%= rs.getString(12) %></td>
</tr>
<% }%>
</table>
<form action="logout" method="post">
<input type="submit" value="Logout">
</form>
</body>
</html>