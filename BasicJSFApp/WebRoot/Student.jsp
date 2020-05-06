<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>


<f:view>
<h:form>
StudentNo :<h:inputText value="#{student.studentNo}"></h:inputText><br/>
StudentName :<h:inputText value="#{student.studentName}"></h:inputText><br/>

<h:commandButton value="SUBMIT" action="#{student.execute}"></h:commandButton>
</h:form>
</f:view>