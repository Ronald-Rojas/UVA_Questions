/**
 * Created by ronald on 5/17/16.
 */
public class prob26 {
        public static void main(String [] args) {
                int maxd =1;
                int maxcycle =0;
                for (int divisor = 2; divisor <= 1000; divisor++) {
                        boolean[] memory = new boolean[10000];
                        int remainder = 1;
                        int divides =0;
                        for( int j = 0; j < 10;j++){
                                divides = remainder /divisor;
                                remainder -= (divides * divisor);
                                remainder*=10;
                        }
                        if(remainder ==0)
                                continue;

                        int count = 0;
                        while (remainder != 0) {
                                if( memory[remainder] == true){
                                        System.out.println(" " + divisor + " " + count);
                                        if( count > maxcycle){
                                                maxd = divisor;
                                                maxcycle = count;
                                        }
                                        break;
                                }else{

                                        memory[remainder] = true;
                                        divides = remainder/ divisor;
                                        remainder -= (divides * divisor);
                                        remainder*= 10;
                                        count++;
                                }
                        }
                }
                System.out.println(""+ maxd + " " + maxcycle);
        }
}
