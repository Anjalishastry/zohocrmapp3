<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>bill info</title>
</head>
<body>
	<h2>Billing Info</h2>
	First Name: ${bill.firstName}<br/>
	Last Name: ${bill.lastName}<br/>
	Email: ${bill.email}<br/>
	Mobile: ${bill.mobile}<br/>
	Product: ${bill.product}<br/>
	Quantity: ${bill.quantity}<br/>
	Amount: ${bill.amount}<br/>
	
</body>
</html>