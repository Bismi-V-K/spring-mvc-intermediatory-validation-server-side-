<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
	<div align="center"></div>
	<form:form action="processing" method="GET" modelAttribute="Submission" >
		<label for="na">Name:</label>
		<form:input id="na" path="name" />
		<br />
		<label for="em">Email:</label>
		<form:input id="em" path="email" />
		<br />
		<input type="submit" value="register!" />
	</form:form>
</body>
</html>