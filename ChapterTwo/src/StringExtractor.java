
/**
 * Extracts a particular string from a longer one.
 * @author
 * @version
 * @date
 *
 */
public class StringExtractor {
	 /* 
	 * Assignment:
	 * 1. Using any of the string methods, write a sequence of commands that will extract 
	 *    characters from final String inputString = "The quick brown fox jumps over the lazy dog." to make
	 *    outputString = "Tempus fugit.". Then print inputString and outputString. Be sure to add some 
	 *    text so we know what has been done! 
	 *    
	 *    Correct any style, runtime, or compiler errors in the starter code.
	 */
	public static void main(String[] args) {
		final String inputString = "The quick brown fox jumps over the lazy dog.";
		final String outputString = "Tempus fugit";		
		
		String firstWord = Character.toString(inputString.charAt(0));
		firstWord = firstWord + Character.toString(inputString.charAt(2));
		firstWord = firstWord+ Character.toString(inputString.charAt(22));
		firstWord = firstWord + Character.toString(inputString.charAt(23));
		firstWord = firstWord + Character.toString(inputString.charAt(21));
		firstWord = firstWord + Character.toString(inputString.charAt(24));
		firstWord = firstWord + Character.toString(inputString.charAt(25));
		
		String secondWord = Character.toString(inputString.charAt(16));
		secondWord = secondWord + Character.toString(inputString.charAt(5));
		secondWord = secondWord + Character.toString(inputString.charAt(42));
		secondWord = secondWord + Character.toString(inputString.charAt(6));
		secondWord = secondWord + Character.toString(inputString.charAt(31));
		secondWord = secondWord + Character.toString(inputString.charAt(43));

				
		System.out.println("my output: " + firstWord + secondWord);
		System.out.println(inputString);
		System.out.println(outputString);
	}

}
