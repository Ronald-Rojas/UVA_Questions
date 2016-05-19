import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by ronald on 5/18/16.
 */
public class prob29 {
    public static void main(String[] args){
        ArrayList<BigInteger> numlist = new ArrayList<>();
        for( int i = 2; i <= 100 ; i++){
            for( int j = 2; j <= 100; j++){
                BigInteger num = BigInteger.ONE;
                for( int k = 0; k <j ;k++){
                    num = num.multiply(BigInteger.valueOf(i));
                }
                numlist.add(num);
            }
        }
        Collections.sort(numlist);
        for( int i = 0; i < numlist.size() -1;i++){
            if(numlist.get(i).equals(numlist.get(i+1)) == true){
                numlist.remove(i);
                i--;
            }
        }
        System.out.println(numlist.size());
    }
}
