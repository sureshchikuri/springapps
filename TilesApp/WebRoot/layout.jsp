<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://jakarta.apache.org/struts/tags-html"
	prefix="html"%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-tiles"
	prefix="tiles"%>

<html>

	<head>

	</head>
	<body>
		<table>
			<tr>
				<td width="100%">
					<tiles:insert attribute="header"></tiles:insert>
				</td>
			</tr>

			<tr>
				<td width="30">
					<tiles:insert attribute="menu"></tiles:insert>
				</td>
			</tr>

			<tr>
				<td width="70%">
					<tiles:insert attribute="body"></tiles:insert>
				</td>
			</tr>


			<tr>
				<td width="100%">
					<tiles:insert attribute="footer"></tiles:insert>
				</td>
			</tr>
		</table>

	</body>
</html>