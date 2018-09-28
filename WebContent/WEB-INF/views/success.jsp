<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>success</h1>
	<h2>this is the best word</h2>
	${requestScope.time }
	${requestScope.name }
	${sessionScope.player }
	schoolsession:${sessionScope.school }
	schoolrequest:${requestScope.school }
	<fmt:message key="i18n.username"></fmt:message>
	<fmt:message key="i18n.password"></fmt:message>
</body>
</html>