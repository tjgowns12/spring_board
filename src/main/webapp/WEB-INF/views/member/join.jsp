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
<c:import url="../default/header.jsp"/>
<div align="center">
<h1>회 원 등 록</h1>
<form action="join">
<table>
<tr>
<td><input type="text" name="id" placeholder="아이디"></td>
</tr>
<tr>
<td><input type="password" name="pw" placeholder="비밀번호"></td>
</tr>
<tr><td><input type="submit" value="회원 가입"></td></tr>
</table>
</form>
</div>
<c:import url="../default/footer.jsp"/>

</body>
</html>