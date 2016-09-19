package r370;

import java.util.Scanner;

/**
 * Created by Ronald on 9/10/2016.
 */
public class probA {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        int [] ans = new int[size];
        for( int i = 0; i < size; i ++){
            arr [i] = in.nextInt();

        }
        ans[size -1] = arr[size -1];
        for( int i = size -2; i != -1; i--){
                ans[i] = arr[i+1] + arr[i];
        }

        for(int i = 0; i < size; i++){
            System.out.print("" +ans[i] + " ");
        }

    }
}
