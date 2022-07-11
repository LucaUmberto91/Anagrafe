<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Form Anagrafe</title>
</head>

<body>
	<h1>Form Anagrafe</h1>
	<br></br>
	
	<form  method="POST" action="populateForm" id="datiCliente">
		<div>
			<label path="name">Name</label>
			<input type="text" name="name" id="name" />
		</div>
		<div>
			<label path="surname">Surname</label>
			<input type="text" name="surname" id="surname" />
		</div>
		<div>
			<label path="age">age</label>
			<input type="text" name="age" id="age" />
		</div>
		<div>
			<label path="sex">sex</label>
			<input type="text" name="sex" id="sex" />
		</div>
		<div>
			<label path="country">country</label>
			<input type="text" name="country" id="country" />
		</div>
		<br></br>
		<div>
			<input type="submit" value="Invia" />
		</div>
	</form>
	
</body>
</html>