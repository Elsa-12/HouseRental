<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form>
		<table align="center" frame="box">
			<tr>
				<td><h4 align="center">Login</h4></td>
			</tr>
			<tr>
				<td><label for=" ">Email</label></td>
				<td><input type="email" name="email" /></td>
			</tr>
			<tr>
				<td><label for=" ">Password</label></td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td><center><input type="submit" value="login" /></center></td>
			</tr>
			<tr>
				<td><a href="forget.jsp">Forgot Password</a></td>
				</tr>
				<tr>
				<td><a href="register.jsp">Click here to Register</a></td>
			</tr>
		</table>
	</form>
</body>
</html>