package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ronald on 5/31/2016.
 */
public class probA {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        while(!input[0].equals("0")){
            double height = Double.parseDouble(input[0]);
            double climbdist = Double.parseDouble(input[1]);
            double falldist = Double.parseDouble(input[2]);
            double fatigue = Double.parseDouble(input[3])/100;
            double fatrate = climbdist * fatigue;
            int day = 0;
            double firstheight = height;
            boolean outcome = false;
            do{
                height -= climbdist;
                climbdist -=fatrate;
                if(climbdist < 0)
                    climbdist = 0;
                day++;
                if( height < 0){
                    outcome = true;
                    break;
                }
                height+=falldist;
            }while(height <= firstheight);

            if(outcome == true){
                System.out.printf("success on day %d\n", day);

            }else{
                System.out.printf("failure on day %d\n", day);
            }
            input = br.readLine().split(" ");
        }
    }
}
