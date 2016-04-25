import java.math.BigInteger;
import java.util.Scanner;

// The prompt for this question can be found at https://projecteuler.net/problem=16
public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("To what power are you calculation?");
		int power = input.nextInt();
		BigInteger total = BigInteger.valueOf(1);
		// This for loop mimics an the behavior of an exponent
		for(int i=1;i<=power; i++){
			total= total.multiply(BigInteger.valueOf(2));
		}
		String totalString = total.toString();
		System.out.println(totalString);
		int sum = 0;
		// This for loops converts the digits to a character then a integer to be added to the sum of the digits
		for( int digit =0; digit<totalString.length(); digit++){
			char currentChar = totalString.charAt(digit);
			String currentString= Character.toString(currentChar);
			int currentInt= Integer.parseInt(currentString);
			System.out.println(currentInt);
			sum += currentInt;
		
		}
		System.out.println(sum);
	}
}
