import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {

		String str1 = "heart1";
		String str2 = "earth1";
		boolean result = false;

       /* String[] letters1 = str1.split("");
        String[] letters2 = str2.split("");

        */

		char[] a1 = str1.toCharArray(); // [h,e,a,r,t]
		char[] a2 = str2.toCharArray(); // [e,a,r,t,h]

		Arrays.sort(a1);
		Arrays.sort(a2);

		System.out.println("Sorted a1 = " + Arrays.toString(a1));
		System.out.println("Sorted a2 = " + Arrays.toString(a2));

		boolean isAnagram = Arrays.equals(a1,a2);

		System.out.println("isAnagram = " + isAnagram);


       /* for ( String letters: str1){
            for (String letters2 : str2) {
                if (letters.equals(letters2)){
                  result = true;
                }
            }
        }
        System.out.println("result = " + result);

        */
	}
}
/*
2. Write a  function that check if a string is build out of the same letters as another string. (Anagram Task)

            Ex: str1 = "heart"
            	str2 = "earth"

            output:
            	true

        		str1 = "java"
        		str2 = "python"

    		output:
    			false

 */

