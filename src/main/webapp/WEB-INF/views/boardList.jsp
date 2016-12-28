<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>방명록 목록</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>
	<h2>방명록 목록</h2>
	<table style="border: 1px solid #ccc">
		<colgroup>
			<col width="10%" />
			<col width="15%" />
			<col width="20%" />
		</colgroup>
		<thead>
			<tr>
				<th scope="col">id</th>
				<th scope="col">name</th>
				<th scope="col">email</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${posts}" var="post">
				<tr>
					<td>${post.id}</td>
					<td>${post.email}</td>
					<td>${post.contents}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<div style="padding-top: 25px;">
		<a href="/nhn/write">write</a>
	</div>

</body>
</html>