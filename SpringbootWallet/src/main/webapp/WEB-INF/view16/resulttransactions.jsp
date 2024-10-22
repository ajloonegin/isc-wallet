<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Transactions Information</title>
</head>
<body>
<h2>Transactions Information</h2>
<table>
    <tr>
        <td>Name:</td>
        <td>${transaction.accountNumber}</td>
    </tr>
    <tr>
        <td>Surname:</td>
        <td>${transaction.accountName}</td>
    </tr>
    <tr>
        <td>National Code:</td>
        <td>${transaction.operation}</td>
    </tr>

    <tr>
        <td>Address:</td>
        <td>${transaction.description}</td>
    </tr>
    <tr>
        <td>Phone:</td>
        <td>${transaction.amount}</td>
    </tr>
    <tr>
        <td>Date of Birth:</td>
        <td><fmt:formatDate value="${transaction.date}" pattern="yyyy-MM-dd" /></td>
    </tr>
</table>
</body>
</html>
