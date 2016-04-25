// The prompt for this programming problem can be found at https://projecteuler.net/problem=5
public class Main {
	public static void main(String[] args){
		boolean found = false;
		long number = 0;
		while (found == false) {
			number+= 20;
			int count = 0;
			System.out.println(number);
			for (int divider = 10; divider < 20; divider++) {
				if (number % divider ==0) {
					count++;
				}
				if (count == 10) {
					System.out.println(number);
					found = true;
				}
			}
		}
	}
}
