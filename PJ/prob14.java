// The prompt for this quesion can be found at https://projecteuler.net/problem=14
public class Main {
	public static void main(String[] args){
		long count = 100001;
		int longestChain = 0;
		long longestNum;
		while(count<1000000){
			long num = count;
			int chain = 0;
			
			// This While loop will keep track of the chain until the number reaches 1
			while(num != 1){
				if(num%2==0) num = even(num);
				else num =odd(num);
				chain ++;
			}
			// This if statement will check if the chain is longer then the previously longest chain
			// Then it will record the new longest chain and the corresponding number that made that chain
			if(chain>longestChain){
				longestChain=chain;
				longestNum = count;
				System.out.println(longestNum);
			}
			count+=2;
			
		}
	}


	public  static long even(long num){
	 	num=num/2;
	 	return num;
	}
	public static long odd(long num){
		num =3*num + 1;
		return num;
	}
}