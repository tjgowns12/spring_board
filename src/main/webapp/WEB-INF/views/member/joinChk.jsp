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
		<c:when test="${flag==true }">
			<script type="text/javascript">
				alert("회원가입 완료")
				location.href = "login";
			</script>
		</c:when>
		<c:otherwise>
			<script type="text/javascript">
				alert("아이디가 중복됩니다")
				location.href = "modiJoin";
			</script>
		</c:otherwise>
	</c:choose>
</body>
</html>