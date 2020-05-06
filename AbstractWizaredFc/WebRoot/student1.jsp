<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<form action="Studentcontroller.spr" method="post" >

StudentName :

<s:bind path="student.studentName">
<input type="text" name="studentName" value="${status.value}"/>
<s:hasBindErrors name="student">
<c:out value="${status.errorMessage}"></c:out>
</s:hasBindErrors>
</s:bind>
<br/>

<input type="submit" value="Back" name="_target0">
<input type="submit" value="Cancel" name="_cancel"/>
<input type="submit" value="Finish" name="_finish">

</form>