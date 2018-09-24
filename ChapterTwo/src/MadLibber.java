
/**
 * Gets words from user to fill in the gaps in a story.
 * @author
 * @version
 * @date
 *
 */
import java.util.Scanner;
public class MadLibber {
	/* 
	 * 	  Assignment:
	 * 	  The user inputs two adjectives, three nouns, a number, a verb, and a body part. 
	 *    The program outputs this story with the nouns and adjectives inserted into the 
	 *    appropriate places in the song below (it's a MadLib). Make sure the printed lines are 
	 *    all about the same length. Be sure to follow all the standards of good coding.
	 *    Keep your inputs respectable on the version you copy/paste to submit to me!
	 */
	
	/*	  MADLIB:
	 * 
	 *    Hey baby, I guarantee there'll be Adj1 times. I guarantee that at some
	 *    Noun1, Number1 or both of us is gonna want to get out of this Noun2. But
	 *    I also guarantee that if I don't ask you to be Adj2, I'll Verb1 it for the
	 *    rest of my Noun3, because I know in my Bodypart1, you're the only one for me.
	 *    
	 *    Be sure to double check the spacing on your output!

	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String welcome = "This is an adlib machine!\n"
					   + "I will ask for 3 nouns, a number,\n"
					   + "a verb, and a body part. Have fun!";
		String goodBye = "Thanks for playing with my adlib machine!";		
		System.out.println(welcome);
		System.out.println("Please give me a adjective!");
		String adjOne = scan.nextLine();
		System.out.println("Please give me another adjective!");
		String adjTwo = scan.nextLine();
		System.out.println("Please give me a noun!");
		String nounOne = scan.nextLine();
		System.out.println("Please give me another noun! ");
		String nounTwo = scan.nextLine();
		System.out.println("Please give me one last noun! ");
		String nounThree = scan.nextLine();
		System.out.println("Please give me a number!");
		int number = scan.nextInt();
		scan.nextLine();
		System.out.println("Please give me a verb!");
		String verb = scan.nextLine();
		System.out.println("Please give me a body part!");
		String bodyPart = scan.nextLine();
		System.out.println("Thanks a bunch. Here is your madlib!");
		System.out.println("Hey baby, I guarantee there'll be " + adjOne + " times. I guarantee that at some\r\n"
					  	  + nounOne + ", "+ number + " or both of us is gonna want to get out of this " + nounTwo + ". But\r\n"
					      + "I also guarantee that if I don't ask you to be " + adjTwo + ", I'll " + verb + " it for the\n" 
					      + "rest of my " + nounThree + ", because I know in my " + bodyPart + ", you're the only one for me.");
		System.out.println(goodBye);
	}

}
