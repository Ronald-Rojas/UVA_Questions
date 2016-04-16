package codejamr1a;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class probA {
	public static void main(String [] args) throws NumberFormatException, IOException{
		BufferedReader in = new BufferedReader (new FileReader("A-large.in"));
	    int numlines = Integer.parseInt(in.readLine());
	    File file = new File("output.txt");
	    BufferedWriter bw = new BufferedWriter(new FileWriter(file));
	    for( int lines = 0 ; lines < numlines; lines++){
	   		bw.write("Case #"+ (lines+1) + ": ");
	   		System.out.print("Case #"+ (lines+1) + ": ");
	   		
	   		String S = in.readLine();
	   		String unsortedstr = S;
	   		String sortedstr = "" + unsortedstr.charAt(0);
	   		unsortedstr = unsortedstr.substring(1);
	   		while(unsortedstr.length() >0){
	   			if(unsortedstr.charAt(0) >= sortedstr.charAt(0)){
	   				sortedstr = unsortedstr.charAt(0) + sortedstr;
	   			}
	   			else{
	   				sortedstr = sortedstr + unsortedstr.charAt(0);
	   			}
	   			unsortedstr = unsortedstr.substring(1);
	   		}
	   		System.out.print(sortedstr + "\n");
	   		bw.write(sortedstr + "\n");
	   	}
	    bw.close();
	}
	static int rightlargestvalue(String substr){
		int rightmost = substr.length() -1;
		for( int i = substr.length() -2; i >= 0; i--){
				if(substr.charAt(rightmost) < substr.charAt(i)){
					rightmost =i;
				}
		}
		
		return rightmost;
	}
}

