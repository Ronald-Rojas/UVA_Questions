package r361;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ronald on 7/6/16.
 */
public class probA {
    static int [] vert;
    static int[] hor;
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String input = br.readLine();
        vert = new int[size -1];
        hor = new int[size -1];
        for( int i = 0; i < size-1; i++){
            vert[i] = vertchange(input.charAt(i), input.charAt(i+1));
            hor[i] = horchange(input.charAt(i), input.charAt(i+1));
        }
        int count = 0;
        for( int i = 0; i < 3; i++){
            for( int j = 0; j < 3; j++){
                if(testvalid(i, j))
                    count++;
            }
        }
        if(testvalid(3,1))
            count++;
        if(count > 1) {
            System.out.print("No");
        }
        else{
            System.out.print("Yes");
        }
    }
    static boolean testvalid(int row, int colm){
        int size = vert.length;
        for( int i = 0; i < size; i++){
            row+=vert[i];
            colm+=hor[i];

            if(row <0 || colm < 0 ||
                    row > 3 || colm > 2){
                return false;
            }
            if(row == 3 && (colm != 1)){
                return false;
            }
        }


        return true;


    }
    static int vertchange(char start, char end){
        int a;
        int b;

        switch (end){
            case '1':
            case '2':
            case '3':
                b = 0;
                break;
            case '4':
            case '5':
            case '6':
                b = 1;
                break;
            case '7':
            case '8':
            case '9':
                b = 2;
                break;
            default:
                b = 3;
        }
        switch (start){
            case '1':
            case '2':
            case '3':
                a = 0;
                break;
            case '4':
            case '5':
            case '6':
                a = 1;
                break;
            case '7':
            case '8':
            case '9':
                a = 2;
                break;
            default:
                a = 3;
        }
        return b - a;
    }
    static int horchange(char start, char end){
        int a;
        int b;
        switch (end){
            case '1':
            case '4':
            case '7':
                b = 0;
                break;
            case '2':
            case '5':
            case '8':
            case '0':
                b = 1;
                break;
            default:
                b = 2;
        }
        switch (start){
            case '1':
            case '4':
            case '7':
                a = 0;
                break;
            case '2':
            case '5':
            case '8':
            case '0':
                a = 1;
                break;
            default:
                a = 2;
        }
        return b -a;
    }
}
