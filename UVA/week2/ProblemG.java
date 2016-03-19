package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemG {
	public static void main(String[] args) throws IOException{
	    BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
	    int N = Integer.parseInt(in.readLine());
	    int caseNum = 0;
	    for( int i = 0; i < N ; i ++){
	    	String[] inputStr = in.readLine().split(" ");
	    	int C = Integer.parseInt(inputStr[0]);
	    	int R = Integer.parseInt(inputStr[1]);
	    	caseNum++;
	    	System.out.printf("case #%d:", caseNum);
	    	if( C == R){
	    		System.out.println(0);
	    		continue;
	    	}
	    	int start = R;
	    	if( start ==0) start = 1;
	    	int increment = 1;
	    	if( R % 2 == 1){
	    		increment = 2;
	    		if(start % 2 == 0) start++;
	    	}
	    	int end = C/2;
	    	for(int Q = start; Q <=end; Q+=increment){
	    		if(C % Q == R) System.out.printf(" %d", Q);
	    	}
	    	if( C - R >= R)
	    		System.out.printf(" %d\n", C - R);
	    }
	}
}
