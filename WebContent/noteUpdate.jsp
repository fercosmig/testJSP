<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="model.Note, repository.NoteRepository" pageEncoding="UTF-8"%>
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

	<%
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");

		Note n = new Note();
		n.setId(Integer.parseInt(id));

		NoteRepository nr = new NoteRepository();
		n = nr.retrieveById(n);
	%>

	<form name="frmUpdate" method="post" action="noteScript.jsp">
		<input type="hidden" name="action" value="update" /> <input
			type="hidden" name="id" value="<%=n.getId()%>" />
		<table>
			<tr>
				<th colspan="2">Alteração de anotações</th>
			</tr>
			<tr>
				<td>Descrição:</td>
				<td><textarea rows="7" cols="80" name="description" id="td"
						required="required"><%=n.getDescription()%></textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Salvar"
					class="w200" /></td>
			</tr>
		</table>
	</form>

</body>
</html>