package r1a2010;

/**
 * Created by ronald on 4/26/16.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class probB{
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader in = new BufferedReader( new FileReader("input.txt"));
        int numinput = Integer.parseInt(in.readLine());
        File file = new File("output.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for( int input = 0; input < numinput; input++){
            System.out.print("Case #" + (1 + input) + ":");
            bw.write("Case #" + (1 +input) + ":");
            String[] inputstr = in.readLine().split(" ");
            int numjems = Integer.parseInt(inputstr[0]);
            int Xcoord = Integer.parseInt(inputstr[1]);
            if(Xcoord <0){
                Xcoord=0-Xcoord;
            }
            int Ycoord = Integer.parseInt(inputstr[2]);
            int layerbought = Xcoord + Ycoord;
            int filledlayers = 0;
            double prob ;
            int layernum = 1;
            boolean morejems = true;
            if(numjems !=0){
                numjems--;
                filledlayers =1;
            }
            else{
                morejems= false;
            }
            while(morejems == true){
                layernum = ((layernum - 1) *2)+5;
                if(numjems - layernum >0){
                    numjems-=layernum;
                    filledlayers++;
                }
                else{
                    morejems = false;
                }
            }
            if(filledlayers > layerbought){
                prob = 1;
            } else if (filledlayers + 1 < layerbought) {
                prob = 0;
            }
            else if(Ycoord  == filledlayers + 1){
                prob = 0;
            }
            else{

                int maxside = 1;
                for( int i =1; i < layernum;i++){
                    maxside*=2;
                }
                if(layernum - maxside >= Ycoord){
                    prob = 1;
                }
                else{
                    prob = 0;
                    double indprob = 1;
                    for( int i = 1; i <= numjems ;i++){
                        indprob*=.5;
                    }
                    for( int i = Ycoord ; i<numjems;i++){
                        prob += bin(numjems, i +1) * indprob;
                    }
                }
            }
            System.out.print(" " + prob + "\n");
            bw.write(" " + prob + "\n");
        }
        bw.close();
    }

    private static double bin(int n, int r) {
        int skip;
        int divide;
        double total = 1;
        if(n-r > r){
            skip = n-r;
            divide = r;

        }
        else {
            skip = r;
            divide = n-r;
        }
        for( int i = skip +1; i <= n;i++ ){
            total*=i;
        }
        for(int i = 1; i <= divide;i++){
            total/=i;
        }
        return total;
    }
}
