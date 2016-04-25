// The prompt for this programming problem can be found at https://projecteuler.net/problem=2

import java.util.ArrayList;


public class Main {
	public static void main(String[] args){
		long number = 1;
		long sum =0;
		long placeholder = 0;
		long lastnumber = 0;
		while (number <4000000) {
			if (number % 2 ==0) {
				sum += number;
			}
			placeholder= number;
			number += lastnumber;
			lastnumber = placeholder;
			System.out.println(number);
		}
		System.out.println("the sum of the even fibinacci numbers is: " + sum);
		
	}
}
