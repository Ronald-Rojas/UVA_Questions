package r1c2014;

/**
 * Created by ronald on 4/19/16.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class probC{
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader in = new BufferedReader( new FileReader("C-small-practice.in"));
        int numinput = Integer.parseInt(in.readLine());
        System.out.println(numinput);
        File file = new File("output.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for( int input =0; input < numinput; input++){
            System.out.print("Case #" + (1 + input) + ":");
            bw.write("Case #" + (1 +input) + ":");
            String [] inputstr = in.readLine().split(" ");
            int N = Integer.parseInt(inputstr[0]);
            int M = Integer.parseInt(inputstr[1]);
            int K = Integer.parseInt(inputstr[2]);
            int numrocks = 1000;
            if(N < 3 || M <3){
                numrocks = K;
            } else{
                boolean foundmin = false;
                int length =0;
                int width = 0;
                while( foundmin == false){
                    if(length > N-3 && width > M -3){ foundmin = true;
                        numrocks = (length * 2) + (width * 2 );
                        int currcapt = ( length * width) + (length * 2 ) + (width * 2);
                        numrocks += ( K - currcapt);
                    }
                    if(length <= N - 3)
                        length++;
                    if(width <= M -3 )
                        width++;
                    int currcapt = (length * width) + (length * 2) + (width * 2);
                    if(currcapt == K){
                        numrocks = (length * 2) + (width * 2);
                        foundmin = true;

                    }
                    else if (currcapt > K){
                        if(width > length)
                            width --;
                        else
                            length--;

                        numrocks= (width * 2) + (length * 2);
                        if(K - numrocks == 1){
                            numrocks +=1;
                        }

                        foundmin = true;
                    }
                    else if ( currcapt + 1 == K){
                        numrocks = ( length * 2 ) + (width * 2) + 1;
                        foundmin = true;
                    }

                }
            }
            System.out.print(" " + numrocks + "\n");
            bw.write(" " + numrocks + "\n");
        }
        bw.close();
    }
}
