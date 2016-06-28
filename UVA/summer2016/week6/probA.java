package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ronald on 6/27/2016.
 */
public class probA {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int currcase = Integer.parseInt(input);
        boolean []corarr;
        boolean[] foundarr ;
        int totalfound ;
        int size ;
        while(currcase != -1){
            System.out.printf("Round %d\n", currcase);
            totalfound = 0;
            input = br.readLine();
            size = input.length();
            int currchar;
            corarr = new boolean[26];
            foundarr = new boolean[26];
            for(int i = 0; i < size; i++){
                currchar = input.charAt(i) - 97;
                if(corarr[currchar] == false){
                    totalfound++;
                    corarr[currchar] = true;
                }
            }

            input = br.readLine();
            size = input.length();
            int totalwrong = 7;
            for( int i = 0; i < size; i++){
                currchar = input.charAt(i) - 97;
                if(foundarr[currchar] == false){
                    foundarr[currchar] = true;
                    if(corarr[currchar] == true){
                        totalfound--;
                        if(totalfound == 0){
                            System.out.printf("You win.\n");
                            break;
                        }
                    }else{
                        totalwrong--;
                        if(totalwrong == 0){
                            System.out.printf("You lose.\n");
                            break;
                        }
                    }
                }
            }
            if(totalfound != 0 && totalwrong != 0){
                System.out.printf("You chickened out.\n");

            }





            currcase = Integer.parseInt(br.readLine());
        }
    }
}
