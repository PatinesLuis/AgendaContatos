<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Editar contato</title>
<link rel="icon" href="imagens/tel.png">
<link rel="stylesheet" href="style.css">
</head>
<body>
	<h1>Editar contato - <%out.print(request.getAttribute("nome"));%></h1>
	<form name="frmContato" action="update">
		<table>
			<tr>
				<td><input type="text" name="idcon" id="caixaid" value="<%out.print(request.getAttribute("idcon"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="nome" class="caixa" value="<%out.print(request.getAttribute("nome"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="fone" class="caixaTel" value="<%out.print(request.getAttribute("fone"));%>"></td>
			</tr>
			<tr>
				<td><input type="text" name="email" class="caixa" value="<%out.print(request.getAttribute("email"));%>"></td>
			</tr>
		</table>
		<input class="botao" type="button" value="Salvar" onclick="validar()">
	</form>

	<script src="scripts/validador.js"></script>
</body>
</html>