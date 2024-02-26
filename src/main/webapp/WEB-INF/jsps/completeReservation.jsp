<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
    
<!DOCTYPE html PUBLIC"=//W3C//DTD HTML 4.01 Transitional//" "http://w3.org/TR/html4/lose.dtd">
<html>
<head>
<meta http-equiv="content-Type" content="text/html; charset=UTF-8">
<title>Complete Reservation</title>
</head>
<body>
<h2>Complete Reservation</h2>
Airline: ${flight.operatingAirlines}<br>
Departure city: ${flight.departureCity}<br>
Arrival City: ${flight.arrivalCity}<br>

<form action="completeReservation" method="post" /> 
<pre>
<h2>Passenger Details</h2>
First Name:<input type="text" name="PassengerFirstName"/>
Last Name:<input type="text" name="PassengerLastName"/>
Email:<input type="text" name="PassengerEmail"/>
Phone:<input type="text" name="PassengerPhone"/>

<h2>Card Details</h2>
Name on the card:<input type="text" name="nameOnTheCard"/>
Card No:<input type="text" name="cardNumber"/>
Expiry Date:<input type="text" name="expirationDate"/>
Three Digit sec code:<input type="text" name="securityCode"/>
<input type="hidden" name="flightId" value="${flight.id}"/>

<input type="submit" value="confirm"/>
</pre>
</form>

</body>
</html>