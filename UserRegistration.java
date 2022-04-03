package userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
	
	public boolean firstName(String name) {
		String firstName = "^[A-Z]{1}[A-Za-z]{2,}$";
		if (name.matches(firstName)) {
			return true;
		}
		return false;
	}
	
	public static boolean lastName(String lastName) {
		String LastName = "[A-Z]{1}[a-z]{3}";
		if(lastName.matches(lastName)) {
			return true;
		}
		return false;
	}
	
	
}
