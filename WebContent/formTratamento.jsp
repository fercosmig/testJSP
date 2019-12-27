<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.Calendar, java.text.SimpleDateFormat"
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

	<h4>Dados do formulário</h4>
	<%
		String nome = request.getParameter("reqtxtnome");
		String email = request.getParameter("reqtxtemail");
		String datanascimento = request.getParameter("reqtxtdatanascimento");

		String dt[] = new String[3];
		dt = datanascimento.split("-");
		int anoNasc = Integer.parseInt(dt[0]);
		int mesNasc = Integer.parseInt(dt[1]) - 1;
		int diaNasc = Integer.parseInt(dt[2]);

		if (nome == "") {
			out.println("O nome não foi digitado! <a href='javascript:goBack();'>Clique aqui</a> para corrigir.");
		} else if (email == "") {
			out.println("O e-mail não foi digitado! <a href='javascript:goBack();'>Clique aqui</a> para corrigir.");
		} else if (datanascimento == "") {
			out.println(
					"A data de nascimento não foi digitada! <a href='javascript:goBack();'>Clique aqui</a> para corrigir.");
		} else {
			out.println("<p>Seu nome é " + nome + "</p>");
			out.println("<p>Seu e-mail é " + email + "</p>");

			String pattern = "MMMMM dd, yyyy";
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			Calendar c = Calendar.getInstance();
			c.set(Calendar.YEAR, anoNasc);
			c.set(Calendar.MONTH, mesNasc);
			c.set(Calendar.DAY_OF_MONTH, diaNasc);
			out.println("<p>Sua data de nascimento é " + sdf.format(c.getTime()) + "</p>");
		}
	%>

</body>
</html>