package r359;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Ronald on 6/23/2016.
 */
public class probB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
        String[] input = br.readLine().split(" ");

        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        while(true) {
            int start = -1;
            int end;
            for (int i = 0; i < size - 1; i ++) {
                if (arr[i] > arr[i + 1]) {
                    start = i;
                    break;
                }
            }
            if (start == -1) {
                break;
            }
            end = start;
            for (int i = start + 2; i < size - 1; i += 2) {
                if (arr[i] > arr[i + 1]) {
                    end = i;
                }
            }
            end++;
            int temp;
            for (int i = start; i < end; i += 2) {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
            start++;
            end++;
            System.out.printf("%d %d\n", start, end);
        }
    }
}
