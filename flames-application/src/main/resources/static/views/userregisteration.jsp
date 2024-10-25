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
    <form:form action="register" align="center" modelAttribute="userreg">
        <p>
            <label for="name">Name</label>
            <form:input id="name" path="name" />
        </p>

        <p>
            <label for="userName">User Name</label>
            <form:input  id="userName" path="userName" />
        </p>

        <p>
            <label for="password">Password</label>
            <form:input type="password" id="password" path="password" />
        </p>

        <p>
            <label for="country">Country</label>
            <form:radiobutton  id="countryIndia" path="country" value="India" />
            <label for="countryIndia">India</label>
            <form:radiobutton id="countryUSA" path="country" value="USA" />
            <label for="countryUSA">USA</label>
        </p>

        <p>
            <label for="gender">Gender</label>
            <form:radiobutton id="genderMale" path="gender" value="Male" />
            <label for="genderMale">Male</label>
            <form:radiobutton id="genderFemale" path="gender" value="Female" />
            <label for="genderFemale">Female</label>
        </p>

        <p>
            <form:button type="submit">Register</form:button>
        </p>

    </form:form>

</body>
</html>