<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Provide all the fields for registration.</h3>
<form action="registration" method="post">
<strong>First Name</strong>:<input type="text" name="firstname" required><br>
<strong>Last Name</strong>:<input type="text" name="lastname" required><br>
<strong>Username</strong>:<input type="text" name="username" required><br>
<strong>Email ID</strong>:<input type="text" name="email" required><br>
<strong>Password</strong>:<input type="password" name="password" required><br>
<strong>Mobile</strong>:<input type="text" name="mobile" required><br>
<strong>Country</strong>:<input type="text" name="country" required><br>
<input type="submit" value="Register">
</form>
<br>
If you are registered user, please <a href="login.html">login</a>.
</body>
</html>
