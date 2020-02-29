<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body,html{
height:100%;
}
#heading{
	background-image:url("house2.jpg");
	background-position: center;
	height:100%;
    background-repeat: no-repeat;
    background-size: 100% 100%;
    position: relative;
}
</style>
<body>
<div id="heading">
	<form novalidate name='login' action="login" onsubmit="return loginvalidate()" method="post">>
		<table align="center">
			<tr>
				<td><h1 style="color:red">Login</h1></td>
			</tr>
			<tr>
				<td><label for=" " >Email</label></td>
				<td><input type="email" name="email"  value="${param.email}" pattern="[a-zA-Z0-9_$#]{1,}+@[a-zA-Z]{2,7}+.[a-z]{3,6}" /></td>
				<td> <span class="error" id="emailerror"></span></td>
				<td><span style="color:red">${errorMessages.emailerror}</span></td>
			</tr>
			<tr>
				<td><label for=" ">Password</label></td>
				<td><input type="password" name="password" value="${param.password}" pattern="[a-zA-z0-9@$#]{8,20}" /></td>
				<td> <span class="error" id="passworderror"></span></td>
                <td><span style="color:red">${errorMessages.passworderror}</span></td>	
			</tr>
			</tr>
			<tr>
				<td><input type="submit" value="login" /></td>
			</tr>
			<tr>
				<td><a href="forget.jsp">Forgot Password</a></td>
				</tr>
				<tr>
				<td><a href="register.jsp">Click here to Register</a></td>
			</tr>
		</table>
	</form>
	</div>
	<script src="loginvalidate.js"></script>
</body>
</html>