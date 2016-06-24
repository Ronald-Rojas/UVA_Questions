package marathon1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * Created by Ronald on 6/21/2016.
 */
public class A1 {
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer = "";
        for( int i = 0; i < 5000; i++){
            answer+='0';
        }
        int leftover = 100;
        System.out.println(answer);
        System.out.flush();
        int result, maxresult;
        result = maxresult = Integer.parseInt(br.readLine());
        String changestr = "";
        leftover--;
        String tempanswer ;
        int start = 0;
        while(maxresult <= 4000){
            int size = result - start;
            changestr = "";
            for( int i = 0; i < size; i++){
                changestr +='1';
            }
            answer = tempanswer = answer.substring(0, start) + changestr + answer.substring(start + size);
            System.out.println(tempanswer);
            System.out.flush();
            maxresult = result = Integer.parseInt(br.readLine());
            leftover--;
            start+=size;

        }
        for( int i = 0; i < 97; i++){
            changestr+=1;
        }
        int offset = 0;
        int subsection = 0;
        for(int test = 0; test < leftover; test++){
            start = offset + ( subsection * 97);
            changestr = "";
            for( int i = 0; i < 97; i++){
                if(answer.charAt(i + start) == '1')
                    changestr+='0';
                else
                    changestr+='1';
            }
            tempanswer = answer.substring(0 + offset,(subsection * 97) + offset) + changestr + answer.substring(((subsection +1)* 97) + offset);
            System.out.println(tempanswer);
            System.out.flush();
            result = Integer.parseInt(br.readLine());
            if (result == maxresult) {
                subsection = 0;
                offset += 17;
            }
            else if(result > maxresult){
                answer = tempanswer;
                maxresult = result;
            }
        }
    }
}
