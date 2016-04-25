import java.util.ArrayList;


public class Prime {
	private static ArrayList<Integer> numArray = new ArrayList<Integer>();

	public static void isPrime(int number){// This method checks to see if the number is prime and adds to the list of prime numbers
		int count = 0;
		for(int i: numArray ){
			if ( number % i != 0){
				count ++;

			}else break;// once we know that the number isn't pirme we can stop the for loop
		}
		if( count == numArray.size()) {
			numArray.add(number);
			System.out.println(number);
		}
	}
	public Prime(){
		numArray.add(2);
		numArray.add(3);
	}
	public static ArrayList<Integer> numList(){
		return numArray;
	}
}