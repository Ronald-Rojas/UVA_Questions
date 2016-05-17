/**
 * Created by ronald on 5/17/16.
 */
public class prob24 {
    public static void main(String [] args){
        String str = "0123456789";
        int total = 1_000_000 -1;
        System.out.println(str);
        int digit = 10;
        while(digit != 0){
            int combinations = factorial(digit -1);
            int divisor = total/combinations;
            total -= (combinations * divisor);
            int start = str.length() - digit;
            str = str.substring(0, start) + str.charAt(start+ divisor) + str.substring(start, start + divisor) + str.substring(start+ divisor + 1);
            System.out.println(str + " " + total);
            digit--;
        }
        System.out.println(str);

    }
    public static int factorial( int n){
        int sum = 1;
        for( int i = 1; i <=n;i++){
            sum*=i;
        }
        return sum;

    }
}
