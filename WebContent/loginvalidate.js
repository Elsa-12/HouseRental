function loginvalidate() {
	

	let elements = document.forms['login'].elements;
	let email = elements['email'].value;
	let password = elements['password'].value;
	
	let valid=true;
	
	if (email == '' || email.length == 0) {
		document.getElementById('emailerror').innerHTML = 'Enter the email';
		valid = false;
	}
	if (password == '' || password.length == 0) {
		document.getElementById('passworderror').innerHTML = 'Enter the password';
		valid = false;
	}
	return valid;
}