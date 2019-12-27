<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="testJSP.js"></script>
<link rel="stylesheet" href="style.css" />
</head>
<body>

	<%
		Calendar startDate = Calendar.getInstance();
	%>



	<div class="res">
		<h1>Cadastro de jogos da megasena</h1>
	</div>


	<form id="frm1" method="post" action="MegaSenaServlet"
		onsubmit="javascript: return validateForm('frm1');">

		<table>
			<tr>
				<td>Concurso:</td>
				<td><input type="number" name="reqConcurso" title="concurso" /></td>
			</tr>
			<tr>
				<td>Data do sorteio:</td>
				<td><input type="date" name="reqDataSorteio"
					title="Data do sorteio" /></td>
			</tr>
			<tr>
				<td>Dezena 1:</td>
				<td><input type="number" name="reqD1" title="Dezena 1" /></td>
			</tr>
			<tr>
				<td>Dezena 2:</td>
				<td><input type="number" name="reqD2" title="Dezena 2" /></td>
			</tr>
			<tr>
				<td>Dezena 3:</td>
				<td><input type="number" name="reqD3" title="Dezena 3" /></td>
			</tr>
			<tr>
				<td>Dezena 4:</td>
				<td><input type="number" name="reqD4" title="Dezena 4" /></td>
			</tr>
			<tr>
				<td>Dezena 5:</td>
				<td><input type="number" name="reqD5" title="Dezena 5" /></td>
			</tr>
			<tr>
				<td>Dezena 6:</td>
				<td><input type="number" name="reqD6" title="Dezena 6" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Salvar"></td>
			</tr>

		</table>
		<br /> <br /> <br />
	</form>

	<table>
		<tr>
			<th>Concurso</th>
			<th>Data do sorteio</th>
			<th>Dezena 1</th>
			<th>Dezena 2</th>
			<th>Dezena 3</th>
			<th>Dezena 4</th>
			<th>Dezena 5</th>
			<th>Dezena 6</th>
		</tr>

		<c:forEach var="sorteio" items="${todosSorteios}">
			<tr>
				<td class='tac'>${sorteio.concurso}</td>
				<td class='tac'>${sorteio.dataSorteio}</td>
				<td class='tac'>${sorteio.dezena1}</td>
				<td class='tac'>${sorteio.dezena2}</td>
				<td class='tac'>${sorteio.dezena3}</td>
				<td class='tac'>${sorteio.dezena4}</td>
				<td class='tac'>${sorteio.dezena5}</td>
				<td class='tac'>${sorteio.dezena6}</td>
			</tr>
		</c:forEach>
	</table>

	<%
		Calendar endDate = Calendar.getInstance();
		Long diffInMillis = endDate.getTimeInMillis() - startDate.getTimeInMillis();
		long diffInSeconds = diffInMillis / 1000;
		out.println("Demorou " + diffInSeconds + " segundos para carregar.");
	%>
</body>
</html>