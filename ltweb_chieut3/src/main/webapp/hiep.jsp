<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Redirecting to Login</title>
</head>
<body>
    <script type="text/javascript">
        window.location.href = "${pageContext.request.contextPath}/login";
    </script>
</body>
</html>