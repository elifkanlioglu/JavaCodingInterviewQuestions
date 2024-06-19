public class Palindrome {

	public static void main(String[] args) {
		String palindrome = "Madam";
		String reverse = "";
		for (int i = palindrome.length() - 1; i >= 0; i--) {
			reverse += palindrome.charAt(i);
		}
		if (reverse.equalsIgnoreCase(palindrome)){
			System.out.println(palindrome + " is palindrome");
		};

	}
}
