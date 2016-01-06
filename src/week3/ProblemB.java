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
			
			
		}
	}
}
