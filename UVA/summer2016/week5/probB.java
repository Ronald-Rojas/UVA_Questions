package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Ronald on 6/20/2016.
 */
public class probB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        String [] input;
        while((input = br.readLine().split(" "))[0].charAt(0) != '0'){
             int n = Integer.parseInt(input[0]);
            int d = Integer.parseInt(input[1]);
            int r = Integer.parseInt(input[2]);
            int[] mornshift = new int[n];
            int[] aftershift = new int[n];
            input = br.readLine().split(" ");
            for( int i = 0; i < n ; i++){
                mornshift[i] = Integer.parseInt(input[i]);
            }
            input = br.readLine().split(" ");
            for( int i = 0; i < n ; i++){
                aftershift[i] = Integer.parseInt(input[i]);
            }
            long overtime = 0;
            Arrays.sort(mornshift);
            Arrays.sort(aftershift);
            for( int i =0; i < n; i++){
                int total = mornshift[i]+ aftershift[n-1-i];
                if(total> d){
                    overtime+= (long)(r * (total -d));
                }
            }
            System.out.printf("%d\n", overtime);
        }
    }
}
