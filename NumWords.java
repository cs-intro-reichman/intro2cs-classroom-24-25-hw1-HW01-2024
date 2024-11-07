
// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		// % java NumWords 517
		// 5 hundreds, 1 tens, and 7 ones.
		String number = args[0];
		int hundreds = Integer.parseInt(number);
		hundreds = hundreds / 100;
		int tens = Integer.parseInt(number);
		int tens_help = tens - (hundreds * 100);
		tens = tens_help / 10;
		int ones = Integer.parseInt(number);
		int ones_help = ones - (hundreds * 100) - (tens * 10);
		ones = ones_help;
		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}
