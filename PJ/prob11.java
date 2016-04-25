// The prompt for this programming problem can be found at https://projecteuler.net/problem=12

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;


public class main {
	public static void main(String[] args){
		int[][] grid= new int[20][20];
		int row = 0, colm =0;
		String fileName = "grid.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
			String line;
			System.out.println("hell there");
			while ((line = br.readLine()) != null) {
				String[] rowArray = line.split(" ");
				for( colm = 0; colm<20; colm ++){
					int num = Integer.parseInt(rowArray[colm]);
					grid[row][colm] = num;
				}
				row ++;
			}
			System.out.println(Arrays.deepToString(grid));
		} catch (IOException exception) {
			System.out.println( " the file was not found");
			
			
			
		}
		int largestProduct = 0;
		int count =0;
		findlargest(grid);
	}

	private static void findlargest(int[][] grid) {
		int partialSum =1;
		int largestSum = 1;
		for(int row=0; row<20; row++){
			for(int colm = 0; colm<16; colm++){
				partialSum =1;
				for( int add =0; add<4;add++){
					partialSum *=grid[row][colm+add];
				}
				if(partialSum>largestSum) largestSum = partialSum;
			}
		}
		for(int row=0; row<16; row++){
			for(int colm = 0; colm<20; colm++){
				partialSum =1;
				for( int add =0; add<4;add++){
					partialSum *=grid[row+add][colm];					
				}
				if(partialSum>largestSum) largestSum = partialSum;
			}
		}
		for(int row=0; row<16; row++){
			for(int colm = 0; colm<16; colm++){
				partialSum =1;
				for( int add =0; add<4;add++){
					partialSum *=grid[row+add][colm+add];
				
			
				}
				if(partialSum>largestSum) largestSum = partialSum;
			}
		}
		for(int row=4; row<20; row++){
			for(int colm = 0; colm<16; colm++){
				partialSum =1;
				for( int add =0; add<4;add++){
					partialSum *=grid[row-add][colm+add];
				
			
				}
				if(partialSum>largestSum) largestSum = partialSum;
			}
		}
		System.out.println(largestSum);
	}
}
