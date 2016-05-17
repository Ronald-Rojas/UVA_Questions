import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Ronald on 5/15/2016.
 */
public class prob22 {
    public static  void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader( new FileReader("names.txt"));
        String[] nameslist = in.readLine().split(",");
        int size = nameslist.length;
        for( int i = 0; i < size; i++){
            nameslist[i] = nameslist[i].substring(1, nameslist[i].length() -1);
        }
        Arrays.sort(nameslist);
        long sum = 0;
        long partialsum = 0;
        int i;
        for( i= 0; i < size;i++){
            partialsum = 0;
            String currstr = nameslist[i];
            for( int j = 0; j < currstr.length();j++){
                partialsum += (long) currstr.charAt(j) - 64;// ascii value of 'A' minus 1
            }

            partialsum*=(long)(i+1);
            sum+= partialsum;
        }
        System.out.println(sum);
    }
}
