<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>reservationDetails</title>
</head>


<body>
<h2>Bus Details</h2>
Bus:${reservation.bus.operatingTraveler}<br/>
Bus Number:${reservation.bus.busNumber }<br/>
Departure City:${reservation.bus.departureCity}<br/>
Arrival City:${reservation.bus.arrivalCity }<br/>
Departure Date and Time:${reservation.bus.estimatedDepartureTime }<br/>

<h2>Passenger Details</h2>
First Name:${reservation.passenger.firstName}<br/>
Last Name:${reservation.passenger.lastName}<br/>
Email:${reservation.passenger.email}<br/>
mobile:${reservation.passenger.phone}<br/>
	
<form action="completeCheckIn" method="post">
	Number of Bags you want to checkIn<input type="text" name="numberOfBags"/>
	<input type="hidden" value="${reservation.id}" name="reservationId"/>
	<input type="submit" value="Check In"/>
</form>
</body>


</html>