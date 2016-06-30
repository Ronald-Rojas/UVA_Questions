package r360;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ronald on 6/29/16.
 */
public class probB {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n =br.readLine();
        StringBuffer m = new StringBuffer(n);
        m.reverse();
        System.out.print(n + m);
    }
}
