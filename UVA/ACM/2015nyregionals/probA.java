package week1;

import java.io.*;

/**
 * Created by Ronald on 4/22/2016.
 */

public class probA{
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader in = new BufferedReader(new FileReader("input.txt"));
        int numinput = Integer.parseInt(in.readLine());
        File file = new File("output.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for (int input = 1; input <= numinput; input++) {
            System.out.print(""+ input);
            bw.write("" + input );
            String[] inputstr = in.readLine().split(" ");
            int k = Integer.parseInt(inputstr[1]);
            int s1 =0;
            int s2 = 0;
            int s3 = 0;
            for( int i = 1; i <= k; i++){
                s1+=i;
                s2+= (i * 2) -1;
                s3+=i * 2 ;
            }
            String outputstr = " " + s1 + " " + s2 + " " + s3 + "\n";
            System.out.print(outputstr);
            bw.write(outputstr);


        }
        bw.close();
    }
}
