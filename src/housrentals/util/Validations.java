package housrentals.util;

import java.util.HashMap;
import java.util.Map;

import houserentals.dto.AddRentalProfile;
import houserentals.dto.RegisterProfile;

public class Validations {
	Map<String,String> errorMessages=new HashMap<String,String>();
	public Map<String,String> validate(RegisterProfile profile) {
		
		
		
		if(profile.getFullname().isEmpty()) {
			errorMessages.put("fullnameerror","Enter fullname");
		}
		if(profile.getEmail().isEmpty()) {
			errorMessages.put("emailerror","Enter Email");
		}
		if(profile.getMobile().isEmpty()) {
			errorMessages.put("mobileerror","Enter mobile");
		}
		else if(!(profile.getMobile().length()==10 || mobileValidate(profile.getMobile()))) {
			errorMessages.put("mobileerror","Enter mobile");
		}
		if(profile.getUsername().isEmpty()) {
			errorMessages.put("usernameerror","Enter email");
		}
		if(profile.getPassword().isEmpty()) {
			errorMessages.put("passworderror","Enter password");
		}
		if(profile.getConfirmpassword().isEmpty()) {
			errorMessages.put("confirmpassworderror","Enter confirmpassword");
		}
		if(!(profile.getPassword().equals(profile.getConfirmpassword()))) {
			errorMessages.put("passwordmatcchingerror","Enter matching password");
		}
		return errorMessages;
	}
	public boolean mobileValidate(String mobile) {
			for (int index = 0; index < mobile.length(); index++) {
				char ch = mobile.charAt(index);
				if (!(Character.isDigit(ch))) {
					return false;
				}
			}
			return true;
		}

public Map<String,String> loginValidate(String email,String password){
	
	//Map<String,String> errorMessages=new HashMap<String,String>();
	if(email.isEmpty()) {
		errorMessages.put("emailerror","Enter email");
	}
	
	if(password.isEmpty()) {
		errorMessages.put("passworderror","Enter Password");
	}
	return errorMessages;
}
public Map<String,String> addHouseRentalValidation(AddRentalProfile rental) {
	
	
	/*if(rental.getSquareFeet().isEmpty()) {
		errorMessages.put("squareFeeterror","Enter square feet");
	}*/
	if(rental.getRentalCost().isEmpty()) {
		errorMessages.put("rentalCosterror","Enter rentalCost");
	}
	if(rental.getParkingAvaliable().isEmpty()) {
		errorMessages.put("parkingAvaliableerror","Enter parkingAvaliable");
	}
	if(rental.getGarden().isEmpty()) {
		errorMessages.put("gardenerror","choose garden");	
	}
	/*if(rental.getAddress().isEmpty()) {
		errorMessages.put("addresserror","Enter Address");
	}*/
	return errorMessages;
}
	
}
  