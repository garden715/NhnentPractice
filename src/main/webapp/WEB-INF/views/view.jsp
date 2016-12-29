<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록</title>
</head>
<body>
	<h3 class="subtitle">[${post.id}] - ${post.title}</h3>
	<table cellspacing="0">
		<colgroup>
			<col style="width: 13%">
			<col style="width: 87%">
		</colgroup>
		<tbody>
			<tr>
				<th>작성자 :</th>
				<td><span>${post.name}</span></td>
			</tr>
			<tr>
				<th>작성일 :</th>
				<td><span><fmt:formatDate value="${post.regDate}"
							pattern="yyyy-MM-dd HH:mm:ss" /> </span></td>
			</tr>
			<tr>
				<th>수정일 :</th>
				<td><span><fmt:formatDate value="${post.updateDate}"
							pattern="yyyy-MM-dd HH:mm:ss" /> </span></td>
			</tr>
			<tr>
				<th>내용 :</th>
				<td>
					<div style="width: 640px;">
						<p>${post.contents}</p>
					</div>
				</td>
			</tr>
		</tbody>
	</table>

	<div style="padding-top: 25px;">
		<a href="/nhn/edit?postId=${post.id}">수정</a>
		<a href="/nhn">삭제</a>
		<a href="/nhn">목록</a>
	</div>
</body>
</html>