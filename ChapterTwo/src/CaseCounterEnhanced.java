import java.util.Scanner;

/**
 * Calculates how many full cases can be filled with a given number of cans.
 * 
 * @author chris sanchez
 * @version
 * @date 09/18/2018
 */
public class CaseCounterEnhanced {
	/*
	 * SPECIFICATIONS:
	 * A case holds 12 cans.
	 * Prompt the user to input a number of cans.
	 * Prompt user to input the cost of a can.
	 *  
	 * Print out how many full cases you will have. 
	 * Print out how many cans are left over. 
	 * Print out the total dollar value of the cans, formatted as money.
	 * 
	 * Make sure that each output value is printed on a separate line
	 * and that you describe each output clearly with words.
	 */
	
	/**
	 * The main method where you will execute your code.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the total number of cans!");
		int userCans = scan.nextInt();
		System.out.println("Thanks! Please enter the can value in dollars!");
		int dollarValue = scan.nextInt();
		final int caseMax = 12;
		int maxFullCases = 0;
		int leftOverCans = 0;
		maxFullCases = (userCans / caseMax);
		leftOverCans = (userCans % caseMax);
		double totalDollarValue = (dollarValue * userCans);
		System.out.println("The amount of full cases is: " + maxFullCases);
		System.out.println("The left over amount of cans is: "+ leftOverCans);
		System.out.printf("The dollar value of cans is: $%.2f.%n", totalDollarValue);
	}

}
