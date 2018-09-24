
public class PennyCalculator {
	 /*
	  * Assignment:  
	  *
	  *    Write a program to handle this task. You have 458 pennies in a jar. Calculate the number of dollars, 
	  *    quarters, dimes, nickels and pennies you will get from the bank. (The bank will give you the fewest coins 
	  *    possible.) Print out the number of dollars, quarters, dimes, nickels, and pennies you will get from the 
	  *    bank. Print out the total number of coins you will get. (Is a dollar bill a coin?)  
	  *    Print out each value on a different line.  
	 */
	public static void main(String[] args) {
		int dollars = 0;
		final int dollarValue = 100;
		int quarters = 0;
		final int quarterValue = 25;
		int dimes = 0;
		final int dimeValue = 10;
		int nickels = 0;
		final int nickelValue = 5;
		int pennies = 0;
		final int pennyValue = 1;
		int money = 458;
		
		dollars = (money / dollarValue);
		money = (money % dollarValue);
		quarters = (money / quarterValue);
		money = (money % quarterValue);
		dimes = (money / dimeValue);
		money = (money % dimeValue);
		nickels = (money / nickelValue);
		money = (money % nickelValue);
		pennies = (money / pennyValue);
		int totalCoins = (quarters + dimes + nickels + pennies);
		
		System.out.println("dollars: " + dollars);
		System.out.println("quarters: " + quarters);
		System.out.println("dimes: " + dimes);
		System.out.println("nickels: " + nickels);
		System.out.println("pennies: " + pennies);
		System.out.println("Total number of coins: " + totalCoins);
	}

}
