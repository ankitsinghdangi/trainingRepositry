<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>validation</title>
</head>
<body>
<for action="LoginController"  method="userLogin">
<strong>user name</strong> <input type="text" name="username" required>
<strong>password </strong><input type="password" name="password" required>
<br><br>
<a href=""><input type="submit" value="sign-in"></a>
</form>
If you are new user, please <a href="register.html">register</a>.
</body>
</html>