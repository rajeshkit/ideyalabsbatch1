<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Booking page</h1>
	<form action="book" method="post">
		<input type="text" name="from" placeholder="Enter the source"><br><br> 
		<input type="text" name="to" placeholder="Enter the destination"><br><br> 
		<input type="email" name="email" placeholder="Enter the Email"><br><br> 
		<input type="date" name="journeydate" placeholder="Select jpurney date"><br><br> 
		<input type="submit" value="Book">
	</form>
</body>
</html>