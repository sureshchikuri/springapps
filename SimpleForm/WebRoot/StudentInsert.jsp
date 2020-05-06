<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>




	</head>

	<body>


		<form action="StudentController.spr" method="POST">
			&nbsp; StudentNo :
			<s:bind path="studentref.studentno">
				<input type="text" name="studentno" value="${status.value}" />
				<s:hasBindErrors name="studentno">
					<c:out value="${status.errorMessage}"></c:out>

				</s:hasBindErrors>
			</s:bind>
			StudentName :
			<s:bind path="studentref.studentname">
				<input type="text" name="studentname" value="${status.value}" />
				<s:hasBindErrors name="studentname ">
					<c:out value="${status.errorMessage}"></c:out>

				</s:hasBindErrors>
			</s:bind>
			<input type="submit" value="submit">

		</form>
	</body>
</html>
