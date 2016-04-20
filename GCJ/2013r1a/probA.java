package r1a2013;

/**
 * Created by ronald on 4/20/16.
 */import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import static java.lang.Math.PI;

public class probA{
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader in = new BufferedReader( new FileReader("A-large-practicein"));
        int numinput = Integer.parseInt(in.readLine());
        File file = new File("output.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for( int input = 0; input < numinput; input++){
            System.out.print("Case #" + (1 + input) + ":");
            bw.write("Case #" + (1 +input) + ":");
            String[] inputstr = in.readLine().split( " ");
            long initR = Long.parseLong(inputstr[0]);
            long paint = Long.parseLong(inputstr[1]);
            long numcircles = 0;
            boolean paintmore = true;
            long currR = initR;
            while(paintmore == true){
                long whitearea = currR * currR ;
                currR++;
                long paintarea = currR * currR ;
                paint-=(paintarea -whitearea);
                if( paint>=0){
                    numcircles++;
                    currR ++;
                }else{
                    paintmore = false;
                }
            }
            System.out.print(" " + numcircles + "\n");
            bw.write(" " + numcircles + "\n");
        }
        bw.close();
    }
}

