<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="email.SendEmail" pageEncoding="UTF-8"%>
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
		<h1>Teste de envio de email com Java Mail 1.6.2</h1>
	</div>

	<%
		request.setCharacterEncoding("UTF-8");
		String nome = request.getParameter("iNome");
		String email = request.getParameter("iEmail");
		String mensagem = request.getParameter("tMsg");

		if (nome != null) {
			// Antes de testar, configurar uma conta na classe SendEmail.

			//SendEmail se = new SendEmail();
			//se.sendEmail(email, nome, mensagem);
			out.println("E-mail enviado com sucesso!");
		}
	%>

	<form id="frm1" name="form1" action="contatoEmail.jsp" method="post">

		<table>
			<tr>
				<th colspan="2">Formulário de contato!</th>
			</tr>
			<tr>
				<td>Nome:</td>
				<td><input type="text" id="tn" name="iNome" required="required" /></td>
			</tr>
			<tr>
				<td>E-mail:</td>
				<td><input type="email" id="te" name="iEmail"
					required="required" /></td>
			</tr>
			<tr>
				<td>Mensagem:</td>
				<td><textarea rows="5" cols="80" id="tm" name="tMsg"
						required="required"></textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" name="b1" value="Enviar"
					disabled="disabled" class="w200" /></td>
			</tr>
		</table>

	</form>

</body>
</html>