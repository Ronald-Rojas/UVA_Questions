
// The prompt for this programming problem can be found at https://projecteuler.net/problem=3
import java.util.ArrayList;


public class Main {
	public static void main(String[] args){
		ArrayList<Integer> primenums = new ArrayList<Integer>();
		primenums.add(1);
		primenums.add(2);
		long large = 600851475143L;
		for (int i = 3; i < Math.sqrt(large); i+=2) {
			boolean add = true;
			for (int j = i; j < primenums.size(); j++) {
				int primenum = primenums.get(j);
				if (i % primenum == 0){
					add = false;
					break;
				} 
				
			}
			
			if (add ==true) {
				primenums.add(i);
				
			}
		}
		System.out.println(" The largest Prime factor is :" + primenums.get(primenums.size()-1));
	}
}
