import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ronald on 5/24/16.
 */
public class probE {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String output = "";
        while(!(input = br.readLine()).equals("___________")){
            input = input.substring(1,6 ) +input.substring(7, input.length() -1);
            int value = 0;
            int add =128;
            for( int i = 0; i < 8; i++){
                if(input.charAt(i) == 'o'){
                    value+=add;
                }
                add/=2;
            }
            output+= (char) value;

        }
        System.out.print(output);
    }
}
