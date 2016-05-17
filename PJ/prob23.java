import java.util.ArrayList;
import java.util.jar.Pack200;

/**
 * Created by Ronald on 5/16/2016.
 */
public class prob23 {
    static ArrayList<Integer> abundantlist= new ArrayList<>();
    public static void main(String[] args){
        for( int i = 1; i <28123; i++){
            if(i < divsum(i)) {
                abundantlist.add(i);
            }
        }
        int sum = 0;
        for( int i =1; i < 28123;i++){
            if(sumcheck(i) == false){
                sum+=i;
                System.out.println(" " + sum + " " + i);
            }
        }
        System.out.println(sum);

    }
    public static boolean sumcheck( int sumnum){

        for( int i = 0; i < abundantlist.size(); i ++){
            for( int j = 0; j  <=i; j++){
                if( abundantlist.get(i) + abundantlist.get(j) == sumnum){
                    return true;
                }
                if(abundantlist.get(i) + abundantlist.get(j) > sumnum){
                    break;
                }
            }
            if(abundantlist.get(i) > sumnum) {
                return false;
            }
        }
        return false;
    }
    public static int divsum(int num){
        int sum = 0;
        for( int i= 1; i < (num/2) + 1;i++){
            if(num%i == 0){
                sum+=i;
            }


        }
        return sum;
    }
}
