package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemC {
	public static void main(String [] args) throws IOException{
		BufferedReader in = new BufferedReader( new InputStreamReader(System.in));
		String line;
		int count = 0;
		while(!(line = in.readLine()).equals("0")){
			count++;
			boolean roundNum = false;
			while(!roundNum){
				roundNum =true;
				int index = 0;
				int digit = Integer.parseInt("" + line.charAt(0));
				int length = line.length();
				boolean[] checkArray= new boolean[length];
				checkArray[0] = true;
				boolean[] intCheck = new boolean[9];
				for(int i = 0; i < length; i++){
					int intIndex = Integer.parseInt("" +line.charAt(i));
					if(intIndex == 0 || intCheck[intIndex -1]){
						int tens = 1;
						for(int j = i +1; j < length; j++){
							tens *=10;
						}	
						String subLineStr = line.substring(i +1);
						int subLine;
						if(subLineStr.length() == 0) subLine = 0;
						else subLine = Integer.parseInt(subLineStr);
						int addition = tens - subLine;
						if(addition <1) 
							addition = 1;
						int lineNum = Integer.parseInt(line) + addition;
						line = "" + lineNum;
						roundNum = false;
						break;
					}
					else intCheck[intIndex -1] = true;
			
				}
				if(!roundNum) continue;
				for (int i = 1; i < length; i++) {
					checkArray[i] = false;
				}
				for ( int i = 1; i < length; i++){
					index = (digit+ index)%length;
					checkArray[index] = true;
					digit = Integer.parseInt("" + line.charAt(index));
				}
				for( int i = 0; i < checkArray.length; i++){
					if(checkArray[i] == false){
						roundNum = false;
						break;
					}
				}
				int currentIndex = (digit +index) % length;
				if(roundNum == false || currentIndex != 0) {
					roundNum = false;
					int lineNum = Integer.parseInt(line) +1;
					line = "" + lineNum;
				}
				else{
					
				}
				if(roundNum == true) 
					System.out.printf("Case %d: %s\n", count,line);
			}
		}
	}
}
