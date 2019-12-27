<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="math.SquareRoot" pageEncoding="UTF-8"%>
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
		<h1>Raíz quadrada</h1>
	</div>

	<form method="post" action="squareRoot.jsp">

		<table>
			<tr>
				<th colspan="2">Raíz quadrada</th>
			</tr>
			<tr>
				<td>Digite um número:</td>
				<td><input type="number" name="nsr" required="required" min="0" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Enviar" /></td>
			</tr>
		</table>

	</form>
	<br />
	<br />
	<div class="res">
		<%
			String numero = request.getParameter("nsr");
			if (numero != null && numero != "") {
				int num = Integer.parseInt(numero);
				String retorno = SquareRoot.retrieveSquareRoot(num);
				out.println("A raiz quadrada de " + num + " é " + retorno + ".");
			}
		%>
	</div>

</body>
</html>