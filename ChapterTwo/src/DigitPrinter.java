



/**
 * Takes any number up to 3 digits and print out each digit individually.
 * 
 * @author chris sanchez
 * @version
 * @date 09/17/2018
 *
 */
public class DigitPrinter {
	/*
	 *    SPECIFICATIONS:
	 *    Write a program to handle this task. 
	 *    My favorite number is 349. 
	 * 	  Use final int MY_NUMBER = 349; 
	 *    Then use mod and integer division to break the number into pieces 
	 *    so you can print out each digit separately. 
	 *    (You should be able to change the value of MY_NUMBER 
	 *    to a different number and not have to change anything else in your code. 
	 *    When you re-execute your 
	 *    code, the output should match your changed value of MY_NUMBER.)
	 *    Print the first digit on one line, the second digit on the next line, and the third digit on the 
	 *    last line. Be sure to put some text before the digit that explains what it is.
	 *    The code should work for any value of MY_NUMBER up to 3 digits.
	 */
      
	/**
	 * The main method where you will execute your code.
	 * @param args
	 */
	public static void main(String[] args) {
		int numOne = 0;
		int numTwo = 0;
		int numThree = 0;
		final int MY_NUMBER = 349;
		numOne = MY_NUMBER / 100;
		numTwo = ((MY_NUMBER / 10) % 10);
		numThree = ((MY_NUMBER % 10));
		System.out.println("The first number is: " + numOne);
		System.out.println("The second number is: " + numTwo);
		System.out.println("The third number is: " + numThree);
	}

}
