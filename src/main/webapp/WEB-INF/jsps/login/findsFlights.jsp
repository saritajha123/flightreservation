<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html  PUBLIC"=//W3C//DTD HTML 4.01 Transitional//" "http://w3.org/TR/html4/lose.dtd">
<html>
<head>
 <meta http-equiv="content-Type" content="text/html; charset=UTF-8">
<title>Find Flights</title>
</head>
<body>
<h2>Find Flights:</h2>
<form action="findFlights" method="post">
From:<input type="text" name="from"/>
To:<input type="text" name="to"/>
Departure Date:<input type="text" name="departureDate"/>
<input type="submit" value="search"/>
</form>
</body>
</html>