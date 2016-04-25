package r1b2013;

/**
 * Created by ronald on 4/25/16.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class probA{
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader in = new BufferedReader( new FileReader("A-large-practice.in"));
        int numinput = Integer.parseInt(in.readLine());
        File file = new File("output.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for( int input = 0; input < numinput; input++){
            System.out.print("Case #" + (1 + input) + ":");
            bw.write("Case #" + (1 +input) + ":");
            String[] inputstr = in.readLine().split(" ");
            int mymote = Integer.parseInt(inputstr[0]);
            int numenemy = Integer.parseInt(inputstr[1]);
            inputstr = in.readLine().split( " " );
            ArrayList<Integer> enemynodes = new ArrayList<>();
            for( int i = 0; i < numenemy; i++){
                enemynodes.add(Integer.parseInt(inputstr[i]));
            }
            enemynodes = sort(enemynodes);
            int maxremoves  = enemynodes.size();
            int maxadds = 0;
            int smallestcombination = maxremoves;
            if(mymote == 1){
                enemynodes = new ArrayList<>();
            }
            while(enemynodes.size() >0){
                if(enemynodes.get(0) <mymote){
                    mymote+=enemynodes.get(0);
                    enemynodes.remove(0);
                    maxremoves--;
                }
                else {
                    maxadds++;
                    maxremoves++;
                    mymote += mymote - 1;
                    if (maxadds == maxremoves) {
                        break;
                    }
                }
                if(smallestcombination > maxremoves)
                    smallestcombination = maxremoves;
            }
            String output = " " + smallestcombination + "\n";
            System.out.print(output);
            bw.write(output);

        }
        bw.close();
    }

    private static ArrayList<Integer> sort(ArrayList<Integer> unsorted) {
        ArrayList<Integer>  sorted = new ArrayList<>();
        while(unsorted.size() != 0){
            int minindex = 0;
            int minvalue = unsorted.get(0);
            for( int i = 1; i <unsorted.size(); i++){
                if(unsorted.get(i) < minvalue){
                    minindex = i;
                    minvalue = unsorted.get(i);
                }
            }
            sorted.add(unsorted.get(minindex));
            unsorted.remove(minindex);
        }
        return sorted;
    }
}