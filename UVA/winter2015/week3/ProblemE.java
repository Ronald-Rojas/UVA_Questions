package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ProblemE {
	static boolean [][] matrix ;
	static int walk;
	static ArrayList<Integer> pathTaken;
	public static void main(String [] arg) throws IOException{
		BufferedReader in = new BufferedReader ( new InputStreamReader(System.in));
		String line;
		while((line = in.readLine() )!= null){
			String[] lineArr = line.split(" ");
			int nodes = Integer.parseInt(lineArr[0]);
			walk = Integer.parseInt(lineArr[1]);
			matrix = new boolean[nodes][nodes];
			for(int i = 0 ; i < nodes; i++){
				lineArr = in.readLine().split(" ");
				for( int j = 0; j < nodes; j++){
					matrix[i][j] = true;
				}	
			}
			ArrayList<Integer> emptypath = new ArrayList<Integer>();
			emptypath.add(0);
			int depth = 1;
			bfs( 0, depth, emptypath);
			line = in.readLine();
			if(line == null || !line.equals("-9999"))break;
		}
		
	}
	static void bfs( int vertex, int depth, ArrayList<Integer> path){
		if (depth == walk){
			System.out.printf("%d, ", vertex +1);
			return;
		}
		for( int i = 0 ; i < matrix.length; i ++){
		
			if(matrix[vertex][i]&& !path.contains(i)){
				ArrayList<Integer> newPath= new ArrayList<Integer>();
				newPath.addAll(path);
				bfs(i, depth +1, newPath);
			}
		}
		
		
	}
}
