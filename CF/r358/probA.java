package r358;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ronald on 6/22/16.
 */
public class probA {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        long n = Long.parseLong(input[0]);
        long m = Long.parseLong(input[1]);
        long total = (m * n) /5;
        long nmod = n % 2;
        long mmod = m % 2;
        if(nmod == 1 && mmod == 0){
            total++;
        }else if(mmod == 1 && nmod == 0){
            total++;
        }

        System.out.println(total);
    }
}
