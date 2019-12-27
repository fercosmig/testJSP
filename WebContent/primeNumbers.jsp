<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="math.PrimeNumbers" pageEncoding="UTF-8"%>
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
		<h1>Números primos</h1>
	</div>

	<form method="post" action="primeNumbers.jsp">

		<table>
			<tr>
				<th colspan="2">Números primos</th>
			</tr>
			<tr>
				<td>Intervalo de numeros a verificar, de 0 até</td>
				<td><select name="slqtd">
						<option value="5">5</option>
						<option value="10">10</option>
						<option value="15">15</option>
						<option value="20">20</option>
						<option value="25">25</option>
						<option value="50">50</option>
						<option value="100">100</option>
						<option value="150">150</option>
						<option value="200">200</option>
						<option value="250">250</option>
				</select></td>
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
			String strQtd = request.getParameter("slqtd");
			if (strQtd != null && strQtd != "") {
				int qtd = Integer.parseInt(strQtd);
				String retorno = PrimeNumbers.listPrimeNumbers(qtd);
				out.println(retorno);
			}
		%>
	</div>

</body>
</html>