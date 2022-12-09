<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Car</title>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">
</head>
<body >
<div class="w-75" align="center">
	<h2>list of cars</h2>
	<table class="table table-dark table-striped table-hover" >
		<thead>
			<tr>
				<td>Id</td>
				<td>Make</td>
				<td>Model</td>
				<td>Year</td>
				<td>Color</td>
				<td>Kms</td>
				<td>Price</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${cars}" var="car">
				<tr>
					<td><a href="updateCar/${car.id}">${car.id}</a></td>
					<td>${car.make}</td>
					<td>${car.model}</td>
					<td>${car.yearManufactured}</td>
					<td>${car.color}</td>
					<td>${car.kms}</td>
					<td>${car.price}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
</body>
</html>