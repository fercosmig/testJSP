<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="controller.MenuLinksController,java.util.List,model.MenuLinks"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="testJSP.js"></script>
<link rel="stylesheet" href="style.css" />
<title>JSP Tests</title>
</head>
<body>

	<div class="header">
		<i><b>.:: Fer Cos Mig ::.</b></i>
	</div>

	<div id="all" class="all">
		<div id="mnu" class="mnu">
			<table>
				<tr>
					<th><h2>Menu</h2></th>
				</tr>
				<%
					MenuLinksController mc = new MenuLinksController();
					List<MenuLinks> itens = mc.getMenuItens();
					for (MenuLinks m : itens) {
						out.println("<tr>");
						out.println("<td>");
						out.println("<a href='" + m.getUrl() + "' target='" + m.getTarget() + "'>");
						out.println(m.getName());
						out.println("</a>");
						out.println("</td>");
						out.println("</tr>");
					}
				%>
			</table>
		</div>

		<div id="frm" class="frm">
			<iframe id="cnt" name="conteudo" src="home.jsp" class="ifrm"
				onload="javascript: resizeIframe(this);"></iframe>
		</div>
	</div>

	<%@include file="botton.jsp"%>
</body>
</html>