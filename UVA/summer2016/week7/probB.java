package week7;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by ronald on 7/5/16.
 */
public class probB {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int N = sc.nextInt();
            int A = sc.nextInt();
            BigInteger answer = BigInteger.ZERO;
            BigInteger add;
            for( int i = 1; i <= N; i++){
                add = BigInteger.ONE;
                for( int j = 0; j < i; j++){
                    add = add.multiply(BigInteger.valueOf((long) A));
                }
                add = add.multiply(BigInteger.valueOf((long) i));
                answer = answer.add(add);
            }
            System.out.printf("%s\n", answer.toString());
        }
    }
}
