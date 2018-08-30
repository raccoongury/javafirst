<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로케일 설정</title>
</head>
<body>
	<h3>대한민국</h3>
	<fmt:setLocale value="ko_kr" />
	금액:<fmt:formatNumber value="10000000"
		type="currency" /><br />
	날짜:<fmt:formatDate value="${date}"
	type="both" dateStyle="full" timeStyle="full" />
	<br />
	
</body>
</html>