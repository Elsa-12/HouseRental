 function validate() {
	

	let elements = document.forms['register'].elements;
	let fullname = elements['fullname'].value;
	let email = elements['email'].value;
	let mobile = elements['mobile'].value;
	let username = elements['username'].value;
	let password = elements['password'].value;
	let confirmpassword = elements['confirmpassword'].value;
	
	let valid = true;
	
	if (fullname == '' || fullname.length == 0) {
		document.getElementById('fullnameerror').innerHTML = 'Enter the fullname';
		valid = false;
	}
	if (email == '' || email.length == 0) {
		document.getElementById('emailerror').innerHTML = 'Enter the email';
		valid = false;
	}
	if (mobile == '' || mobile.length == 0) {
		document.getElementById('mobileerror').innerHTML = 'Enter the mobile number';
		valid = false;
	}
	if (username == '' || username.length == 0) {
		document.getElementById('usernameerror').innerHTML = 'Enter the username';
		valid = false;
	}
	if (password == '' || password.length == 0) {
		document.getElementById('passworderror').innerHTML = 'Enter the password';
		valid = false;
	}
	if (confirmpassword == '' || confirmpassword.length == 0) {
		document.getElementById('confirmpassworderror').innerHTML = 'Enter the confirmPassword';
		valid = false;
	}
	return valid;
   }
