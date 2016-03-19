package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class uva119 {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String[] nameList;
		int[] netWorthList;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputLine;
		while((inputLine = br.readLine().split(" ")) != null && inputLine[0].length() != 0){
			int size = Integer.parseInt(inputLine[0]);
			nameList = new String[size];
			netWorthList = new int[size];
			for(int i = 0; i< netWorthList.length; i++)
				netWorthList[i] = 0;
			inputLine = br.readLine().split(" ");
			for(int i =0; i < size; i++){
				nameList[i] = inputLine[i];
			}
			for(int i = 0; i < size; i ++){
				inputLine = br.readLine().split(" ");
				String giver = inputLine[0];
				int amount= Integer.parseInt(inputLine[1]);
				int numPeople = Integer.parseInt(inputLine[2]);
				int perPerson = 0;
				if(numPeople != 0){ 
					perPerson = amount/numPeople;
					for( int j = 0; j < size; j ++){
						if(giver.equals(nameList[j]))
								netWorthList[j] += (amount%numPeople)- amount;
					}
				}
				for(int j = 0; j < numPeople; j++){
					String giftee = inputLine[3 +j];
					for(int k = 0; k < size; k ++){
						if(giftee.equals(nameList[k])){
							netWorthList[k] += perPerson;
							break;
						}
					}
				}
			}
			for(int i = 0; i < netWorthList.length; i ++){
				System.out.printf("%s %d\n", nameList[i],netWorthList[i]);
				
			}
			System.out.println();

			
		}
	}

}
