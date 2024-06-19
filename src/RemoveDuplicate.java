public class RemoveDuplicate {
	public static String removeDuplicates(String input) {
		String resultString = "";
		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			if (resultString.indexOf(currentChar) == -1) {
				resultString += currentChar;
			}
		}
		return resultString;

		//aabbcfgggrrt
		//0123456789
	}

	public static void main(String[] args) {
		String originalString = "programming";
		System.out.println(removeDuplicates(originalString));  // Output: "progamin"

		originalString = "hello world";
		System.out.println(removeDuplicates(originalString));  // Output: "helo wrd"

		originalString = "aabbcc";
		System.out.println(removeDuplicates(originalString));  // Output: "abc"
	}
}

