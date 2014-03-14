<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>ToDo List Login</title>
</head>
<body>
	<h1>ToDo List Login</h1>
	<form method="POST" action="j_security_check">
		<label>User ID</label><input type="text" name="j_username" size="10" /><br />
		<label>Password</label><input type="password" name="j_password" size="10" /><br />
		<input type="submit" name="submit" value="Login" />
	</form>
	<font color="red">User ID or Password is incollect.</font>
</body>
</html>
