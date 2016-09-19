package r372;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Ronald on 9/17/2016.
 */
public class probB {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int size = str.length();
        ArrayList<Character> list = new ArrayList<>();
        int[] foundlist = new int[256];
        int currfree = 0;
        int numunique = 0;
        try {
            for( int i = 0; i < 26; i++){
                char c = str.charAt(i);
                list.add( c);
                if(c == '?'){
                    currfree ++;
                }else {
                    if(foundlist[c] == 0){
                        numunique ++;
                    }
                    foundlist[c] ++;
                }
            }
        }catch (Exception e){
            System.out.println("-1");
            System.exit(0);
        }
        if(numunique + currfree == 26){
            solve(str, 0);
        }
        for( int i = 26; i < size; i++){
            char remove = list.remove(0);
            if(remove == '?'){
                currfree--;
            }else{
                foundlist[remove]--;
                if(foundlist[remove] == 0){
                    numunique--;
                }
            }

            char c = str.charAt(i);
            list.add(c);
            if(c == '?'){
                currfree++;

            }else{
                if(foundlist[c] == 0){
                    numunique++;
                }
                foundlist[c]++;
            }

            if(currfree + numunique == 26){
                solve(str, i - 25);
            }

        }
        System.out.println("-1");
    }
    public static void solve(String str, int start){
        char []arr= str.toCharArray();
        for( int i = 0; i < start ; i++){
            if(arr[i] == '?'){
                arr[i] = 'A';
            }

        }
        for( int i = start + 26; i < arr.length; i++){
            if(arr[i] == '?'){
                arr[i] = 'A';
            }
        }
        boolean[] found = new boolean[256];
        for( int i = start; i < start + 26; i++){
            found[arr[i]] = true;
        }
        int index = 0;
        for( int i = 'A' ; i <= 'Z'; i++){
            if(found[i] == false){
                index = i;
                break;
            }
        }
        for( int i = start; i < start + 26;  i++){
            if(arr[i] == '?'){
                arr[i] = (char)index;
                for( int j  = index +1; j <= 'Z'; j++){
                    if( found [j] == false){
                        index = j;
                        break;
                    }
                }

            }
        }
        System.out.println(arr);
        System.exit(0);
    }
}
