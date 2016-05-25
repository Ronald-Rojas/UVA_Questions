package week1;

import java.util.Scanner;

public class uva591 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int colms;
		int[] wall;
		int blocks;
		int average;
		int moves;
		while((colms = scan.nextInt()) != 0){
			blocks = 0;
			moves = 0;
			wall = new int[colms];
			for(int i = 0; i < colms; i++){
				wall[i] = scan.nextInt();
				blocks+=wall[i];
			}
			average = blocks/colms;
			moves = 0;
			for(int height : wall){
				if(height > average){
					moves += height - average;
				}
			}
			count++;
			System.out.printf("Set #%d\n", count);
			System.out.printf("The minimum number of moves is %d.\n\n",moves);

		}
	}
}
