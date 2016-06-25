package r359;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ronald on 6/23/16.
 */
public class probA {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        long size = Long.parseLong(input[0]);
        long num = Long.parseLong(input[1]);
        long dis = 0;
        long curr;
        for( long i = 0; i < size; i++){
            input = br.readLine().split(" ");
            curr = Integer.parseInt(input[1]);
            if(input[0].equals("+")){
                num+=curr;
            }else if(num >= curr){
                num-=curr;
            }else{
                dis++;
            }
        }
        System.out.printf("%d %d\n", num, dis);
    }
}
