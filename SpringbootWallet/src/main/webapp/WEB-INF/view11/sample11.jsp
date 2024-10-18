<!--html>
   <body>
      
      <form action="#" th:action="@{/home/adminpanel/updateperson/result}" method = "Post" >
          <input type = "text" name = "first_name" required/>
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
    <title>َAccount Update</title>
</h:head>
<h:body>
    <h:form>
		<input type = "text" name = "id" required/>
        <h:panelGrid columns="2">
			<h:outputLabel for="id" value="account id that you want update it:" />
			<h:inputText id="id" value="#{updateAccountInputDto.id}" required="true" />
            <h:outputLabel for="accountNumber" value="Account Number:" />
            <h:inputText id="accountNumber" value="#{updateAccountInputDto.accountNumber}" required="true" />
            <h:outputLabel for="accountBalance" value="Account Balance:" />
            <h:inputText id="accountBalance" value="#{updateAccountInputDto.accountBalance}" required="true" />
            <h:outputLabel for="dateOfCreate" value="Date Of Create:" />
            <h:inputText id="dateOfCreate" value="#{updateAccountInputDto.dateOfCreate}" required="true" />
			<h:outputLabel for="shabaNumber" value="Shaba Number:" />
			<h:inputText id="shabaNumber" value="#{updateAccountInputDto.shabaNumber}" required="true" />
			

        </h:panelGrid>
        
        <h:commandButton value="Add" action="#{mappingController.updateAccountResult(updateAccountInputDto)}" />
    </h:form>
</h:body>
</html>
