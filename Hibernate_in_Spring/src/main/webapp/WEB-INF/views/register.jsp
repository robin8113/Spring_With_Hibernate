<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
<form id="regForm" action="registerProcess" method="post">

		<center>
			<label>username : </label>	<input type="text" name="username" id="username"  /><br><br>
			
			<label>password : </label>	<input type="password" name="password" id="password" /><br><br>
			
			<label>Firstname : </label>	<input type="text" name="firstname" id="firstname" /><br><br>
			
			<label>Lastname : </label>	<input type="text" name="lastname" id="lastname" /><br><br>
		
		    <label>Email : </label>	<input type="email" name="email" id="email" /><br><br>
			
			<label>Address : </label>	<input type="text" name="address" id="address" /><br><br>
			
			
			<input type="submit" id="register" value="register"><br><br><br>
			
				<a href="home">Home</a>
				</center>
				</form>
</body>
</html>