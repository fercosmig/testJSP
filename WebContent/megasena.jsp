<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.Date, java.text.SimpleDateFormat, repository.MegaSenaRepository,
	model.MegaSena, java.util.List, java.util.ArrayList"
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
		<h1>Cadastro de jogos da megasena</h1>
	</div>


	<form id="frm1" method="post" action="megasena.jsp"
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

	<%
		String strConcurso = request.getParameter("reqConcurso");
			if (strConcurso != null && strConcurso != "") {

		String pattern = "yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);

		int concurso = Integer.parseInt(strConcurso);
		Date dataSorteio = sdf.parse(request.getParameter("reqDataSorteio"));
		int d1 = Integer.parseInt(request.getParameter("reqD1"));
		int d2 = Integer.parseInt(request.getParameter("reqD2"));
		int d3 = Integer.parseInt(request.getParameter("reqD3"));
		int d4 = Integer.parseInt(request.getParameter("reqD4"));
		int d5 = Integer.parseInt(request.getParameter("reqD5"));
		int d6 = Integer.parseInt(request.getParameter("reqD6"));

		MegaSena m = new MegaSena();
		m.setConcurso(concurso);
		m.setDataSorteio((Date) dataSorteio);
		m.setDezena1(d1);
		m.setDezena2(d2);
		m.setDezena3(d3);
		m.setDezena4(d4);
		m.setDezena5(d5);
		m.setDezena6(d6);

		MegaSenaRepository msc = new MegaSenaRepository();
		msc.create(m);
			}
	%>
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
		<%
			List<MegaSena> todos = new ArrayList<MegaSena>();
			MegaSenaRepository mc = new MegaSenaRepository();
			todos = mc.retrieveList();
			
			String pattern = "EEE, MMM dd, yyyy";
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			for (MegaSena ms : todos) {
				out.println("<tr>");
				out.println("<td class='tac'>");
				out.println(ms.getConcurso());
				out.println("</td>");
				out.println("<td class='tac'>");
				out.println(sdf.format(ms.getDataSorteio()));
				out.println("</td>");
				out.println("<td class='tac'>");
				out.println(ms.getDezena1());
				out.println("</td>");
				out.println("<td class='tac'>");
				out.println(ms.getDezena2());
				out.println("</td>");
				out.println("<td class='tac'>");
				out.println(ms.getDezena3());
				out.println("</td>");
				out.println("<td class='tac'>");
				out.println(ms.getDezena4());
				out.println("</td>");
				out.println("<td class='tac'>");
				out.println(ms.getDezena5());
				out.println("</td>");
				out.println("<td class='tac'>");
				out.println(ms.getDezena6());
				out.println("</td>");
				out.println("</tr>");
			}
		%>
	</table>

</body>
</html>