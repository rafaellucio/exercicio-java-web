<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro</title>
</head>
<body>
	<h1>Cadastro</h1>
	<form action=<c:url value="/caduser"/> method="post">
		<table>
			<tr>
				<td>CPF:</td>
				<td>
					<input type="text" name="id" size="40">
				</td>
			</tr>
			<tr>
				<td>Nome:</td>
				<td><input type="text" name="descricao" size="40"></td>
			</tr>
			<tr>
				<td>Senha:</td>
				<td><input type="text" name="descricao" size="40"></td>
			</tr>
		</table>
		<input type="submit" value="Incluir pessoa">
	</form>
</body>
</html>