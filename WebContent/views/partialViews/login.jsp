<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h1>Login</h1>
	<form action=<c:url value="/login"/> method="post">
		<table>
			<tr>
				<td>CPF:</td>
				<td>
					<input type="text" name="cpf" size="40">
				</td>
			</tr>
			<tr>
				<td>Senha:</td>
				<td>
					<input type="text" name="senha" size="40">
				</td>
			</tr>
		</table>
		<input type="submit" value="Entrar">
	</form>
</body>
</html>