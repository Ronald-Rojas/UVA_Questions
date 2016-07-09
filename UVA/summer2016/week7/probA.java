package week7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by ronald on 7/5/16.
 */
public class probA {
    public static void main(String[] args){
        String input;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        int index = 0;
        while(sc.hasNext()){
            index++;
            arr = new ArrayList<>();
            while(!(input = sc.nextLine().trim()).equals("9")){
                arr.add(input);
            }
            Collections.sort(arr);
            boolean isdeco = true;
            int size = arr.size();
            size--;
            for( int i = 0; i < size ; i++){
                if(testdeco(i, arr)){
                    isdeco = false;
                    break;
                }
            }
            if(isdeco){
                System.out.printf("Set %d is immediately decodable\n", index);
            }else{
                System.out.printf("Set %d is not immediately decodable\n", index);
            }
        }


    }
    public static boolean testdeco(int index , ArrayList<String> arr){
        String str1 = arr.get(index);
        String str2 = arr.get(index + 1);
        int size = str1.length();
        if(size == str2.length())
            return false;

        if( size > str2.length())
            size = str2.length();

        for( int i = 0; i < size;i++){
            if(str1.charAt(i) != str2.charAt(i))
                return false;
        }
        return true;

    }
}
