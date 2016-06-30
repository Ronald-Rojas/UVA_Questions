package week6;

import java.util.Scanner;

/**
 * Created by ronald on 6/28/16.
 */
public class probB {
    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);
        while(br.hasNext()){
            int term = br.nextInt();
            System.out.printf("TERM %d ", term);
            int index = 1;
            while((term -= index) > 0 ){
                index++;
            }
            int a = index;
            int b = 1;
            a += term;
            b -= term;
            if(index %2 == 1){
                int temp = a;
                a = b;
                b = temp;
            }
            System.out.printf("IS %d/%d\n", a , b);
        }
    }
}
