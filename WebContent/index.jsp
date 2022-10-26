<!DOCTYPE HTML><%@page language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="s" uri="/struts-tags"  %>
<html>
<head>
<title>index</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<h2>Seja Bem-vindo ao nosso Minimundo Struts</h2>
<h3>Selecione uma turma</h3>
	<s:form action="listaAlunos">
<s:submit value="Turma1"></s:submit>
</s:form>
</body>
</html>