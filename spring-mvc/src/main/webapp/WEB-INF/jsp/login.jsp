<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Login | Beingjavaguys.com</title>
</head>
<body>
	<center>
		<br /> <br /> <br />
		<div style="border: 1px solid black; width: 300px; padding-top: 10px;">
			<br /> Please enter your username and password to login ! <br /> <span
				style="color: red">${message}</span> <br />
			<form:form method="post" action="j_spring_security_check"
				modelAttribute="users">
				<table>
					<tr>
						<td>Username:</td>
						<td><form:input path="login" /></td>
					</tr>
					<tr>
						<td>Password:</td>
						<td><form:input path="pwd" type="password" /></td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td><input type="submit"  value="Ok"/></td>
					</tr>
				</table>
			</form:form>
		</div>
	</center>

</body>
</html>