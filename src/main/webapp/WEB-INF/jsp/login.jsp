<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Login</title>
</head>

<body>
	<h1>Login</h1>
	<br></br>
	
	<form  method="POST" action="verifyCredential" id="datiCliente">
		<div>
			<label path="username">Username</label>
			<input type="text" name="username" id="username" />
		</div>
		<div>
			<label path="password">Password</label>
			<input type="text" name="password" id="password" />
		</div>
		<br></br>
		<div>
			<input type="submit" value="login" />
		</div>
	</form>
	
</body>
</html>