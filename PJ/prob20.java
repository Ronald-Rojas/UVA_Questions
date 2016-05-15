import java.math.BigInteger;

/**
 * Created by Ronald on 4/24/2016.
 */
public class prob20 {
    public static void main(String[] args){
        BigInteger factorial = BigInteger.valueOf(1);
        for( long i = 1; i <100; i ++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
        String factstr = factorial.toString();
        int digitsum = 0;
        for(int i = 0; i < factstr.length(); i++){
            digitsum += factstr.charAt(i) - 48;
        }
        System.out.println(digitsum);
    }
}
