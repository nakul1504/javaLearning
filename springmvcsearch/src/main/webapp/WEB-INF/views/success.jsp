<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>

	<h1>Student is ${student.name}</h1>
	<h1>Student ID is ${student.id}</h1>
	<h1>Student DOB is ${student.dob}</h1>
	<h1>Student chosen courses are ${student.courses}</h1>
	<h1>Student gender is ${student.gender}</h1>
	<h1>Student type is ${student.type}</h1>
	<hr>
	<h1>Address is ${student.address.street}</h1>
	<h1>Address is ${student.address.city}</h1>

</body>
</html>