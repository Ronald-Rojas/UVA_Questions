// The prompt for this programming problem can be found at https://projecteuler.net/problem=12
package main;

public class Main {

	public static void main(String[] args) {
		boolean found = false;
		long count = 3;
		long triNum = 6;
		while(found == false){
			count ++;
			triNum += count;
			// this "if" statement will make sure that the current triangle numbe will have many divisors
			// since we are checking for numbers with high divisors we will save time by only checking numbers that are certain to have a high number of divisors
			if(triNum% 2 ==0 && triNum %3 == 0 && triNum % 5 == 0 && triNum % 7 == 0 && triNum % 11 == 0){
				int divisors = 0;
				// this for loop will only check if a number is a divisor for up to half of the total of the triangle number since no number can has a divisor more than half of itself
				for( long num =1; num<triNum/2+1; num++){
					if(triNum % num ==0 )divisors ++;
					
				}
				System.out.println(divisors);
				if(divisors>500) found = true;
			}
		}
		System.out.println(triNum);
	}

}
