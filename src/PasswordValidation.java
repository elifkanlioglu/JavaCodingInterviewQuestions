public class PasswordValidation {
	public static boolean password(String password) {
		Boolean isDigit = false;
		Boolean isUpperCase = false;
		Boolean isLowerCase = false;
		Boolean isSpecialChar = false;


		if (password.length() >= 6) {
			for (char each : password.toCharArray()) {
				if (Character.isDigit(each)) {
					isDigit = true;
				} else if (Character.isUpperCase(each)) {
					isUpperCase = true;
				} else if (Character.isLowerCase(each)) {
					isLowerCase = true;
				} else {
					isSpecialChar = true;
				}
			}
		}
		return isDigit && isLowerCase && isUpperCase && isSpecialChar;
	}
}

