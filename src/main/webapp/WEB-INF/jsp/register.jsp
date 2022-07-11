<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Registrati</title>
</head>

<body>
	<h1>Registrati</h1>
	<br></br>
	
	<form  method="POST" action="populateView" id="datiCliente">
		<div>
			<label path="username">Username</label>
			<input type="text" name="username" id="username" />
		</div>
		<div>
			<label path="password">Password</label>
			<input type="text" name="password" id="password" />
		</div>
		<div>
			<label path="nickname">Nickname'</label>
			<input type="text" name="nickname" id="nickname" />
		</div>
		<div>
			<input type="submit" value="Registrati" />
		</div>
	</form>
	
</body>
</html>