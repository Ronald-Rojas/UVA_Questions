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

public class probC{
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader in = new BufferedReader( new FileReader("input.txt"));
        int numinput = Integer.parseInt(in.readLine());
        File file = new File("output.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for( int input = 0; input < numinput; input++) {
            System.out.print("" + (1 + input));
            bw.write("" + (1 + input));
            String[] inputstrs = in.readLine().split(" ");
            long Y = Long.parseLong(inputstrs[1]);
            long pop = 1;
            long prevpop = 1;
            long temppop = 1;
            if(Y != 1 || Y != 2){
               for( long i = 3; i <= Y; i++){
                   temppop = prevpop + pop;
                   prevpop = pop;
                   pop = temppop;
                   if( pop/1_000_000_000 != 0 ){
                       pop-=1_000_000_000;
                       if(pop == 0){
                           pop =1;
                       }
                   }
               }
            }
            System.out.print(" " + pop + "\n");
            bw.write(" " + pop + "\n");

        }
        bw.close();
    }
}
