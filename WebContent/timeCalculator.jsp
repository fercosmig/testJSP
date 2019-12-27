<%@page import="java.text.SimpleDateFormat"%>
<%@page import="controller.CalculadoraDataController"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar"%>
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
		<h1>Calculo de intervalo entre datas.</h1>
	</div>

	<form id="frm1" name="form1" method="post" action="timeCalculator.jsp">
		<table>
			<tr>
				<td><label for="dti">Data inicial: </label></td>
				<td><input type="datetime-local" id="dti" name="dtini"
					required="required" /></td>
			</tr>
			<tr>
				<td><label for="dtf">Data final: </label></td>
				<td><input type="datetime-local" id="dtf" name="dtfin"
					required="required" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Calcular" /></td>
			</tr>
		</table>
	</form>

	<br />
	<br />
	<div class="res">
		<%
			String sd = request.getParameter("dtini");
			String ed = request.getParameter("dtfin");

			if (sd != null && ed != null) {
				Calendar cs = CalculadoraDataController.convertStringToCalendar(sd);
				Calendar ce = CalculadoraDataController.convertStringToCalendar(ed);

				String msg = CalculadoraDataController.retrieveInterval(cs, ce);
				out.println(msg);
			}
		%>
	</div>

</body>
</html>