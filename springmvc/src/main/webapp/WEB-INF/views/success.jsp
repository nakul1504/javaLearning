<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${Header}</h1>
<p>${Desc }</p>
<h1 style="color:green">${msg}</h1>
<hr>

	<h1>Welcome, ${user.userName }</h1>
	
	<h1>Your email is ${user.email }</h1>
	
	<h1>Your password is ${user.password }, try to secure it bitch...</h1>


</body>
</html>