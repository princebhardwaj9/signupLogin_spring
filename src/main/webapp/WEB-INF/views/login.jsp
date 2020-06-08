<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link type="text/css" rel="stylesheet" href="./css/signup.css">
<title>Login</title>
<style><%@include file="/WEB-INF/css/signup.css" %></style>
</head>
<body>

<div class="register-div">
	<form id="loginForm" action="loginProcess" method="post">
	<h2>Login</h2>
	<input type="email" id="email" name="email" placeholder="Email">
	<input type="text" id="password" name="password" placeholder="Password">
	<div>${message}</div>
	<button type="submit" class="register-button">Login</button>
	</form>
</div>

</body>
</html>