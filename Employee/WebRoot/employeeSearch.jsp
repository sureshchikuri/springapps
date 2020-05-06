<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-logic"
	prefix="logic"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<title>EmployeeSearch</title>
	</head>
	<body>
		<center>
			<h2>
				EmployeeSearch
			</h2>
		</center>
		<form:form action="employeeSearchController.spr"
			commandName="employeeCommand" method="post">
			<table align="center">
				<tr>
					<td>
						EmployeeId:
					</td>
					<td>
						<form:input path="empId" />

					</td>
				</tr>
				<tr>
					<td></td>
					<td>
						<input type="submit" value="SUBMIT" />
					</td>
				</tr>
			</table>
		</form:form>

	</body>
</html>