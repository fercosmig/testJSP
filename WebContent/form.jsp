<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="testJSP.js"></script>
<link rel="stylesheet" href="style.css" />
</head>
<body>

	<div class="res">
		<h1>Teste de formulário e request.getParameter</h1>
	</div>

	<form id="frm1" name="form1" action="formTratamento.jsp" method="post"
		onsubmit="javascript: return validateForm('frm1');">

		<table>
			<tr>
				<th colspan="2">Teste de envio de dados por formulário
					(GET/POST).</th>
			</tr>
			<tr>
				<td>Nome:</td>
				<td><input type="text" id="tn" name="reqtxtnome" title="Nome"
					required="required" /></td>
			</tr>
			<tr>
				<td>E-mail:</td>
				<td><input type="email" id="te" name="reqtxtemail"
					title="E-mail" required="required" /></td>
			</tr>
			<tr>
				<td>Data de nascimento:</td>
				<td><input type="date" id="te" name="reqtxtdatanascimento"
					title="Data de nascimento" required="required" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" name="b1" value="Enviar"
					class="w200" /></td>
			</tr>
		</table>

	</form>

</body>
</html>