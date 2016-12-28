<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>방명록 작성</title>
</head>
<body>

	<div class="main">
		<h3 class="subtitle">글쓰기</h3>
		<form name="writeForm" id="writeForm" action="/nhn/write" method="post"
			target="" onsubmit="">

			<table cellspacing="0" class="request m_t10">
				<colgroup>
					<col style="width: 13%">
					<col style="width: 87%">
				</colgroup>
				<tbody>
					<tr>
						<th scope="row">이름</th>
						<td><input type="text" title="이름을 입력하세요" name="name"
							placeholder="이름을 입력하세요." style="width: 200px;"></td>
					</tr>
					<tr class="end">
						<th scope="row">내용</th>
						<td>
							<div style="width: 640px; height: 300px;">
								<textarea id="content" name="contents"
									style="width: 100%; height: 100%;" placeholder="내용을 입력하세요."></textarea>
							</div>
						</td>
					</tr>

					<tr>
						<th scope="row"></th>
						<td class="tleft">
							<div>
								<span>email</span> 
								<input type="text" name="email"
									placeholder="작성자" style="width: 120px;"> 
									<span>password</span>
								<input type="text" name="password" placeholder="비밀번호"
									style="width: 120px;">
							</div>
						</td>

					</tr>

				</tbody>
			</table>
		</form>
	</div>
	<div style="padding-top: 25px;">
		<a href="#" onclick="submit()">완료</a>
	</div>
</body>
<script type="text/javascript">
	function submit() {
		document.getElementById("writeForm").submit();
		return false;
	}
</script>
</html>