<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

<form action="LoginServlet" method="post">
<table style="background-color:skyblue;margin-left:20px;margin-right:20px;">
<tr>
<td><h3 style="color:blue;">LOGIN PAGE....</h3></td>
<td></td>
</tr>
<tr><td>ENTER NAME:<td><td><input type=text name=txtName></td></tr>
<tr><td>ENTER PASSWORD:<td><td><input type=password name=txtpwd></td></tr>
<tr><td><input type=SUBMIT  name="submit"value=login></td><td><a href="register.jsp">RESGISTER</a></td></tr>

</table>
</form>
</body>
</html>
