// The prompt for this programming problem can be found at https://projecteuler.net/problem=9
public class main {
	public static void main(String[] args){
		for(int a =1; a<500; a++){		
			for( int b =  a; b<500;b++){// this will for through the possible values of b but starting at "a" to prevent repition.
				double c=(a*a)+(b*b);
				if (Math.sqrt(c) % 1 ==0){
			
					if(Math.sqrt(c) +b +a ==1000){
						System.out.println(" ABC is " +a*b*Math.sqrt(c));
						
					}
				}
				
			}
		}
	}
}
