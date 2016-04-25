// The prompt for this programming problem can be found at https://projecteuler.net/problem=7

import java.util.ArrayList;
import java.util.Iterator;


public class Main {
	public static void main(String[] args){
		ArrayList<Integer> primesList = new ArrayList<Integer>();
			int number = 3;
			primesList.add(2);
			while (primesList.size() < 10001) {
				boolean add = true;
				for (int primeNum : primesList){
					if (number % primeNum == 0) {
						add = false;
						break;
					}
				}
				if (add == true) {
					primesList.add(number); 
					System.out.println(primesList);
				}
				number += 2;
			}
		
			
		System.out.println(primesList.get(1000));
	}
}
