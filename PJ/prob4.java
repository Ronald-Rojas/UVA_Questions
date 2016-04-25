// The prompt for this programming problem can be found at https://projecteuler.net/problem=4

public class Main {
	public static void main(String[] args){
		int topint= 0;
		for (int number1 = 0; number1 < 1000; number1++) {
			for (int number2 = number1; number2 < 1000; number2++) {
				int product = number1 * number2;
				String prodstr = String.valueOf(product);
				if ( new StringBuffer(prodstr).reverse().toString().equals(prodstr) && product > topint) {
					topint = product;
					System.out.println(topint);
				}
					 
			}
		}
	
	}

}
