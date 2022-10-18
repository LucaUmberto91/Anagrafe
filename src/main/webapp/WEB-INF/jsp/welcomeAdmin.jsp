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
			<br></br>
		<form  method="GET" action="redirectViewAnagrafe" id="people">
		<div>
        			<input type="submit" value="View Anagrafe" />
        		</div>

        			</form>
        				<br></br>
        			<form  method="POST" action="search" id="search">
                    		<div>
                    			<label path="search">Search People</label>
                    			<input type="text" name="surname" id="surname" />
                    		</div>
                    		<br></br>
                    		<div>
                    			<input type="submit" value="search" />
                    		</div>
                    	</form>
</body>
</html>