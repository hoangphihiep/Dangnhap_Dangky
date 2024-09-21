<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reset Password</title>
</head>
<body>
	<h2>Reset Password</h2>
	<c:if test="${alert != null}">
		<p style="color: red;">${alert}</p>
	</c:if>
	<form action="\ltweb_chieut3\reset-password"
		method="POST">
		<input type="hidden" name="usernameOrEmail" value="${usernameOrEmail}">
		<label for="newPassword">New Password:</label> <input type="password"
			name="newPassword" required>
		<button type="submit">Reset Password</button>
	</form>
</body>
</html>