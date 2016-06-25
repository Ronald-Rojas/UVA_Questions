package r358;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * Created by ronald on 6/22/16.
 */
public class probB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String [] input = br.readLine().split(" ");
        Integer[] arr = new Integer[size];
        for( int i = 0; i < size; i++){
            arr[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(arr);
        long min = 1;

        for( int i = 0; i < size; i++){
            if(arr[i] >= min) {
                min++;
            }
        }
        PrintWriter out = new PrintWriter(System.out);
        out.println(min);
        out.close();

    }
}
