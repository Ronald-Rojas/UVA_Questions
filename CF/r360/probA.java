package r360;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ronald on 6/29/16.
 */
public class probA {
    public static void main(String []args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] input = br.readLine().split(" ");
        int people = Integer.parseInt(input[0]);
        int days = Integer.parseInt(input[1]);
        int maxconsec = 0;
        int streak = 0;
        boolean present;
        String line;
        for( int day = 0; day < days ; day++){
            present = true;
            line = br.readLine();
            for( int i = 0; i < people; i ++){
                if(line.charAt(i) == '0'){
                    present = false;
                    break;
                }
            }
            if(present == false){
                streak++;
                if( streak > maxconsec){
                    maxconsec = streak;
                }
            }else{
                streak = 0;
            }

        }
        System.out.print(maxconsec);

    }
}
