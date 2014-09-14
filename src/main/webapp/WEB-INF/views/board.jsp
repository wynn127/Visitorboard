<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>VisitorBoard</title>
<script src="resources/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="resources/css/bootstrap-theme.min.css">
<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="resources/css/styles.css">
</head>

<body>
	<div class="container_board">
	<h1 class="page-header">Visitor Board</h1>
	<div class="container_button" style="display:box; float:right; padding-right:3%; margin-bottom:2%;">
		<input type="button" class="btn btn-default" value="New">
		<input type="button" class="btn btn-default" value="Update">
		<input type="button" class="btn btn-default" value="Delete">
	</div>
	<table class="table table-striped">
		<thead>
			<tr>
				<th class="col-md-2">Email</th>
				<th class="col-md-6">Content</th>
				<th class="col-md-2">Registered Date</th>
				<th class="col-md-2">Modified Date</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="boardItem" items="${boardList}">
			<tr>
				<th>${boardItem.email }</th>
				<th>${boardItem.content }</th>
				<th>${boardItem.registeredDate }</th>
				<th>${boardItem.updatedDate }</th>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	</div>
	
</body>
</html>