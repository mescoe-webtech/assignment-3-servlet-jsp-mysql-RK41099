<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">

<head>
  <meta charset="utf-8">
  <title>Form Validation</title>
  <link rel="stylesheet" href="page1.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="icon" href="css/form.ico">
  <script src="index.js"></script>
</head>

<body>
  <div class="main-container">
    <div class="sub">
      <h1 class="wel">Login Form</h1>
      <h3 class="ready">Form Validation using JavaScript and use of Dynamic Web Pages using JSP</h3>
      <div class="wel2">
          <form action="login" method="post">
              <div>
                  <div><label>Username:</label></div>
                  <div>
                      <input type="text" name="username" placeholder="Enter your username"/>
                  </div>
                  <br>
              </div>
              <div class="leavespace">
                  <div><label>Password:</label></div>
                  <div>
                      <input type="password" name="password" placeholder="Enter your password"/>
                  </div>
              </div>
              <br>
              <div class="leavespace">
                  <input type="submit" value="Login">
                  <input type="reset" value="Reset"/><br>

              </div>
          </form>
      </div>
      <a href="register.jsp"><button class="btn">Register Here</button></a>
    </div>
  </div>


  <div class="bottom">
    <a href="https://www.linkedin.com/in/raj-kaste-97150413b/"><i class="fa fa-linkedin ml-auto" style="font-size:36px"></i></a>
    <a href="https://github.com/RK41099"><i class="fa fa-github ml-auto" style="font-size:36px"></i></a>
    <a href="http://www.youtube.com/c/RajKaste"><i class="fa fa-youtube ml-auto" style="font-size:36px"></i></a>
    <p class="cp">© 2020 Raj Kaste.</p>
  </div>
</body>

</html>
