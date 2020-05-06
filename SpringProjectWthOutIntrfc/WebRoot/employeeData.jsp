
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>


<c:forEach items="empList">

${empList.empId} 

${empList.empName} 

${empList.empSal} 

</c:forEach>