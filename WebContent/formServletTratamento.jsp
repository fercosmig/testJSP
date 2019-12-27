<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.Calendar, java.text.SimpleDateFormat"
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
		<h1>Servlet + EL</h1>
	</div>

	<h4>Dados do Servlet</h4>

	<ul>
		<li>Seu nome é ${nome}</li>
		<li>Seu e-mail é ${email}</li>
		<li>Sua data de nascimento é ${dataNascimento}</li>
	</ul>

</body>
</html>