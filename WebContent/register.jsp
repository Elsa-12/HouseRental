<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body,html{
height:100%;
}
#heading{
	background-image:url("house1.jpg");
	background-position: center;
	height:100%;
    background-repeat: no-repeat;
    background-size:100% 100%;
    position: relative;
}
</style>
</head>
<body>
        <div id="heading">
	    <form novalidate name='register' action="register" onsubmit="return validate()" method="post">
		<table align="center">
		<tr>
		<td><h1 style="color:red">Registration</h1></td>
		</tr>
			<tr>
				<td><label for=" ">FullName</label></td>
				<td><input type="text" name="fullName" value="${param.fullName}" pattern="[a-zA-Z\s]{3,20}"/></td>
					<td> <span class="error" id="fullnameerror"></span></td>
				<td><span style="color:red">${errorMessages.fullnameerror}</span></td>
			</tr>
			<tr>
				<td><label for=" ">Email</label></td>
				<td><input type="email" name="email"  value="${param.email}" pattern="[a-zA-Z0-9_$#]{1,}+@[a-zA-Z]{2,7}+.[a-z]{3,6}"/></td>
					<td> <span class="error" id="emailerror"></span></td>
				<td><span style="color:red">${errorMessages.emailerror}</span></td>
			</tr>
			<tr>
				<td><label for=" ">Mobile</label></td>
				<td><input type="tel" name="mobileno" value="${param.mobileno}" pattern="[0-9]{10}"/></td>
				<td> <span class="error" id="mobileerror"></span></td>
                <td><span style="color:red">${errorMessages.mobileerror}</span></td>
			</tr>
			<tr>
               <td><label>Owner</label></td>
               <td><input type="radio" name="owner" value="owner">As Owner</td>
               <td><input type="radio" name="owner" value="tenent" >As Tenent</td>
            </tr>
			<tr>
				<td><label for=" ">Username</label></td>
				<td><input type="text" name="username" value="${param.username}" pattern="[a-zA-Z\s]{3,20}" /></td>
				<td> <span class="error" id="usernameerror"></span></td>
                 <td><span style="color:red">${errorMessages.usernameerror}</span></td>				
			</tr>
			<tr>
				<td><label for=" ">Password</label></td>
				<td><input type="password" name="password" value="${param.password}" pattern="[a-zA-z0-9@$#]{8,20}" /></td>
				<td> <span class="error" id="passworderror"></span></td>
                <td><span style="color:red">${errorMessages.passworderror}</span></td>	
			</tr>
			<tr>
				<td><label for=" ">ConfirmPassword</label></td>
				<td><input type="password" name="confirmpassword" value="${param.confirmPassword}" pattern="[a-zA-z0-9@$#]{8,20}" /></td>
				<td> <span class="error" id="confirmpassworderror"></span></td>
                <td><span style="color:red">${errorMessages.confirmpassworderror}</span></td>
			</tr>
			<tr>
				<td><center><input type="submit" value="register" /></center></td>
			</tr>
			<tr>
				<td><label for=" ">Already have account?</label></td>
				<td><center><a href="login.jsp">login</a></center></td>
			</tr>
		</table>
	</form>
	</div>
	
	<script src="validate.js"></script>
</body>
</html>