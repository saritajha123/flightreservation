<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC"=//W3C//DTD HTML 4.01 Transitional//" "http://w3.org/TR/html4/lose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Login</title>
</head>
<body>
<h2>Login:</h2>
<form action="login" method="post">
<pre>
User Name:<input type="text" name="email" />
Password: <input type="text" name="password" />

<input type="submit" name="login" />

</pre>
</form>

${msg}
</body>
</html>