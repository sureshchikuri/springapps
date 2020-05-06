<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>


	<body>
		<form action="studentcontroller.spr" method="post"
			CommandName="student">



			StudentNO
			<s:bind path="studentref.studentno">
				<input type="text" name="studentno" value="${status.value}" />

				<s:hasBindErrors name="student">
					<c:out value="${status.errorMessage}"></c:out>
				</s:hasBindErrors>

			</s:bind>


			<input type="submit" value="insert" name="action">

		</form>
	</body>
</html>
