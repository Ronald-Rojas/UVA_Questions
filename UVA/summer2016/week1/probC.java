import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ronald on 5/25/16.
 */
public class probC {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numin = Integer.parseInt(br.readLine());
        for( int in = 0; in < numin; in++){
            String[] input = br.readLine().split(" ");
            int len = Integer.parseInt(input[1]);
            int width = Integer.parseInt(input[2]);
            switch ( input[0].charAt(0)){
                case 'K':
                    solveking(len, width);
                    break;
                case 'k':
                    solveknight(len, width);
                    break;
                case 'r':
                    solverook(len, width);
                    break;
                case 'Q':
                    solvequeen(len, width);
                    break;
            }
        }

    }
    public static void solveking( int len, int width){
        len ++;
        len/=2;
        width++;
        width/=2;
        int total = len * width;
        System.out.printf("%d\n", total);
    }
    public static void solverook(int len, int width){
        int min;
        if( len < width)
            min = len;
        else
            min = width;
        System.out.printf("%d\n", min);
    }
    public static void solvequeen(int len, int width){
        if(width > len){
            int temp = width;
            width = len;
            len = temp;
        }
        int total = 0;
        if(width >= 8) {
            total = width;
        }else {
            if (len == width)
                total = width - 1;
            else
                total = width;
        }
        System.out.printf("%d\n", total);


    }
    public static void solveknight(int len, int width){
        int total = len * width/2;
        if(width%2 ==1){
            total+= (width/2) + 1;
        }
        System.out.printf("%d\n", total);

    }
}
