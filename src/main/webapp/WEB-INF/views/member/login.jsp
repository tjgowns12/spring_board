<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
table a:link { color: black; text-decoration: none;}
table a:visited { color: black; text-decoration: none;}
table a:hover { color: black; text-decoration: none;}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<c:import url="../default/header.jsp" />
	<h1 style="text-align: center;">로그인 페이지 입니다.</h1>
		<div align="right">
		<form action="logChk">
			<table>
				<tr>
					<td><input type="text" placeholder="아이디" name="id"></td>
					<td rowspan="2"><input type="submit" value="로그인" style="padding: 15px;"></td>
				</tr>
				<tr>
					<td><input type="password" placeholder="비밀번호" name="pw"></td>		
				</tr>
				<tr>
				<td><a href="modiJoin" style="">회원 가입</a></td>
				</tr>
			</table>
		</form>
		</div>

	<c:import url="../default/footer.jsp" />

</body>
</html>