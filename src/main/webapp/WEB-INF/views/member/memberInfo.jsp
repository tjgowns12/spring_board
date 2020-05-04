<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<c:choose>
		<c:when test="${id ne null}">
			<c:import url="../default/header.jsp" />
			<div align="center">
				<h1>회 원 정 보</h1>
				<table border="1" style="width: 200px">
					<tr>
						<th>아이디</th>
						<th>비밀번호</th>
					</tr>
					<c:forEach var="dto" items="${list }">
						<tr>
							<td><a href="privacy?id=${dto.id }">${dto.id }</a></td>
							<td>${dto.pw }</td>
						</tr>
					</c:forEach>
				</table>
			</div>
			<c:import url="../default/footer.jsp" />
		</c:when>

		<c:otherwise>
			<script type="text/javascript">
				alert("로그인을 해주세요")
				location.href = "login";
			</script>
		</c:otherwise>

	</c:choose>
</body>
</html>