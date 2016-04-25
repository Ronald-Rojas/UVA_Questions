// The prompt for this programming problem can be found at https://projecteuler.net/problem=10
public class Main {
	public static void main(String [] args){
		int count = 5;
		long primetotal= 0;
		Prime prime = new Prime();
		while(count<2000000){
			Prime.isPrime(count);
			count +=2;
		}	
		for (int i : Prime.numList()){
			primetotal += i; 
		}
		System.out.println(primetotal);
	}
}
