<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="math.Conversor, enumeration.Conversion" pageEncoding="UTF-8"%>
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
		<h1>Conversor de multiplas unidades</h1>
	</div>

	<form id="f1" name="form1" method="post" action="conversor.jsp"
		onsubmit="javascript: return validateForm('f1');">
		<table>
			<tr>
				<td><label for="sl1">Escolha o tipo de conversão:</label></td>
				<td><select id="sl1" name="reqConversao" required="required">
						<option value="" selected="selected">Selecione</option>
						<%
							for (Conversion c : Conversion.values()) {
								out.println("<option value='" + c + "'>" + c.getDescription() + "</option>");
							}
						%>
				</select></td>
			</tr>
			<tr>
				<td><label for="in1">Digite um valor para conversão: </label></td>
				<td><input type="number" id="in1" name="reqNumero"
					required="required" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Converter" /></td>
			</tr>
		</table>
	</form>
	<br />
	<br />
	<div class="res">
		<%
			String option = request.getParameter("reqConversao");
			if (option != "" && option != null) {
				String stringValue = request.getParameter("reqNumero");
				Double inputValue = Double.parseDouble(stringValue);
				Double result = null;

				String msg = "";
				switch (option) {
				case "MK":
					result = Conversor.mileToKilometer(inputValue);
					msg = inputValue + " milhas é equivalente a " + result + " quilômetros.";
					out.println(msg);
					break;
				case "KM":
					result = Conversor.kilometerToMile(inputValue);
					msg = inputValue + " quilômetros é equivalente a " + result + " milhas.";
					out.println(msg);
					break;
				case "MSKH":
					result = Conversor.meterPerSecondToKilometerPerHour(inputValue);
					msg = inputValue + " metros pro segundo é equivalente a " + result + " quilômetros por hora.";
					out.println(msg);
					break;
				case "KHMS":
					result = Conversor.kilometerPerHourToMeterPerSecond(inputValue);
					msg = inputValue + " quilômetros por hora é equivalente a " + result + " metros por segundo.";
					out.println(msg);
					break;
				case "KKH":
					result = Conversor.KnotToKilometerPerHour(inputValue);
					msg = inputValue + " nós é equivalente a " + result + " quilômetros por hora.";
					out.println(msg);
					break;
				case "KHK":
					result = Conversor.kilometerPerHourToKnot(inputValue);
					msg = inputValue + " quilômetros por hora é equivalente a " + result + " nós.";
					out.println(msg);
					break;
				case "NMK":
					result = Conversor.nauticalMileToKilometer(inputValue);
					msg = inputValue + " milhas náuticas é equivalente a " + result + " quilômetros.";
					out.println(msg);
					break;
				case "KNM":
					result = Conversor.kilometerToNauticalMile(inputValue);
					msg = inputValue + " quilômetros é equivalente a " + result + " milhas náuticas.";
					out.println(msg);
					break;
				}

			}
		%>
	</div>

</body>
</html>