<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu de Op��es</title>
</head>
<body>
	<h1>Menu de Op��es</h1>
	<ul>
		<li><a href=<c:url value="/partialViews/incluir" />>Cadastrar usu�rio</a></li>
		<li><a href=<c:url value="/partialViews/login" />>Fazer login</a></li>
	</ul>
</body>
</html>