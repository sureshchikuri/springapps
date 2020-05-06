<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<form:form action="studentController.spr" commandName="student">

StudentNo:<form:input path="studentNo"/><br/>
StudentName:<form:input path="studentName"/><br/>

<input type="submit" value="Insert"/>

</form:form>