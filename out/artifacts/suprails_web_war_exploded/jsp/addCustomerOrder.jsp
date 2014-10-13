<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Alexandre NGUYEN
  Date: 12/10/2014
  Time: 23:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add a customer order</title>
</head>
<body>
    <h1>Add a customer order</h1>

    <form action="${pageContext.servletContext.contextPath}/addCustomerOrder" method="POST">
        <label for="firstName">Firstname</label>
        <input type="text" name="firstName" id="firstName">

        <br>

        <label for="lastName">Lastname</label>
        <input type="text" name="lastName" id="lastName">

        <br>

        <label for="email">Email</label>
        <input type="text" name="email" id="email">

        <br>

        <label for="trip">Trip</label>
        <select id="trip" name="tripId">
            <c:forEach items="${trips}" var="trip">
                <option value="${trip.id}">${trip.departureStation.name} - ${trip.arrivalStation.name}</option>
            </c:forEach>
        </select>

        <input type="submit">
    </form>
</body>
</html>
