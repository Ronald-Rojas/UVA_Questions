package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ronald on 6/19/2016.
 */
public class probE {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numcases = Integer.parseInt(br.readLine());
        for( int currcase = 0 ; currcase < numcases; currcase++){
            int size = Integer.parseInt(br.readLine());
            String input = br.readLine();
            boolean[] covered = new boolean[size];
            int total = 0;
            for(int i = 0; i < size; i++){
                if(input.charAt(i) == '.' && covered[i] == false){
                    total++;
                    try{
                        covered[i] = true;
                        covered[i+1] = true;
                        covered[i + 2] = true;
                    }catch (IndexOutOfBoundsException e){
                        break;
                    }

                }
            }
            System.out.printf("Case %d: %d\n", (currcase + 1) , total);
        }
    }
}
