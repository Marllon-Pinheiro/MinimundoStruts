<!DOCTYPE HTML><%@page language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="s" uri="/struts-tags"  %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>alunos</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

<h3>Turma 1</h3>
	<table>
	<tr>
		<th>Aluno</th>
		<th>Prova 1</th>
		<th>Prova 2</th>
		<th>Prova 3</th>
		<th>Prova Final</th>
		<th>Media</th>
		<th>Situação</th>
	</tr>
	<tbody>
		<s:iterator value="alunosDTO" var="alunoDTO">
		<tr>
			<td><s:property value="nome"/></td>
			<td><s:property value="nota1"/></td>
			<td><s:property value="nota2"/></td>
			<td><s:property value="nota3"/></td>
			<td><s:property value="provaFinal"/></td>
			
			<td><s:property value="media"/></td>
			<td><s:property value="situacao"/></td>
		</tr>
	</s:iterator>
	</tbody>
	
	
	</table>
	
	
</body>
</html>