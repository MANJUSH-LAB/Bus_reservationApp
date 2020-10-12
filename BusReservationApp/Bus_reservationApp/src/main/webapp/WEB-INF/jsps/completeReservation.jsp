<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Complete Reservation</title>
</head>
<body>
<h1>Confirm your registration</h1>
<h3>Bus Details</h3>

Bus Number: ${bus.busNumber} <br/>
Departure City:${bus.departureCity}  <br/>
Arrival City: ${bus.arrivalCity}  <br/>
Departure Date: ${bus.dateOfDeparture}  <br/>
Departure Time: ${bus.estimatedDepartureTime}  <br/>

<form action="confirmRegistration" method="post">
		<pre>
		<h2>Enter passenger details</h2>
		First Name<Input type="text" name="passengerFirstName" /> 
		Last Name<Input type="text" name="passengerLastName" /> 
		Email Id<Input type="text" name="passengerEmail" /> 
		Mobile Number<Input type="text" name="passengerMobile" />
		
		<h2>Enter card details</h2>
		card Name:<input type="text" name="cardNumber"/>
		card holder name:<input type="text" name="cardHolderName"/>
	    Expiration Date:<input type="text" name="expirationDate"/>
	    cvv:<input type="text" name="cvvCode"/>
	    <input type="hidden" name="busId" value="${bus.id}"/>
	    <input type="submit" value="confirm and pay"/>
	    </pre>
	</form>

</body>
</html>