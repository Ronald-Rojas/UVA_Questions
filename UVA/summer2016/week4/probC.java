package week4;

import java.util.Scanner;

/**
 * Created by Ronald on 6/19/2016.
 */
public class probC {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        while(size >0) {
            int[] betarr = new int[size];
            boolean losingstreak = true;
            for (int i = 0; i < size; i++) {
                betarr[i] = in.nextInt();
            }
            for (int i = 0; i < size; i++) {
                if (betarr[i] >= 1) {
                    losingstreak = false;
                    break;
                }
            }
            if (losingstreak == true){
                size = in.nextInt();
                System.out.println("Losing streak.");
                if(size != 0)
                    System.out.println();
                continue;
            }
            int max= 0;
            int currvalue =0;
            for( int i = 1; i < size; i++){
                currvalue += betarr[i];
                if(max < currvalue)
                    max = currvalue;

                if(currvalue < 0)
                    currvalue = 0;
            }
            size = in.nextInt();
            System.out.printf("The maximum winning streak is %d.", max);
            if(size != 0)
                System.out.println();
        }
    }
}
