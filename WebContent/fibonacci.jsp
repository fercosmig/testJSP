<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="math.Fibonacci" pageEncoding="UTF-8"%>
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
	<div class="res">
		<h1>Fibonacci com Servlet e JSTL</h1>
	</div>


	<form method="post" action="Fibonacci">

		<table>
			<tr>
				<th colspan="2">Sequência de Fibonacci</th>
			</tr>
			<tr>
				<td>Escolha a quantidade de números que quer ver:</td>
				<td><select name="slqtd">
						<option value="5">5</option>
						<option value="10">10</option>
						<option value="15">15</option>
						<option value="20">20</option>
						<option value="25">25</option>
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
			<table>
				<tr>
					<c:forEach var="numero" items="${sequencia}">
						<td style="padding: 5px">${numero}</td>
					</c:forEach>

				</tr>
			</table>
	</div>

</body>
</html>