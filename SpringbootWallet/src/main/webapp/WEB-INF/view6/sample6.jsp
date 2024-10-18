<!--html>
   <body>
      <h>please enter national code of person</h>
      <form action="#" th:action="@{/home/adminpanel/findperson/result}" method = "Post" >
         National Code: <input type = "text" name = "national_code" required/>
         <br />
           
         <input type = "submit" value = "Submit" />
		 
		 
      </form>
      
   </body>
</html-->


<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html">
<h:head>
    <title>َPerson Finding</title>
</h:head>
<h:body>
    <h:form>
        <h:panelGrid columns="2">
            <h:outputLabel for="nationalCode" value="National Code:" />
            <h:inputText id="nationalCode" value="#{findPersonInputDto.nationalCode}" required="true" />
        </h:panelGrid>
        
        <h:commandButton value="Find" action="#{mappingController.findPersonResult(findPersonInputDto)}" />
    </h:form>
</h:body>
</html>