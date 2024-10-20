<!--html>
   <body>
      
      <form action="#" th:action="@{/home/adminpanel/addperson/result}" method = "Post" >
         First Name: <input type = "text" name = "first_name" required/>
         <br />
         Last Name: <input type = "text" name = "last_name" required/>
		 
		 National Code: <input type = "text" name = "national_code" required/>
		 <br />
		 Date Of Birth: <input type = "text" name = "birth_date" required/>
		 
		 Mobile Number: <input type = "text" name = "mobile_number" required/>
		 <br />
		 Gender: 
		 <input type="radio" name = "female_gender"/>female
		 <input type="radio" name = "male_gender"/>male
		 
		 
		 militaryStatus: 
		 <input type="radio" name = "done"/> DONE
		 <input type="radio" name = "educational_exemption"/> EducationalExemption
		 <input type="radio" name = "permanent_exemption"/> permanentExemption
		 <input type="radio" name = "subject_to_military_service"/> SubjectToMilitaryService
		 <input type="radio" name = "in_military_progress"/> InMilitaryProgress	
		 
		 <br />
		 Email Address: <input type="email" name = "email" required/>
		 
		 <br />  
         <input type = "submit" value = "Submit" />
		 
		 
      </form>
      
   </body>
</html-->
<!--DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html">
<h:head>
    <title>Person Registration</title>
</h:head>
<h:body>
    <h:form>
        <h:panelGrid columns="2">
            <h:outputLabel for="name" value="Name:" />
            <h:inputText id="name" value="${addpersoninputDto.name}" required="true" />
            <h:outputLabel for="surName" value="SurName:" />
            <h:inputText id="surName" value="${addpersoninputDto.surName}" required="true" />
            <h:outputLabel for="nationalCode" value="NationalCode:" />
            <h:inputText id="nationalCode" value="${addpersoninputDto.nationalCode}" required="true" />
			<h:outputLabel for="birthDate" value="BirthDate:" />
			<h:inputText id="birthDate" value="${addpersoninputDto.birthDate}" required="true" />
			<h:outputLabel for="mobileNumber" value="MobileNumber:" />
			<h:inputText id="mobileNumber" value="${addpersoninputDto.mobileNumber}" required="true" />
			<h:outputLabel for="gender" value="Gender:" />
			<h:inputText id="gender" value="${addpersoninputDto.gender}" required="true" />
			<h:outputLabel for="militaryStatus" value="MilitaryStatus:" />
			<h:inputText id="militaryStatus" value="${addpersoninputDto.militaryStatus}" required="true" />
			<h:outputLabel for="email" value="Email:" />
			<h:inputText id="email" value="${addpersoninputDto.email}" required="true" />
        </h:panelGrid>
        
        <h:commandButton value="Add" action="${mappingController.addPersonResult(addpersoninputDto)}" />
    </h:form>
</h:body>
</html-->

<!--html>
<head></head>

<body>
	<h1>This is the body of the sample view</h1>
</body>
</html-->

<!--html>
<body>	
	<h1>Person Input</h1>
	<form method="post" action="/home/adminpanel/addperson/result">
	
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" value="${addpersoninputDto.name}"/>
    <label for="age">Age:</label>
    <input type="number" id="age" name="age" value="${addpersoninputDto.age}"/>
    <input type="submit" value="Add Person"/>
	</form>
</body>
</html-->



<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Person Registration</title>
</head>
<body>
    <h2>Person Registration</h2>
    <form:form modelAttribute="addpersoninputDto" method="post" action="${pageContext.request.contextPath}/home/adminpanel/addperson/result">
        <table>
            <tr>
                <td><form:label path="name">Name:</form:label></td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td><form:label path="surName">Surname:</form:label></td>
                <td><form:input path="surName" /></td>
            </tr>
            <tr>
                <td><form:label path="nationalCode">National Code:</form:label></td>
                <td><form:input path="nationalCode" /></td>
            </tr>
            <tr>
                <td><form:label path="birthDate">Birth Date:</form:label></td>
                <td><form:input path="birthDate" type="date" /></td>
            </tr>
            <tr>
                <td><form:label path="mobileNumber">Mobile Number:</form:label></td>
                <td><form:input path="mobileNumber" /></td>
            </tr>
            <tr>
                <td><form:label path="gender">Gender:</form:label></td>
                <td>
                    <form:select path="gender">
                        <form:option value="MALE">Male</form:option>
                        <form:option value="FEMALE">Female</form:option>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td><form:label path="militaryStatus">Military Status:</form:label></td>
                <td>
                    <form:select path="militaryStatus">
                        <form:option value="DONE">DONE</form:option>
                        <form:option value="EducationalExemption">EducationalExemption</form:option>
                        <form:option value="permanentExemption">permanentExemption</form:option>
						<form:option value="SubjectToMilitaryService">SubjectToMilitaryService</form:option>
						<form:option value="InMilitaryProgress">InMilitaryProgress</form:option>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td><form:label path="email">Email:</form:label></td>
                <td><form:input path="email" type="email" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Add Person" /></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
