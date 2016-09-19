package r372;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Created by Ronald on 9/17/2016.
 */
public class probC {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger currnum = BigInteger.valueOf(2);
        int numpresses = Integer.parseInt(br.readLine());
        int level = 0;
        int nextlevel = 1;
        for( int i = 0 ; i< numpresses; i++){
            level++;
            nextlevel++;
            BigInteger goal = BigInteger.valueOf(nextlevel).multiply(BigInteger.valueOf(level));
            BigInteger next = goal;
            goal = goal.multiply(goal);
            BigInteger diff = goal.subtract(currnum);
            BigInteger remain = diff.mod(BigInteger.valueOf(level));
            if(remain.equals(BigInteger.ZERO)){
                BigInteger presses = diff.divide(BigInteger.valueOf(level));
                currnum = next;
                System.out.println(presses.toString());
                continue;
            }
            for( long mult = 2; mult < 100_000;mult++) {
                goal = BigInteger.valueOf((long) nextlevel);
                goal = goal.multiply(BigInteger.valueOf(mult));
                next = goal;
                goal = goal.multiply(goal);
                diff = goal.subtract(currnum);
                remain = diff.mod(BigInteger.valueOf(level));
                if(!remain.equals(BigInteger.ZERO)){
                    continue;

                }

                BigInteger presses = diff.divide(BigInteger.valueOf((long) level));
                currnum = next;
                System.out.println(presses.toString());
                break;

            }
        }

    }
}
