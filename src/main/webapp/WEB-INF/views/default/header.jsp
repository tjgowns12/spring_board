<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
ul{list-style-type: none;}
li{ outline:none; display: inline;}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<header>
<h1 style="color: gold;text-align: center;">CARE LAB</h1>
<hr>
<div >
<ul align="right" style="padding-right: 30px;">
<li><a href="index">HOME</a>&nbsp;&nbsp;&nbsp;</li>
<li><a href="memberInfo">회원 정보</a>&nbsp;&nbsp;&nbsp;</li>

<c:choose>
<c:when test="${sessionScope.id eq null}">
<li><a href="login">로그인</a></li>
</c:when>
<c:otherwise>
<li><a href="logout">로그아웃</a></li>
</c:otherwise>
</c:choose>
</ul>
</div>
<hr>
</header>
</body>
</html>