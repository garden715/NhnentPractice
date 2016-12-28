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
		<thead>
			<tr>
				<th scope="col">번호 </th>
				<th scope="col">작성자 </th>
				<th scope="col">이메일 </th>
				<th scope="col">제목 </th>
				<th scope="col">수정일 </th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${posts}" var="post">
				<tr>
					<td>${post.id}</td>
					<td>${post.name}</td>
					<td>${post.email}</td>
					<td>${post.title}</td>
					<td>${post.updateDate}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<div style="padding-top: 25px;">
		<a href="/nhn/write">글작성</a>
	</div>

</body>
</html>