<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product</title>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">
</head>

<body >
<div class="w-75" align="center">
	<h2>list of Cart</h2>
	<table class="table table-success table-striped" >
		<thead>
			<tr>
				<td>Id</td>
				<td>Price</td>
				<td>CheckOut</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="carts" items="${carts}" >
				<tr>
					<td><a href="list/${carts.cartId}">${carts.cartId}</a></td>
					
					<td>${carts.price}</td>
					<td>${carts.checkedOut }</td>
					 <%-- <td><a href="deleteProduct/${product.id}">${product.id}</a></td>  --%>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
</body>
</html>