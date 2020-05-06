<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

Student Details

<form action="StudentController.spr" method="post">

StudentNo:
<s:bind path="student.studentNo">
<input type="text" name="studentNo" value="${status.value}">
<s:hasBindErrors name="student">
<c:out value="${status.errorMessage}"></c:out>
</s:hasBindErrors>
</s:bind>
<br/>
StudentName:
<s:bind path="student.studentName">
<input type="text" name="studentName" value="${status.value}">
<s:hasBindErrors name="student">
<c:out value="${status.errorMessage}"></c:out>
</s:hasBindErrors>
</s:bind><br/>


<input type="submit" value="SUBMIT">

</form>