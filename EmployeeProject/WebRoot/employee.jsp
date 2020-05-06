<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<form:form action="employeeController.spr">

Team:<form:input path="team" /><br/>
FirstName:<form:input path="firstName"/><br/>
LastName:<form:input path="lastName"/><br/>
NtLogin:<form:input path="ntLogin"/><br/>
IsActive:<form:radiobuttons items="${yesNo}" path="isActive" itemLabel="YN" itemValue="YN"/><br/>
IsManager:<form:radiobuttons items="${yesNo}" path="isManager" itemLabel="YN" itemValue="YN"/><br/>
Manager:<form:input path="manager"/><br/>
<input type="submit" value="InsertEmployee"/>

</form:form>