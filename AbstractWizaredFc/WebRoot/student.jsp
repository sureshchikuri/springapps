<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<form action="Studentcontroller.spr" method="post">

StudentNo :

<s:bind path="student.studentNo">
<input type="text" name="studentNo" value="${status.value}"/>
<s:hasBindErrors name="student">
<c:out value="${status.errorMessage}"></c:out>
</s:hasBindErrors>
</s:bind>
<br/>

<input type="submit" value="Next" name="_target1">

</form>