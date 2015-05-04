<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<spring:form action="add" method="post" modelAttribute="userBean">
Name<spring:input path="name"/>
<br>
Login<spring:input path="login" />
<br>
Pwd<spring:password path="pwd"/>
<br>
<button type="submit">Valider</button>
</spring:form>
	<table border="1">
		<tr>
			<td>Name</td>
			<td>Login</td>
			<td>pwd</td>
		</tr>
		
		<c:forEach items="${users}" var="user">
		<tr>
		<td>${user.name}</td>
		<td>${user.login}</td>
		<td>${user.pwd }</td>
		<td><a href="edit/${user.id}">edit</a></td>
		<td><a href="delete/${user.id}">delete</a></td>
		</tr>
		</c:forEach>
		
		
	</table>
		<c:url var="logoutUrl" value="/logout" />
	<form action="${logoutUrl}" method="post">
		<input type="submit" value="Log out" /><input type="hidden"
				name="${_csrf.parameterName}" value="${_csrf.token}" />
	</form>
</body>
</html>