package r1c2013;

/**
 * Created by ronald on 4/27/16.
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
        BufferedReader in = new BufferedReader( new FileReader("input.txt"));
        int numinput = Integer.parseInt(in.readLine());
        File file = new File("output.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for( int input = 0; input < numinput; input++){
            System.out.print("Case #" + (1 + input) + ":");
            bw.write("Case #" + (1 +input) + ":");
            String[] inputstr = in.readLine().split( " ");
            String name = inputstr[0];
            int conlen = Integer.parseInt(inputstr[1]);
            ArrayList<Integer> conindexes = new ArrayList<>();
            for( int i =0 ;i < name.length() - conlen +1;i++){
                boolean foundlen = true;
                for( int j = 0; j < conlen; j++){
                    char letter = name.charAt(i+j);
                    switch (letter){
                        case 'a':
                        case 'i':
                        case 'e':
                        case 'o':
                        case 'u':
                            foundlen = false;
                        default:
                            break;
                    }
                }
                if(foundlen == true){
                    conindexes.add(i);
                }
            }
            int nvalue =0;
            for( int i = 0; i < conindexes.size(); i++){
                int backnum= checkback(name, conlen, conindexes.get(i));
                nvalue+=backnum;
                nvalue += checkforward(name, conlen, conindexes.get(i), backnum);

            }
            String output = " " + nvalue + "\n";
            System.out.print(output);
            bw.write(output);
        }
        bw.close();
    }
    public static int checkback(String name, int conlen, int index){
        int combinations = 0;
        int nextconlen = conlen;
        index --;
        while(index >-1){
            switch (name.charAt(index)){
                case 'a':
                case 'i':
                case'e':
                case 'o':
                case 'u':
                    nextconlen=0;
                    break;
                default:
                    nextconlen++;

            }
            index--;
            if(nextconlen>=conlen){

            }else
                combinations++;
        }
        return combinations;
    }
    public static int checkforward(String name, int conlen, int index, int backnum){
        int combinations = 1;
        index +=conlen;
        int add = (index);
        add*=(1+ backnum);
        combinations+=add;
        return combinations;
    }
}
