<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>ToDo List</title>
</head>
<body>
	<h1>ToDo List</h1>
	<form method="POST" action="AddEntry">
		<label>Title</label><input type="text" name="title" size="10" />
		<label>Detail</label><input type="text" name="detail" size="20" />
		<input type="submit" name="submit" value="Add New Schedule" />
	</form>
	<table border="1">
		<tbody>
			<tr>
				<th>Title</th>
				<th>Detail</th>
				<th>Operation</th>
			</tr>
			<c:forEach var="todo" items="#{todolist}">
			<tr>
				<td>${todo.title}</td>
				<td>${todo.detail}</td>
				<td>
					<form method="POST" action="RemoveEntry">
						<input type="hidden" name="id" value="${todo.id}" />
						<input type="submit" value="Done" />
					</form>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
