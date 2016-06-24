package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Ronald on 5/31/2016.
 */
public class probB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int numtests = Integer.parseInt(input);
        br.readLine();
        for( int casenum = 0; casenum < numtests ; casenum++){
            ArrayList<String> outputarr = new ArrayList<>();
            ArrayList<String> inputline = new ArrayList<>();
            ArrayList<int[]> inputchars = new ArrayList<>();
            input = br.readLine();
            while(input.length() > 0){
                inputline.add(input);
                inputchars.add(findchars(input));
                input = br.readLine();
            }
            int size = inputline.size();
            for( int i = 0; i < size; i++){
                for( int j = i+1; j < size;j++){
                    if(anagramcheck(inputchars.get(i), inputchars.get(j)) == true){
                        String str1 = inputline.get(i);
                        String str2 = inputline.get(j);
                        String output;
                        if(stringcomp(str1, str2) == false) {
                            output = str1 + " = " + str2;
                        }
                        else{
                            output = str2 + " = " + str1;
                        }
                        outputarr.add(output);
                    }
                }
            }
            Collections.sort(outputarr);
            size = outputarr.size();
            for( int i = 0 ; i < size; i ++){
                System.out.printf("%s\n", outputarr.get(i));
            }
        }
    }
    public static boolean stringcomp(String str1, String str2){
        int size = str1.length();
        if(str2.length() < str1.length())
            size = str2.length();
        for( int i = 0 ; i < size; i++){
            if(str1.charAt(i) > str2.charAt(i))
                return true;
            else if(str1.charAt(i) < str2.charAt(i))
                return false;
        }
        return true;
    }
    public static int[] findchars(String input){
        int[] list= new int[256];
        int size = input.length();
        for( int i = 0; i < size; i++){
            list[(int) input.charAt(i)]++;
        }
        return list;
    }
    public static boolean anagramcheck(int[] list1, int[] list2){
        for(int i = 0; i < 256; i++){
            if(list1[i] != list2[i] && i != 32){
                return false;
            }
        }
        return true;
    }
}
