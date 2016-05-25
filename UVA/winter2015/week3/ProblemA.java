package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProblemA {
	public static void main(String[ ] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int numInput = Integer.parseInt(in.readLine());
		for(int a = 0;a< numInput; a ++){
			String[] inputArray = in.readLine().split(" ");
			int month = Integer.parseInt(inputArray[0]);
			int day = Integer.parseInt(inputArray[1]);
			int totalDays = 0;
			switch (month){
			case 12:
				totalDays+=30;
			case 11:
				totalDays+=31;
			case 10:
				totalDays+=30;
			case 9:
				totalDays+=31;
			case 8:
				totalDays+=31;
			case 7:
				totalDays+=30;
			case 6:
				totalDays+=31;
			case 5: 
				totalDays+=30;
			case 4:
				totalDays+=31;
			case 3:
				totalDays+=28;
			case 2:
				totalDays+=31;
			}
			totalDays += day;
			int dateNum = totalDays % 7;
			String date = "Thursday";
			switch(dateNum){
			case 0:
				date = "Friday";
				break;
			case 1:
				 date = "Saturday";
				 break;
			case 2:
				date = "Sunday";
				break;
			case 3:
				date = "Monday";
				break;
			case 4:
				date = "Tuesday";
				break;
			case 5:
				date = "Wednesday";
				break;
			}
			System.out.println(date);
		}
	}
}
