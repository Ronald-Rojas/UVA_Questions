package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemB {
	public static void main(String [] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int numInput = Integer.parseInt(in.readLine());
		for(int a = 0; a < numInput; a ++){
			String[] cardArray = in.readLine().split(" ");
			String cardStr = "";
			for(String num: cardArray){
				cardStr+=num;
			}
			String nonDoubleStr = "";
			String doubleStr = "";
			int sum = 0;
			for( int digitIndex = 1; digitIndex <cardStr.length(); digitIndex+=2){
				nonDoubleStr+=cardStr.charAt(digitIndex);
			}
			for (int digitIndex = 0; digitIndex <cardStr.length(); digitIndex +=2){
				doubleStr+=cardStr.charAt(digitIndex);
			}
			
			for(int digitIndex = 0; digitIndex< doubleStr.length(); digitIndex++){
				int digit = Integer.parseInt(""+ doubleStr.charAt(digitIndex));
				digit*=2;
				String digitStr = "" + digit;
			
				for(int i = 0; i < digitStr.length(); i++){
					sum+= Integer.parseInt("" + digitStr.charAt(i));
				}
			}
			for(int digitIndex = 0; digitIndex<nonDoubleStr.length(); digitIndex++){
				sum+= Integer.parseInt("" + nonDoubleStr.charAt(digitIndex));
			}
			String sumStr = "" +sum;
			if(sumStr.charAt(sumStr.length() -1) =='0') System.out.println("Valid");
			else System.out.println("Invalid");
			
		}
	}
}
