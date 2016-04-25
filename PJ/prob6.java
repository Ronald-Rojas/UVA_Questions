
// The prompt for this programming problem can be found at https://projecteuler.net/problem=6
public class Main {
	public static void main(String[] args) {
		long squaresum = 0;
		long add = 0;
		for (int number = 1; number < 101; number++) {
			squaresum += number*number;
			add +=number;
			
		}
		 long sumsquare = add*add; 
		 System.out.println(sumsquare-squaresum);
	}
}
