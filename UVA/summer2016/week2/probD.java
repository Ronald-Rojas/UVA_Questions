package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ronald on 6/1/2016.
 */
public class probD {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] wordsarr;
        String output;
        while(input != null){
            int index = 1;
            wordsarr = input.split("[\\[\\]]");
            int home = input.indexOf("[");
            int end = input.indexOf("]");
            if(input.equals("[") || input.equals("}")){
                System.out.println();
                continue;
            }
            output = wordsarr[0];
            while(home != -1 || end != -1){
                if(home != -1 && home < end){
                    output = wordsarr[index] + output;
                    input = input.substring(home + 1);
                    home = input.indexOf("[");
                    end = input.indexOf("]");
                }else{
                    output = output + wordsarr[index];
                    input = input.substring(end+ 1);
                    end = input.indexOf("]");
                    home = input.indexOf("[");
                }
                index++;
            }
            System.out.println(output);
            input = br.readLine();
        }

    }
}
