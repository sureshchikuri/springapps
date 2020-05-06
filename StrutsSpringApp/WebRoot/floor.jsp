<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for FloorForm form</title>
	</head>
	<body>
		<html:form action="/floor">
			floorName : <html:text property="floorName"/><html:errors property="floorName"/><br/>
			floorId : <html:text property="floorId"/><html:errors property="floorId"/><br/>
			floorDesc : <html:text property="floorDesc"/><html:errors property="floorDesc"/><br/>
			<html:submit/><html:cancel/>
		</html:form>
	</body>
</html>

