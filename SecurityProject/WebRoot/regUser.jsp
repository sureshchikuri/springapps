<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="/WEB-INF/tld/security.tld" prefix="security"%>

<security:hasAccess pageOper="addUser" />
<html>
	<body>
		<form:form method="post" action="persist" commandName="user">

			<table>
				<tr>
					<td>
						<form:label path="firstname">
							<spring:message code="label.firstname" />
						</form:label>
					</td>
					<td>
						<input name="firstname" />
					</td>
				</tr>

				<tr>
					<td>
						<form:label path="lastname">
							<spring:message code="label.lastname" />
						</form:label>
					</td>
					<td>
						<input name="lastname" />
					</td>
				</tr>

				<tr>
					<td>
						<form:label path="telephone">
							<spring:message code="label.telephone" />
						</form:label>
					</td>
					<td>
						<input name="telephone" />
					</td>
				</tr>

				<tr>
					<td>
						<form:label path="email">
							<spring:message code="label.email" />
						</form:label>
					</td>
					<td>
						<input name="email" />
					</td>
				</tr>

				<tr>
					<td>
						<form:label path="address">
							<spring:message code="label.address" />
						</form:label>
					</td>
					<td>
						<input name="address" />
					</td>
				</tr>

				<tr>
					<td>
						UserName
					</td>
					<td>
						<form:input path="username" />
					</td>
				</tr>

				<tr>
					<td>
						Password
					</td>
					<td>
						<form:input path="password" />
					</td>
				</tr>
				<tr>
					<td>
						Roles
					</td>
					<td>
						<select multiple="multiple" name="roleIds">
							<c:if test="${!empty roleList}">
								<c:forEach items="${roleList}" var="role">
									<option value="${role.rid}">
										${role.rName}
									</option>
								</c:forEach>
							</c:if>
						</select>
					</td>
				</tr>

				<tr>
					<td colspan="2">
						<input type="submit" value="<spring:message code="label.add"/>" />
					</td>
				</tr>

			</table>
		</form:form>

	</body>
</html>