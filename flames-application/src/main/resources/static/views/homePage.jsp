<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Love Calculator</h1>
    <hr>
    <div align="center">
        <!-- Standard HTML form -->
        <form:form action="claculate" modelAttribute="lover">
            <p>
                <label for="yourName">Your Name:</label>
                <form:input id="yourName" path="yourName"/>
            </p>
            <p>
                <label for="gfName">Girl Friend's Name:</label>
                <form:input  id="gfName" path="gfName"/><br>
            </p>
            <br><br>
            <form:button type="submit">Calculate</form:button>
        </form:form>
    </div>
</body>
</html>