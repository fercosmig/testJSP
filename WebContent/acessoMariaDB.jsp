<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.List, java.util.ArrayList, model.User, repository.UserRepository"
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
		<h1>Teste de conexão com MySQL/MariaDB</h1>
	</div>

	<table border="1">
		<tr>
			<td>id</td>
			<td>login</td>
			<td>data de cadastro</td>
		</tr>

		<%
			List<User> allUsers = new ArrayList<User>();
			UserRepository ur = new UserRepository();
			allUsers = ur.retrieveList();

			for (User u : allUsers) {
				out.println("<tr>");
				out.println("<td>");
				out.println(u.getId());
				out.println("</td>");
				out.println("<td>");
				out.println(u.getLogin());
				out.println("</td>");
				out.println("<td>");
				out.println(u.getRegistrationDate());
				out.println("</td>");
				out.println("</tr>");
			}
		%>

	</table>

</body>
</html>