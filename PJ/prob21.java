/**
 * Created by Ronald on 5/15/2016.
 */
public class prob21 {
    public static void main(String[] args){
        long amicsum = 0;
        for( int currnum = 2; currnum <=10000;currnum++){
            int amic = divsum(currnum);
            if(amic != currnum && divsum(amic) == currnum){
                amicsum += currnum;
                System.out.println(currnum);
            }
        }
        System.out.printf("Answer:%d\n", amicsum);
    }
    public static int divsum(int num){
        int sum = 0;
        for( int i =1;i <= num/2;i++){
            if(num%i == 0){
               sum+=i;
            }
        }
        return sum;
    }
}
