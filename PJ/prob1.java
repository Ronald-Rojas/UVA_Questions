// The prompt for this programming problem can be found at https://projecteuler.net/problem=1
public class Main {
	public static void main(String[] args){
		long sum = 0;
		for (int i = 1; i < 1000; i++) {
				
			if ( i % 3 == 0){
				sum += i;
				continue;
			}else if ( i % 5 == 0){
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
