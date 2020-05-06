<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="/WEB-INF/tld/security.tld" prefix="security"%>

<security:hasAccess pageOper="addRole" />
<html>
	<body>
		<h3>
			Role Adding
		</h3>

		<form:form method="post" action="persist" commandName="role">
			<table>

				<tr>
					<td>
						Role Name
					</td>
					<td>
						<input name="rName" />
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<table class="data" border="1">
							<tr>
								<th>
									Permission Id
								</th>
								<th>
									Permission Name
								</th>
								<c:if test="${empty PermissionList}">
									<c:forEach items="${PermissionList}" var="perm">
										<tr>
											<td>
												<input type="checkbox" name="pid" value="${perm.pid}" />
											</td>
											<td>
												${perm.name}
											</td>
										</tr>

									</c:forEach>
								</c:if>
							</tr>
						</table>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="add" />
					</td>
				</tr>
			</table>
		</form:form>
	</body>

</html>