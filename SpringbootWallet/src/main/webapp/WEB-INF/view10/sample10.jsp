<!--html>
   <body>
      <h>please enter account number of account</h>
      <form action="#" th:action="@{/home/adminpanel/findaccount/result}" method = "Post" >
         National Code: <input type = "text" name = "account_number" required/>
         <br />
           
         <input type = "submit" value = "Submit" />
		 
		 
      </form>
      
   </body>
</html>


</html-->



<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html">
<h:head>
    <title>َAccount Finding</title>
</h:head>
<h:body>
    <h:form>
        <h:panelGrid columns="2">
            <h:outputLabel for="accountNumber" value="Account Number:" />
            <h:inputText id="accountNumber" value="#{addaccountinputdto.accountNumber}" required="true" />
        </h:panelGrid>
        
        <h:commandButton value="Find" action="#{mappingController.findAccountResult(addaccountinputdto)}" />
    </h:form>
</h:body>
</html>