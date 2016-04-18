import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class template{
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader in = new BufferedReader( new FileReader("input.txt"));
        int numinput = Integer.parseInt(in.readLine());
        File file = new File("output.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for( int input = 0; input < numinput; input++){
            System.out.print("Case #" + (1 + input) + ":");
            bw.write("Case #" + (1 +input) + ":");

        }
        bw.close();
    }
}
