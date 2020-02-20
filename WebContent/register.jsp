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
		<td><center><h2>Registration</h2></center></td>
		</tr>
			<tr>
				<td><label for=" ">FullName</label></td>
				<td><input type="text" name="fullname"/></td>
			</tr>
			<tr>
				<td><label for=" ">Email</label></td>
				<td><input type="email" name="email"/></td>
			</tr>
			<tr>
				<td><label for=" ">Mobile</label></td>
				<td><input type="tel" name="mobile"/></td>
			</tr>
			<tr>
				<td><label for=" ">Username</label></td>
				<td><input type="text" name="username" /></td>
				
			</tr>
			<tr>
				<td><label for=" ">Password</label></td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td><label for=" ">ConfirmPassword</label></td>
				<td><input type="password" name="confirmpassword" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="register" /></td>
			</tr>
			<tr>
			      <td><button><label for=" ">Register as Owner</label></button></td>
			 </tr>
		     <tr>
			        <td><button><label for=" ">Register as Tanent</label></button></td>
			</tr>
			<tr>
				<td><label for=" ">Already have account?</label></td>
				</tr>
				<tr>
				<td><a href="login.jsp">login</a></td>
			</tr>
		</table>
	</form>
</body>
</html>