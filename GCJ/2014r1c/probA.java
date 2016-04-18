package r1c2015;

/**
 * Created by ronald on 4/18/16.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class probA{
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader in = new BufferedReader( new FileReader("A-large-practice.in"));
        int numinput = Integer.parseInt(in.readLine());
        File file = new File("output.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for( int input = 0; input < numinput; input++){
            System.out.print("Case #" +(1 + input) +": ");
            bw.write("Case #" + (1 + input )+ ": ");
            String[] fracstr = in.readLine().split("/");
            int mingen = 1;
            boolean ispossible = false;
            boolean foundsmallest = false;
            double frac = Double.parseDouble(fracstr[0])/Double.parseDouble(fracstr[1]);
            if(frac == 1){
                System.out.print("" + 1 +"\n");
                bw.write("" + 1 +"\n");
                continue;
            }
            double subtractrac = 1.0;
            for( int i = 1; i <= 40; i ++){
                subtractrac/=2.0;
                if(frac - subtractrac >=0 && foundsmallest == false){
                    frac -= subtractrac;
                    foundsmallest = true;
                    mingen = i;
                }
                else if(frac - subtractrac >=0){
                    frac -=subtractrac;
                }
                if(frac == 0){
                    ispossible = true;
                    break;
                }
            }
            if(ispossible == true){
                System.out.print("" + mingen + "\n");
                bw.write("" + mingen+ "\n");
            }
            else{
                System.out.print("impossible\n");
                bw.write("impossible\n");
            }

        }
        bw.close();
    }
}
