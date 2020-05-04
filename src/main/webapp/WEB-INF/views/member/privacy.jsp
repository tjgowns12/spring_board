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
<h1>${pri.id }님의 정보</h1>
<table style="width: 200px">
<tr>
<td>아이디</td><td>${pri.id }</td>
</tr>
<tr>
<td>비밀번호</td><td>${pri.pw }</td>
</tr>
<tr>
<td></td><td><input type="button"value="뒤로가기"onclick="location.href='back'"></td>
</tr>
</table>
<c:import url="../default/footer.jsp"/>
</div>
</body>
</html>