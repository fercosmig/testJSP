<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.text.SimpleDateFormat, java.util.List, java.util.ArrayList,
	model.Note, repository.NoteRepository"
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
		<h1>Anotações diversas</h1>
	</div>

	<form name="frmNew" method="post" action="noteScript.jsp">
		<input type="hidden" name="action" value="create" />
		<table>
			<tr>
				<th colspan="2">Inclusão de anotações</th>
			</tr>
			<tr>
				<td>Descrição:</td>
				<td><textarea rows="5" cols="80" name="description" id="td"
						required="required"></textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Salvar"
					class="w200" /></td>
			</tr>
		</table>
	</form>

	<br />
	<br />

	<table>
		<caption>Lista de anotações</caption>
		<tr>
			<th>Data</th>
			<th>Descrição</th>
			<th>Alterar</th>
			<th>Excluir</th>
		</tr>

		<%
			NoteRepository nr = new NoteRepository();
			List<Note> notes = new ArrayList<Note>();
			String pattern = "EEE, MMM dd, yyyy HH:mm:ss";
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			String aux = null;
			try {
				notes = nr.retrieveList();
				for (Note n : notes) {

					aux = n.getDescription();
					aux = aux.replaceAll("\r\n", "<br />");
					out.println("<tr>");
					out.println("<td>" + sdf.format(n.getRegistrationdate()) + "</td>");
					out.println("<td>" + aux + "</td>");
					out.println("<td>");
					out.println("<form name='u" + n.getId() + "' method='post' action='noteUpdate.jsp'>");
					out.println("<input type='hidden' name='id' value='" + n.getId() + "' />");
					out.println("<input type='submit' value='Alterar' />");
					out.println("</form>");
					out.println("</td>");
					out.println("<td>");
					out.println("<form name='d" + n.getId() + "' method='post' action='noteScript.jsp'>");
					out.println("<input type='hidden' name='action' value='delete' />");
					out.println("<input type='hidden' name='id' value='" + n.getId() + "' />");
					out.println("<input type='submit' value='Excluir' />");
					out.println("</form>");
					out.println("</td>");
					out.println("</tr>");
					out.println("</form>");
				}
			} catch (Exception e) {
				out.println("0 registros.");
			}
		%>
	</table>

</body>
</html>