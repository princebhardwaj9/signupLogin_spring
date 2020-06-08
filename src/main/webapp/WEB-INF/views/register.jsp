<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link type="text/css" rel="stylesheet" href="./css/signup.css">
<title>SignUp</title>
<style><%@include file="/WEB-INF/css/signup.css" %></style>
</head>
<body>

<div class="register-div">
	<form id="regForm" action="registerProcess" method="post">
	<h2>Sign Up</h2>
	<input type="text" id="email" name="name" placeholder="Name">
	<input type="email" id="email" name="email" placeholder="Email">
	<input type="tel" id="mobile" name="mobile" placeholder="Contact">
	<input type="text" id="password" name="password" placeholder="Password">
	<input type="password" id="confirm-password" name="confirm-password" placeholder="Confirm-Password">
	<div>${message}</div>
	<button type="submit" class="register-button">Register</button>
	</form>
</div>

</body>
</html>