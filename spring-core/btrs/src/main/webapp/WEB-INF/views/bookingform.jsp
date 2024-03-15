<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Booking page</h1>
	<form:form action="book" method="post" modelAttribute="book">
		<form:input type="text" path="source" placeholder="Enter the source"></form:input><br><br> 
		<form:input type="text" path="destination" placeholder="Enter the destination"></form:input><br><br> 
		<form:input type="email" path="email" placeholder="Enter the Email"></form:input><br><br> 
		<form:input type="date" path="date" placeholder="Select jpurney date"></form:input><br><br> 
		<input type="submit" value="Book">
	</form:form>
</body>
</html>