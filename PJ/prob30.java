/**
 * Created by Ronald on 5/19/2016.
 */
public class prob30 {
    public static void main(String [] args){
        int sum = 0;
        for( int num= 10; num <= 354294; num++){
            String numstr = "" + num;
            int subtotal = 0;
            for( int i = 0; i  < numstr.length(); i++){
                int digit = Integer.parseInt( "" + numstr.charAt(i));
                subtotal += topower(digit, 5);
            }
            if(subtotal == num)
                sum +=num;
        }
        System.out.println(sum);


    }
    public static int topower(int num, int power){

        int  total = num;
        for( int i = 1; i < power; i++){
            total*= num;
        }
        return total;
    }
}
