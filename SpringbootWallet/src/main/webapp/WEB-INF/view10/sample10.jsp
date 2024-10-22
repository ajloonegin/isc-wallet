<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Account Finding</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/mappingController/findAccountResult" method="post">
    <table>
        <tr>
            <td><label for="accountNumber">Account Number:</label></td>
            <td><input id="accountNumber" name="accountNumber" type="text" required="true" value="${addaccountinputdto.accountNumber}" /></td>
        </tr>
        <tr>
            <td colspan="2"><button type="submit">Find</button></td>
        </tr>
    </table>
</form>
</body>
</html>