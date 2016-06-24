package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ronald on 5/31/2016.
 */
public class probC {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().split(" ")[0];
        int numtests = Integer.parseInt(input);
        for( int casenum = 0 ; casenum < numtests; casenum++){
            input = br.readLine();
            int[] charvalues = new int[256];
            int numlines = Integer.parseInt(input);
            for( int i = 0; i < numlines; i++){
                input = br.readLine();
                String[] inputarr = input.split(" ");
                charvalues[input.charAt(0)] = Integer.parseInt(inputarr[1]);
            }
            numlines = Integer.parseInt(br.readLine());
            int value = 0;
            for( int line = 0; line < numlines; line++){
                input = br.readLine();
                int size = input.length();
                for( int i = 0; i < size;i++ ){
                    value+=charvalues[(int) input.charAt(i)];
                }
            }
            double money = (double) value/100;
            System.out.printf("%.2f$\n", money);
        }
    }
}
