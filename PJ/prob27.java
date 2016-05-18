import java.util.ArrayList;

/**
 * Created by Ronald on 5/18/2016.
 */
public class prob27 {
    static ArrayList<Integer> primeslist = new ArrayList<>();
    public static void main(String[] args){
        int maxA = -999;
        int maxB = -999;
        int maxconsec = 0;
        findprimes();
        System.out.println("finished finding primes");
        for( int a = -999; a < 1000; a++){
            for( int b = -999; b < 1000; b++){

                int consec = findconsec(a, b);
                if( consec > maxconsec){
                    maxconsec = consec;
                    maxA = a;
                    maxB = b;
                    System.out.println("" + consec + " " + a + " " + b);
                }
            }
        }
        System.out.println((maxA * maxB));
    }
    public static int findconsec(int a, int b){
        int consec = -1;
        boolean isprime = true;
        int n = 0;
        int num;
        num = (n * n ) + (a * n ) + b;
        if(num <= 1)
            return 0;
        while(isprime == true){
            num = (n * n ) + (a * n ) + b;
            consec++;
            if(num == 1 || num == 0){
                isprime = false;
            }else {
                isprime = checkprime(num);
            }
            n++;
        }
        return consec;
    }
    public static boolean checkprime(int num){
        for( int i = 0; i < primeslist.size(); i ++){
            if(num/2 < primeslist.get(i)){
                return true;
            }
            if(num%primeslist.get(i) == 0) {
                return false;
            }
        }
        return true;
    }
    public static void findprimes(){
        int num = 5;
        primeslist.add(2);
        primeslist.add(3);
        primeslist.add(4);
        while( num< 1_000_000){
            boolean isprime = checkprime(num);
            if(isprime == true){
                primeslist.add(num);
            }
            num++;

        }
    }
}
