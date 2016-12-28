<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>first</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
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
			<c:forEach items="${Users}" var="User">
				<tr>
					<td>${User.userid}</td>
					<td>${User.username}</td>
					<td>${User.email}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<div style="padding-top: 25px;">
		<a href="/nhn/write">write</a>
	</div>

</body>
</html>