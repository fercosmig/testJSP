<%@page import="bmi.BodyMassIndex"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="bmi.BodyMassIndex, java.text.DecimalFormat"
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
		<h1>Cálculo de índice de massa corporal (I. M. C.)</h1>
	</div>

	<form method="post" action="bodyMassIndex.jsp">

		<table>
			<tr>
				<th colspan="2">Índice de massa corporal - I. M. C.</th>
			</tr>
			<tr>
				<td>Digite sua altura em metros:</td>
				<td><input type="text" id="ta" name="taltura"
					required="required" title="Altura"
					onchange="javascript: isNumeric(this.value, this.id);" /></td>
			</tr>
			<tr>
				<td>Digite seu peso em quilogramas:</td>
				<td><input type="text" id="tp" name="tpeso" required="required"
					title="Peso" onchange="javascript: isNumeric(this.value, this.id);" /></td>
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
			String peso = request.getParameter("tpeso");

			if (altura != null && altura != "" && peso != null && peso != "") {

				Double a = Double.parseDouble(altura);
				Double p = Double.parseDouble(peso);

				Double resultado = BodyMassIndex.calculateBodyMassIndex(a, p);

				DecimalFormat df = new DecimalFormat("#.##");

				out.println("Seu índice de massa corporal é " + df.format(resultado) + ".");
			}
		%>
	</div>
	<br />
	<div>
		<p>De 0 até 15 => Magreza grave</p>
		<p>De 15.1 até 17 => Magreza moderada</p>
		<p>De 17.1 até 18,5 => Magreza leve</p>
		<p>De 18,5 até 25 => Saudável</p>
		<p>De 25.1 até 30 => Sobrepeso</p>
		<p>De 30.1 até 35 => Obesidade Grau I</p>
		<p>De 35.1 até 40 => Obesidade Grau II (severa)</p>
		<p>De 40.1 para cima => Obesidade Grau III (mórbida).</p>
	</div>

</body>
</html>