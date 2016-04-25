package week1;

/**
 * Created by Ronald on 4/22/2016.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class probB{
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader in = new BufferedReader( new FileReader("input.txt"));
        int numinput = Integer.parseInt(in.readLine());
        File file = new File("output.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for( int input = 0; input < numinput; input++) {
            System.out.print("" + (1 + input));
            bw.write("" + (1 + input));
            boolean foundall = false;
            String[] inputstr = in.readLine().split( " ");
            int K = Integer.parseInt(inputstr[1]);
            int numtwos = 0;
            int numones = K;
            long totalcount = 0;
            while(foundall == false){
                long combinations = 0;
                if(numones <=numtwos){
                    combinations = combination(numones, numtwos);
                }
                numones-=4;
                numtwos +=2;
                if(numtwos/2==K || numones<0){
                    foundall = true;
                }
                totalcount+=combinations;
            }
            System.out.print(" " + totalcount +"\n");
            bw.write(" " +totalcount +"\n");

        }
        bw.close();
    }
    public static long  combination(int numones, int numtwos){
        if(numones ==0 || numtwos == 0){
            return 1;
        }
        int n = numones + numtwos;
        n/=2;
        int r = numones/2;
        long numerator=1;
        long starter;
        long divisor;
        long other = 1;
        if(r >(n-r)){
            starter = r +1;
            divisor = n-r;
        }
        else{
            starter = n-r +1;
            divisor = r;
        }
        for( long i = starter ; i <=n; i++){
            numerator*=i;
        }
        for( long i = 2 ; i <=divisor; i++){
            other*=i;
        }
        long combinations = numerator/other;
        combinations*=combinations;
        System.out.println(" " + combinations);

        return combinations;
    }
}
