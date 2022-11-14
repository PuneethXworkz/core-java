<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bank details</title>
</head>
<body>
<div>
<h2>Here is your searched Customer details</h2>
<table>
<thead>
<th>Id </th>
<th>BankName </th>
<th>BranchName </th>
<th>IfscCode </th>
<th>Address </th>
</thead>
<tbody>
<c:forEach var="customer" items="${customers}">
<tr>
<td>${customer.id}</td>
<td>${customer.bankName}</td>
<td>${customer.branchName}</td>
<td>${customer.ifscCode}</td>
<td>${customer.address}</td>
</tr>
</c:forEach>
</tbody>
</table>
</div>
</body>
</html>