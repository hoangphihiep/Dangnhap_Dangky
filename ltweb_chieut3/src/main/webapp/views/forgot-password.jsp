<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Forgot Password</title>
</head>
<body>
	<h2>Forgot Password</h2>
	<c:if test="${alert != null}">
		<p style="color: red;">${alert}</p>
	</c:if>
	<form action="\ltweb_chieut3\forgot-password"
		method="POST">
		<label for="usernameOrEmail">Username or Email:</label> <input
			type="text" name="usernameOrEmail" required>
		<button type="submit">Submit</button>
	</form>
</body>
</html>