// The prompt for this programming problem can be found at https://projecteuler.net/problem=13


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class Main{
	public static void main(String[] args){
		int count = 0;
        BigInteger sum=new BigInteger("0");
        String fileName;
        try{
		    fileName = args[0];
        }catch(IndexOutOfBoundsException e){
            System.out.println("missing arguments");
            return;
        }
        String line;
        BufferedReader br=null;
		try{
            br = new BufferedReader ( new FileReader(fileName));
            while ((line = br.readLine()) != null){
                line = line.substring(0, 12);
                BigInteger num =new BigInteger(line);

               // System.out.println(num);

                sum=sum.add(num);
            }
        }catch(IOException e){
            System.out.println("file not found");
        }
		System.out.println(sum);
    }
}
