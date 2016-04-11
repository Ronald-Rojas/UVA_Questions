package codejam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class probA {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader in = new BufferedReader( new FileReader("A-large-practice.in"));
		int numinput = Integer.parseInt(in.readLine());
		File file = new File("output.txt");
		BufferedWriter bw = new BufferedWriter( new FileWriter(file));
		for( int input = 0; input < numinput; input++){
			int numwindows = Integer.parseInt(in.readLine());
			int[] leftwin = new int[numwindows];
			int [] rightwin = new int[numwindows];
			System.out.print("Case #" +(input +1) +": ");
			bw.write("Case #" +(input +1) +": ");
			int intersections = 0;
			for( int window = 0; window < numwindows; window++ ){
				String[] inputstr = in.readLine().split(" ");
				leftwin[window] = Integer.parseInt(inputstr[0]);
				rightwin[ window] = Integer.parseInt(inputstr[1]);
				for( int i = 0 ; i < window; i++){
					if(leftwin[window] < leftwin[i] && rightwin[window] > rightwin [i] ){
						intersections++;
					}
					else if( leftwin[window] > leftwin[i] && rightwin[window] < rightwin[i]){
						intersections++;
					}
				}

				
			}
			System.out.print(intersections + "\n");
			bw.write("" + intersections + "\n");
			
		}
		bw.close();
	}
}
