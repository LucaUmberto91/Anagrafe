<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome page!</title>
</head>
<body>
	<h1>Ciao ${username}!</h1>
	<p>Benvenuto nel sito di My Anagrafica!!</p>
	<br></br>
	<form  method="GET" action="redirectForm" id="datiCliente">
	<div>
			<input type="submit" value="Form Anagrafe" />
		</div>
		</form>
</body>
</html>