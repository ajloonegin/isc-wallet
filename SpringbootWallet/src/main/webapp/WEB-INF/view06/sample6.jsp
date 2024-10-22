


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Person Finding</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/mappingController/findPersonResult" method="post">
    <table>
        <tr>
            <td><label for="nationalCode">National Code:</label></td>
            <td><input id="nationalCode" name="nationalCode" type="text" required="true" value="${findPersonInputDto.nationalCode}" /></td>
        </tr>
        <tr>
            <td colspan="2"><button type="submit">Find</button></td>
        </tr>
    </table>
</form>
</body>
</html>