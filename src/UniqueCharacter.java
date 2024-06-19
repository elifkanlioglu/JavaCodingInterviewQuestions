public class UniqueCharacter {

	public static String findUniqueCharacters(String input) {

		String uniqueChars = "";

		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);

			if (input.indexOf(currentChar) == input.lastIndexOf(currentChar)) {
				uniqueChars += currentChar;
			}
		}
		return uniqueChars;
	}
}
