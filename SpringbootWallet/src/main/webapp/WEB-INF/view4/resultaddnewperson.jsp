<!--html>
   <head>
      <title>Using GET and POST Method to Read Form Data</title>
   </head>
   
   <body>
      <center>
      <h1>Using POST Method to Read Form Data</h1>
      
      <ul>
         <li><p><b>First Name:</b>
            <%= request.getParameter("first_name")%>
         </p></li>
         <li><p><b>Last  Name:</b>
            <%= request.getParameter("last_name")%>
         </p></li>
      </ul>
	  <ul>
	         <li><p><b>Maths Flag:</b>
	            <%= request.getParameter("maths")%>
	         </p></li>
	         <li><p><b>Physics Flag:</b>
	            <%= request.getParameter("physics")%>
	         </p></li>
	         <li><p><b>Chemistry Flag:</b>
	            <%= request.getParameter("chemistry")%>
	         </p></li>
	      </ul>
   </body>
</html-->

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Registration Of New Person Successful</title>
</head>
<body>
    <h2 th:text="${message}">Thanks for registering!</h2>
    <a href="/register">Go Back to Registration</a>
</body>
</html>