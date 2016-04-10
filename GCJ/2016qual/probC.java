import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;

public class probC {
	public static void main(String [] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader (new FileReader("testinput"));
	    int numlines = Integer.parseInt(in.readLine());
	    File file = new File("output.txt");
	    BufferedWriter bw = new BufferedWriter(new FileWriter(file));
	    for( int line = 0 ; line < numlines; line++){
	    	System.out.print("Case #" + (line+1) + ":\n");
	    	bw.write("Case #" + (line+1) + ":\n");
	    	String[] input = in.readLine().split(" ");
	    	int N = Integer.parseInt(input[0]);
	    	int J = Integer.parseInt(input[1]);
	    	
	    	boolean [] jamarr= new boolean[N];
	    	jamarr[N -1] = true;
	    	jamarr[0] = true;
	    	int foundjams = 0;
	    	while(foundjams != J){
	    		boolean isprime = false;
	    		for( int base = 2; base != 11; base++){
	    			BigInteger num = value(base, jamarr);
	    			if(isPrime(num) == true){
	    				isprime = true;
	    				break;
	    			}
	    		}
	    		if( isprime == false){
	    			foundjams++;
	    			for( int j = 0 ; j < N; j++){
	    				if(jamarr[j] == true){
	    					System.out.print("1");
	    					bw.write("1");
	    					
	    				}
	    				else{
	    					System.out.print("0");
	    					bw.write("0");
	    				}
	    			}
	    			for( int base = 2; base != 11; base++){
	    				BigInteger num = value(base, jamarr);
	    				BigInteger divisor = finddivisor(num);
	    				System.out.print(" " + divisor);
	    				bw.write(" " + divisor);
	    				
	    			}
	    			System.out.print("\n");
	    			bw.write("\n");
	    		}
	    		
	    		
	    		
	    		//increment array
	    		jamarr = incrarr(jamarr , 0 );
	    	}
	    }
	    bw.close();
	}
	private static boolean[] incrarr(boolean[] jamarr, int offset ) {
		
		if(jamarr[jamarr.length -(2 + offset)] == true){
			jamarr = incrarr(jamarr, offset +1);
			jamarr[jamarr.length -(2 + offset)] = false;
		}
		else
			jamarr[jamarr.length - (2 + offset)] = true;
		return jamarr;
	}
	static boolean isPrime(BigInteger n) {
	    //check if n is a multiple of 2
	    if (n.mod( new BigInteger("2")).equals(BigInteger.ZERO)) return false;
	    //if not, then just check the odds
	    int count = 0;
	    for(BigInteger i = BigInteger.valueOf(3); i.multiply(i).compareTo(n) < 0; i=i.add(BigInteger.valueOf(2))){
	        if(n.mod(i).equals(BigInteger.ZERO))
	            return false;
	        if( count == 1000) return true;
	        count++;
	    }
	    return true;
	}
	
	public static BigInteger value(int base, boolean[] binary){
		BigInteger sum = BigInteger.ZERO;
		BigInteger basemult= BigInteger.ONE;
		for( int i = 0; i < binary.length -1; i ++){
			basemult = basemult.multiply(BigInteger.valueOf((long) base));
		}
		for(int i = 0; i != binary.length ; i++){
			boolean bool = binary[i];
			if(bool == true){
				sum = sum.add(basemult);
				
			}
			basemult = basemult.divide(BigInteger.valueOf((long) base));
			
		}
		return sum;
	}
	public static BigInteger finddivisor(BigInteger num){
		if(num.mod( new BigInteger("2")).equals(BigInteger.ZERO))
			return BigInteger.valueOf(2);

		for(BigInteger i = BigInteger.valueOf(3); i.compareTo(num) < 0; i=i.add(BigInteger.valueOf(2))){
			if(num.mod(i).equals(BigInteger.ZERO))
				return i;
		
		}
		return null;
		
		
	}
}
