<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>New Customer Registration</h2>
<form action="customersave" method="post">
<pre>
FirstName : <input type="text" name="firstName">
LastName : <input type="text" name="lastName" >
Address : <input type="text" name="address">
UserName : <input type="text" name="userName">
MailId : <input type="text" name="mailId">
Password : <input type="text" name="password">
MobileNo : <input type="text" name="mobileNo">
Gender : <input type="radio" name="gender" value="Male">
<input type="radio" name="gender" value="Female">
Bank Name :<input type="text" name="bankName">
GovtId	: <input type="text" name="govtId">
Initial Deposit		: <input type="radio" name="initialDeposit" value="500">
<input type="radio" name="initialDeposit" value="1000">

<input type="submit" value="CreateCustomer">
</pre></form>
</body>
</html>