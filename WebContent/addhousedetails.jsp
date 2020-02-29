<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="welcome.jsp" %>

<div id="tableform">
<c:if test="${rentalService != null}">
<table border="1" style="border-collapse:collapse">
<tr>
<th>house</th>
<th>squareFeet</th>
<th>rentalCost</th>
<th>parkingAvailable</th>
<th>garden</th>
<th>address</th>
</tr>
<c:forEach var="addhouserental" items="${rentalService}">
<tr>
<td>${addhouserental.house}</td>
<td>${addhouserental.squareFeet}</td>
<td>${addhouserental.rentalCost}</td>
<td>${addhouserental.parkingAvaliable}</td>
<td>${addhouserental.garden}</td>
<td>${addhouserental.address}</td>

</tr>
</c:forEach>
</table>
</c:if>
</div>

</body>
</html>