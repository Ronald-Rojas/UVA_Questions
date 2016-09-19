package r372;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ronald on 9/17/2016.
 */
public class probA {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String [] strarr = br.readLine().split(" ");
        int size = Integer.parseInt(strarr[0]);
        int c = Integer.parseInt(strarr[1]);
        strarr = br.readLine().split(" ");
        int start = Integer.parseInt(strarr[0]);
        int total = 1;
        int end;
        for( int i = 1; i < size; i++){
            end = Integer.parseInt(strarr[i]);
            if(end - start > c){
                total = 0;
            }
            total++;

            start = end;
        }
        System.out.println(total);

    }
}
