<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add Bus Form</h1>
	<form:form action="/mtrs/bus/add/form" method="post" modelAttribute="busObject">
		<form:input type="text" path="travelsName" placeholder="Enter the bus name"></form:input><br><br>
		<form:input type="text" path="source" placeholder="Enter the source"></form:input><br><br>
		<form:input type="text" path="destination" placeholder="Enter the Destination"></form:input><br><br>
		<form:input type="number" path="cost" placeholder="Enter the Ticket Cost"></form:input><br><br>
		<form:input type="date" path="journeyDate" placeholder="Enter the travel date"></form:input><br><br>
		<input type="submit" value="Add Bus">
	</form:form>
</body>
</html>