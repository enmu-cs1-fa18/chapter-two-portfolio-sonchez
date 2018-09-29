

/**
 * Calculates how many full cases can be filled with a given number of cans.
 * 
 * @author
 * @version
 * @date
 */
public class CaseCounter {
	/*
	 * SPECIFICATIONS:
	 * You have 457 cans and a case holds 12 cans. 
	 * Print out how many full cases you will have. 
	 * Print out how many cans are left over. 
	 * (Should 457 and 12 be constants or be typed into the code?)
	 */
	
	/**
	 * The main method where you will execute your code.
	 * @param args
	 the instructions specify that i have specific amounts for each variable.
	 therefore they are unchanging constants. there are no instructions
	 to expect changing values.
	 The program in inherently rounding up to the nearest whole number.
	 Therefore any partial cans are considered a whole. This makes sense
	 in the context of you cannot have a partial can. 
	 */
	public static void main(String[] args) {
		final int totalCans = 457;
		final int caseMax = 12;
		int maxFullCases = 0;
		int leftOverCans = 0;
		maxFullCases = (totalCans / caseMax);
		leftOverCans = (totalCans % caseMax);
		System.out.println("The amount of full cases is: " + maxFullCases);
		System.out.println("The left over amount of cans is: "+ leftOverCans);
	}

}
