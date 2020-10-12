<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Buss</title>
</head>
<body>
<h2> Avilable Buss </h2>
<table>

<tr>
<th>Bus Number</th>
 <th>Operating Traveler</th>
 <th>Arrival City </th>
 <th>Departure City</th>
 <th>Departure Date</th>
</tr>
<c:forEach items="${buss}" var="bus">
<tr>
<td>${bus.busNumber} </td>
<td>${bus.operatingTraveler} </td>
<td>${bus.departureCity} </td>
<td>${bus.arrivalCity} </td>
<td>${bus.estimatedDepartureTime} </td>

<td> <a href="showCompleteReservation?busId=${bus.id}"> select</a></td>
 </tr>

</c:forEach>

</table>
</body>

</html>