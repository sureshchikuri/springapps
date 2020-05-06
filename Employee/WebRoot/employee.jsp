<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<form:form action="employeeController.spr" commandName="employeeCommand">

Team:
<form:select path="team">
<form:options items="${typeList}" itemValue="value" itemLabel="key"/>
</form:select>
<br/>
FirstName:<form:input path="firstName"/><br/>
LastName:<form:input path="lastName"/><br/>
NtLogin:<form:input path="ntLogin"/><br/>
Email:<form:input path="email"/><br/>
Mobile:<form:input path="mobile"/><br/>
IsActive:<form:radiobuttons items="${commonList}" path="isActive" itemLabel="key" itemValue="value"/><br/>
IsManager:<form:radiobuttons items="${commonList}" path="isManager" itemLabel="key" itemValue="value"/><br/>

Manager:<form:input path="manager"/><br/>
<input type="submit" value="InsertEmployee"/>

</form:form>