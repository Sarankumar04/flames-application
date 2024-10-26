<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1 align="center">Love Calculator</h1>
	<hr>

	<h1>Hi ${yourName}</h1>
	<br>
	
	<h1>Send Result to your Email :</h1>

	<form:form action="processemail" modelAttribute="email">
	
	Enter your Email <form:input path="email"/><br>
	<input type="submit" value="Send">
	
	</form:form>
	<h1><a href="/">try with somebody else</a></h1>

</body>
</html>