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
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html">
<h:head>
    <title>Person Registration</title>
</h:head>
<h:body>
    <h:form>
        <h:panelGrid columns="2">
            <h:outputLabel for="name" value="Name:" />
            <h:inputText id="name" value="#{addpersoninputDto.name}" required="true" />
            <h:outputLabel for="surName" value="SurName:" />
            <h:inputText id="surName" value="#{addpersoninputDto.surName}" required="true" />
            <h:outputLabel for="nationalCode" value="NationalCode:" />
            <h:inputText id="nationalCode" value="#{addpersoninputDto.nationalCode}" required="true" />
			<h:outputLabel for="birthDate" value="BirthDate:" />
			<h:inputText id="birthDate" value="#{addpersoninputDto.birthDate}" required="true" />
			<h:outputLabel for="mobileNumber" value="MobileNumber:" />
			<h:inputText id="mobileNumber" value="#{addpersoninputDto.mobileNumber}" required="true" />
			<h:outputLabel for="gender" value="Gender:" />
			<h:inputText id="gender" value="#{addpersoninputDto.gender}" required="true" />
			<h:outputLabel for="militaryStatus" value="MilitaryStatus:" />
			<h:inputText id="militaryStatus" value="#{addpersoninputDto.militaryStatus}" required="true" />
			<h:outputLabel for="email" value="Email:" />
			<h:inputText id="email" value="#{addpersoninputDto.email}" required="true" />
        </h:panelGrid>
        
        <h:commandButton value="Add" action="#{mappingController.addPersonResult(addpersoninputDto)}" />
    </h:form>
</h:body>
</html>
