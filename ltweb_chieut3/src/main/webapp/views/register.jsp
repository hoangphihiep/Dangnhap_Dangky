<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt"%>
<%@ taglib prefix="fn" uri="jakarta.tags.functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<style type="text/css">
* {box-sizing: border-box}

/* Add padding to containers */
.container {
  padding: 16px;
}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Overwrite default styles of hr */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for the submit/register button */
.registerbtn {
  background-color: #04AA6D;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.registerbtn:hover {
  opacity:1;
}

/* Add a blue text color to links */
a {
  color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
  background-color: #f1f1f1;
  text-align: center;
}

</style>
</head>
<body>
    <form action="\ltweb_chieut3\register" method="POST">
        <h2>Tạo tài khoản mới</h2>
        <c:if test="${alert !=null}">
            <h3 class="alert alert-danger">${alert}</h3>
        </c:if>
        <div class="container">

            <!-- Thêm Username -->
            <label for="username"><b>Username</b></label>
            <input type="text" placeholder="Enter Username" name="username" id="username" required>

            <!-- Thêm Fullname -->
            <label for="fullname"><b>Fullname</b></label>
            <input type="text" placeholder="Enter Fullname" name="fullname" id="fullname" required>

            <!-- Thêm Email -->
            <label for="email"><b>Email</b></label>
            <input type="text" placeholder="Enter Email" name="email" id="email" required>

            <!-- Thêm Phone -->
            <label for="phone"><b>Phone</b></label>
            <input type="text" placeholder="Enter Phone Number" name="phone" id="phone" required>

            <!-- Password -->
            <label for="password"><b>Password</b></label>
            <input type="text" placeholder="Enter Password" name="password" id="password" required>

            <!-- Repeat Password -->
            <label for="psw-repeat"><b>Repeat Password</b></label>
            <input type="text" placeholder="Repeat Password" name="psw-repeat" id="psw-repeat" required>

            <hr>

            <p>
                By creating an account you agree to our <a href="#">Terms & Privacy</a>.
            </p>
            <button type="submit" class="registerbtn">Register</button>
        </div>

        <div class="container signin">
            <p>
                Already have an account? <a href="\ltweb_chieut3\login">Sign in</a>.
            </p>
        </div>
    </form>
</body>
</html>
