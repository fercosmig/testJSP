<%@page import="bmi.BodyMassIndex"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="bmi.IdealWeight, java.text.DecimalFormat" pageEncoding="UTF-8"%>
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
		<h1>Cálculo do peso ideal de um ser humano.</h1>
	</div>

	<form method="post" action="idealWeight.jsp">

		<table>
			<tr>
				<th colspan="2">Peso ideal de acordo com sua altura</th>
			</tr>
			<tr>
				<td>Digite sua altura em metros:</td>
				<td><input type="text" id="ta" name="taltura"
					required="required" title="Altura"
					onchange="javascript: isNumeric(this.value, this.id);" /></td>
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
			String altura = request.getParameter("taltura");

			if (altura != null && altura != "") {

				Double a = Double.parseDouble(altura);
				DecimalFormat df = new DecimalFormat("#.##");

				Double pesoMinimo = IdealWeight.calculateMinimumWeight(a);
				out.println("O peso mínimo aceitável para uma pessoa com a sua altura é " + df.format(pesoMinimo));

				Double pesoMaximo = IdealWeight.calculateMaximumWeight(a);
				out.println("<br />");
				out.println("O peso máximo aceitável para uma pessoa com a sua altura é " + df.format(pesoMaximo));

				Double pesoIdeal = IdealWeight.calculateIdealWeight(a);
				out.println("<br />");
				out.println("O melhor peso para uma pessoa com a sua altura é " + df.format(pesoIdeal));
			}
		%>
	</div>

</body>
</html>