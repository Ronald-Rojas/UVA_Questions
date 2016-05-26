/**
 * Created by ronald on 5/26/16.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class probB{
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader in = new BufferedReader( new FileReader("B-large-practice.in"));
        int numinput = Integer.parseInt(in.readLine());
        File file = new File("output.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for( int input = 0; input < numinput; input++){
            System.out.print("Case #" + (1 + input) + ":");
            bw.write("Case #" + (1 +input) + ":");
            Double mincost = Double.MAX_VALUE;
            String[] inputline = in.readLine().split(" ");
            Double farmcost = Double.parseDouble(inputline[0]);
            Double addrate = Double.parseDouble(inputline[1]);
            Double wincost = Double.parseDouble(inputline[2]);
            Double rate = 2.0;
            Double curramount;
            Double totalfarmscost = 0.0;
            while(true){
                curramount = (wincost/rate) + totalfarmscost;
                if(curramount > mincost)
                    break;

                mincost = curramount;
                totalfarmscost += (farmcost/rate);
                rate+=addrate;
            }
            System.out.printf(" " + mincost + "\n");
            bw.write(" " + mincost + "\n");

        }
        bw.close();
    }
}
