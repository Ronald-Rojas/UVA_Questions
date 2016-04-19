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

public class probB{
    static int count = 0;
    static final int AVAL = 97;
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader in = new BufferedReader( new FileReader("B-large-practice.in"));
        int numinput = Integer.parseInt(in.readLine());
        File file = new File("output.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for( int input = 0; input < numinput; input++){
            System.out.print("Case #" + (1 + input) + ":");
            count = 0;
            bw.write("Case #" + (1 +input) + ":");
            int numsets = Integer.parseInt(in.readLine());
            String[] setarr = in.readLine().split(" ");

            recurse(setarr, 0);
            System.out.print( " " + count + "\n");
            bw.write(" " + count + "\n");
        }
        bw.close();
    }
    public static void checkvalid(String[] setarr){
        boolean[] alphabet = new boolean[26];
        String line = "" ;
        for( int i = 0; i < setarr.length; i++){
            line += setarr[i];
        }
        boolean isvalid = true;
        char currchar = line.charAt(0);
        alphabet[line.charAt(0) - AVAL] = true;
        for( int i = 1; i < line.length(); i++){
            if(currchar != line.charAt(i)){
                if( alphabet[line.charAt(i) - AVAL] == true){
                    isvalid = false;
                    break;
                }
                else{
                    alphabet[line.charAt(i) - AVAL] = true;
                    currchar = line.charAt(i);
                }
            }


        }
        if(isvalid == true){
            count++;
        }

    }
    public static void recurse(String [] setarr, int index) {
        int length = setarr.length;
        if( index == length -1){
            checkvalid(setarr);
        }
        else{
            for( int i =0; i + index < length ;i++){
                String[] tempset = new String[length];
                for( int j = 0; j < length; j ++){
                    tempset[j] = setarr[j];
                }
                tempset[index] = setarr [index + i];
                tempset[index+i] = setarr[index];
                recurse(tempset, index+1);
            }
        }

    }

}

