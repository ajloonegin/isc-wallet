</html-->
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html">
<h:head>
    <title>Person Remove</title>
</h:head>
<h:body>
    <h:form>
		<input type = "text" name = "id" required/>
        <h:panelGrid columns="2">
			<h:outputLabel for="id" value="person id that you want delete it:" />
			<h:inputText id="id" value="#{updatepersoninputdto.id}" required="true" />
        </h:panelGrid>
        
        <h:commandButton value="Delete" action="#{mappingController.deletePersonResult(deletepersoninputdto)}" />
    </h:form>
</h:body>
</html>
