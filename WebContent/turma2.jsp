<!DOCTYPE HTML><%@page language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>turma2</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script src="https://kit.fontawesome.com/11a8c3e605.js"
	crossorigin="anonymous"></script>
</head>
<body>

	<h3 class="jumbotron">Turma 2</h3>
	<div class=" d-flex justify-content-between mb-4">
		<a href="index.jsp" class="tex"><i
			class="fa-solid fa-house fa-lg ml-4"></i></a> <a href="listaTurma1"><i
			class="fa-solid fa-arrow-left fa-2xl"></i></a> <a href="listaTurma3"><i
			class="fa-solid fa-arrow-right fa-2xl"></i></a> <a href="listarMelhores"
			class="btn btn-danger mr-4">Melhores alunos</a>
	</div>

	<table class="table">
		<tr class="thead-dark">
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
					<td class="border border-secondary text-center"><s:property
							value="nome" /></td>
					<td class="border border-secondary text-center"><s:property
							value="nota1" /></td>
					<td class="border border-secondary text-center"><s:property
							value="nota2" /></td>
					<td class="border border-secondary text-center"><s:property
							value="nota3" /></td>
					<td class="border border-secondary text-center"><s:if
							test="provaFinal==0">
							<p>-</p>
						</s:if> <s:else>
							<s:property value="provaFinal" />
						</s:else></td>
					<td class="border border-secondary text-center"><s:property
							value="media" /></td>
					<td class="border border-secondary text-center"><s:property
							value="situacao" /></td>
				</tr>
			</s:iterator>
		</tbody>


	</table>

</body>
</html>