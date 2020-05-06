<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

Student Details

<form action="EmployeeController.spr" method="post">
Employee Id:
<s:bind path="employee.empId">
<input type="text" name="empId" value="${status.value}"/>
<s:hasBindErrors name="employee">
<c:out value="${status.errorMessage}"></c:out>
</s:hasBindErrors>
</s:bind>
<br/>
Employee Name:
<input type="text" name="empName"/><br/>
Employee Sal:
<input type="text" name="empSal"/><br/>
<input type="submit" value="SUBMIT"/>
</form>