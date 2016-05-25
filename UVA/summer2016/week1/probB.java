import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ronald on 5/24/16.
 */
public class probB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input ;
        while(!(input = br.readLine()).equals("0:00")){
            String[] inarr = input.split(":");
            int hour = Integer.parseInt(inarr[0]);
            if(hour == 12)
                hour = 0;
            int minutes = Integer.parseInt(inarr[1]);
            double hourangle = hour * 30;
            double add = .5 * minutes;
            hourangle+=add;
            double minangle = minutes * 6;
            double angle = hourangle - minangle;
            if(angle < 0)
                angle = minangle - hourangle;
            if(angle >180)
                angle = 360-angle;

            System.out.printf("%.3f\n", angle);

        }

    }
}
