import java.math.BigInteger;

/**
 * Created by ronald on 5/17/16.
 */
public class prob25 {
    public static void main(String[] args){
        int fibnum = 2;
        BigInteger fib1 = BigInteger.ONE;
        BigInteger fib2 = BigInteger.ONE;
        BigInteger tempfib = BigInteger.ONE;
        while(fib2.toString().length() != 1000){
            tempfib = fib2;
            fib2 = fib2.add(fib1);
            fib1 = tempfib;
            fibnum++;
        }
        System.out.println(fibnum);
    }
}
