<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC"=//W3C//DTD HTML 4.01 Transitional//" "http://w3.org/TR/html4/lose.dtd">
<html>
<head>
<meta http-equiv="content-Type" content="text/html; charset=UTF-8">
<title>Register user</title>
</head>
<body>
	<form action="registerUser" method="post">
		<pre>
		<h2>User Registration</h2>
First Name:<input type="text" name="firstName" />
Last Name<input type="text" name="lastName" />
User Name<input type="text" name="email" />
 Password<input type="password" name="password" />
 Confirm Password<input type="password" name="confirmpassword" />
 <input type="submit" value="register" />
 </pre>
	</form>

</body>
</html>