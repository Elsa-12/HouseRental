package housrental.util;

import java.util.HashMap;
import java.util.Map;

import houserentals.dto.RegisterProfile;

public class Validations {
	
	public Map<String,String> validate(RegisterProfile profile) {
		
		Map<String,String> errorMessages=new HashMap<String,String>();
		
		if(profile.getFullName().isEmpty()) {
			errorMessages.put("fullnameerror","Enter fullname");
		}
		if(profile.getEmail().isEmpty()) {
			errorMessages.put("emailerror","Enter Email");
		}
		if(profile.getMobileno().isEmpty()) {
			errorMessages.put("mobileerror","Enter mobile");
		}
		else if(!(profile.getMobileno().length()==10 || mobileValidate(profile.getMobileno()))) {
			errorMessages.put("mobileerror","Enter mobile");
		}
		if(profile.getUsername().isEmpty()) {
			errorMessages.put("usernameerror","Enter email");
		}
		if(profile.getPassword().isEmpty()) {
			errorMessages.put("passworderror","Enter password");
		}
		if(profile.getConfirmPassword().isEmpty()) {
			errorMessages.put("confirmpassworderror","Enter confirmpassword");
		}
		if(!(profile.getPassword().equals(profile.getConfirmPassword()))) {
			errorMessages.put("passwordmatcchingerror","Enter matching password");
		}
		return errorMessages;
	}
	public boolean mobileValidate(String mobileno) {
			for (int index = 0; index < mobileno.length(); index++) {
				char ch = mobileno.charAt(index);
				if (!(Character.isDigit(ch))) {
					return false;
				}
			}
			return true;
		}

public boolean validate(String email,String password){
	
	if(email.isEmpty()) {
		return true;
	}
	
	if(password.isEmpty()) {
		return true;
	}
	return false;
}
	
}
  