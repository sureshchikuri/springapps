<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="/WEB-INF/tld/security.tld" prefix="security"%>

<security:hasAccess pageOper="editUser" />
<html>
	<script type="text/javascript">

function getDetails(id) {
	var httpRequest = new XMLHttpRequest();
	httpRequest.open("Get","user/get/"",false);

httpRequest.onreadystatechange=function(){

if(httpRequest.readyState==4 && httpRequest.status==200){
var user=eval("("+httpRequest.responseText+")");

var userForm=document.forms[0];
userForm.id.value=user.userId;
userForm.firstname.value=user.firstname;
userForm.lastname.value=user.lastname;
userForm.email.value=user.email;
userForm.telephone.value=user.telephone;
userForm.address.value=user.address;

var editForm=document.getElementById("editForm");
editForm.style.display="block";

}
}
httpRequest.send();
}

function confirmAndDelete(id){

var del=confirm("Do you want to Delete")

if(del){

var userForm=document.forms[0];
userForm.action="delete/"+id;
userForm.submit();
}
}
</script>
	<body>

		<h3>
			UserList
		</h3>
		<a href="user/reg">Add User</a>
		<a href="role/reg">Add Role</a>
		<a href="permission/reg">Add Permission</a>
		<table class="data" border="1">
			<tr>
				<th>
					S No
				</th>
				<th>
					FirstName
				</th>
				<th>
					LastName
				</th>
				<th>
					Telephone
				</th>
				<th>
					Email
				</th>
				<th>
					Address
				</th>
				<th>
					&nbsp;Action
				</th>
			</tr>
			<c:if test="${empty userList}">
				<c:forEach items="${userList}" var="emp">
					<tr>
						<td>
							${emp.userId}
						</td>
						<td>
							${emp.firstname}
						</td>
						<td>
							${emp.lastname}
						</td>
						<td>
							${emp.telephone}
						</td>
						<td>
							${emp.emial}
						</td>
						<td>
							${emp.address}
						</td>
						<td>
							<a href="javascript:getDetails(${emp.userId});">update</a>
							<a href="javascript:confirmAndDelete(${emp.userId});">delete</a>
						</td>
					</tr>

				</c:forEach>
			</c:if>
			<c:if test="${empty userList}">
				<tr>
					<td colspan="8">
						No Records :Please add some records
					</td>
				</tr>
			</c:if>
		</table>
		<div id="editForm" style="display: none;">
			<form:form method="post" action="persist" commandName="user">
				<input type="hidden" name="userId" />
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
						<td colspan="2">
							<input type="submit"
								value="<spring:message code="label.update"/>" />
						</td>
					</tr>

				</table>
			</form:form>
		</div>

	</body>
</html>