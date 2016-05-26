/**
 * Created by ronald on 5/26/16.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class probA{
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader in = new BufferedReader( new FileReader("A-small-practice.in"));
        int numinput = Integer.parseInt(in.readLine());
        File file = new File("output.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for( int input = 0; input < numinput; input++){
            System.out.print("Case #" + (1 + input) + ":");
            bw.write("Case #" + (1 +input) + ":");
            int row = Integer.parseInt(in.readLine());
            for( int i = 0; i < row -1; i++)
                in.readLine();
            String[] line = in.readLine().split(" ");
            int[] possnum = new int[4];
            for( int i = 0; i < 4; i++)
                possnum[i] = Integer.parseInt(line[i]);
            for(int i = row + 1; i<= 4; i++)
                in.readLine();
            int k = 0;

            row = Integer.parseInt(in.readLine());
            for( int i = 0; i < row -1; i++)
                in.readLine();
            line = in.readLine().split(" ");
            boolean foundnum = false;
            String output = "";
            for( int i = 0; i < 4; i++){
                int num = Integer.parseInt(line[i]);
                for( int j = 0; j < 4; j++){
                    if( num == possnum[j] ){
                        if (foundnum == false) {
                            output = " " + num;
                            foundnum = true;
                        }else{
                            output = " Bad magician!";
                            break;
                        }
                    }
                }
            }
            if(foundnum == false){
                output = " Volunteer cheated!";
            }
            for(int i = row + 1; i<= 4; i++)
                in.readLine();
            System.out.printf("%s\n" , output );
            bw.write(output + "\n");



        }
        bw.close();
    }
}
