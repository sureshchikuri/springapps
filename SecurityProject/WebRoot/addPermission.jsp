<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="/WEB-INF/tld/security.tld" prefix="security"%>

<security:hasAccess pageOper="addPermission" />
<html>
	<body>
		<h3>
			Role Adding
		</h3>

		<form:form method="post" action="persist" commandName="permission">
			<table>

				<tr>
					<td>
						Permission Name:
					</td>
					<td>
						<form:input path="name" />
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="Add">
					</td>
				</tr>
			</table>
		</form:form>
	</body>
</html>
