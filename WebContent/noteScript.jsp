<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="model.Note, repository.NoteRepository" pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8");
	String action = request.getParameter("action");

	String id = null;
	String description = null;

	switch (action) {
	case "create":
		description = request.getParameter("description");
		description = description.trim();
		Note nc = new Note();
		nc.setDescription(description);
		NoteRepository nrc = new NoteRepository();
		nrc.create(nc);
		break;
	case "update":
		id = request.getParameter("id");
		description = request.getParameter("description");
		description = description.trim();
		Note nu = new Note();
		nu.setId(Integer.parseInt(id));
		nu.setDescription(description);
		NoteRepository nru = new NoteRepository();
		nru.update(nu);
		break;
	case "delete":
		id = request.getParameter("id");
		Note nd = new Note();
		nd.setId(Integer.parseInt(id));
		NoteRepository nrd = new NoteRepository();
		nrd.delete(nd);
		break;
	}
	//response.sendRedirect("note.jsp");
%>
<jsp:forward page="note.jsp" />
