<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html">
<h:head>
    <title>Account Registration</title>
</h:head>
<h:body>
    <h:form>
        <h:panelGrid columns="2">
            <h:outputLabel for="accountNumber" value="Account Number:" />
            <h:inputText id="accountNumber" value="#{addAccountInputDto.accountNumber}" required="true" />
            <h:outputLabel for="accountBalance" value="Account Balance:" />
            <h:inputText id="accountBalance" value="#{addAccountInputDto.accountBalance}" required="true" />
            <h:outputLabel for="dateOfCreate" value="Date Of Create:" />
            <h:inputText id="dateOfCreate" value="#{addAccountInputDto.dateOfCreate}" required="true" />
			<h:outputLabel for="shabaNumber" value="Shaba Number:" />
			<h:inputText id="shabaNumber" value="#{addAccountInputDto.shabaNumber}" required="true" />
			
        </h:panelGrid>
        
        <h:commandButton value="Add" action="#{mappingController.addAccountResult(addAccountInputDto)}" />
    </h:form>
</h:body>
</html>

