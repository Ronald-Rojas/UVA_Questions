import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.util.ArrayList;
public class probB {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        int cases= Integer.parseInt(br.readLine());
        ArrayList<Integer> stationA; 
        ArrayList<Integer> stationB;
        int extraTime;
        int trainTime; 
        int numA;
        int numB;
        String[] ABstr;
        for(int caseNum = 1; caseNum < cases; caseNum++){
            stationA = new ArrayList<>();
            stationB = new ArrayList<>();
            extraTime = Integer.parseInt(br.readLine());
            ABstr= br.readLine().split(" ");
            numA = Integer.parseInt(ABstr[0]);
            numB = Integer.parseInt(ABstr[1]);
              
           // turn the hours:minutes to just minutes and put the information into an array 
            for(int i = 0 ;i < numA; i ++){
                String[] timeStr = br.readLine().split(":");
                stationA.add((Integer.parseInt(timeStr[0]) * 60)+ Integer.parseInt(timeStr[1]));
            }
            for( int i = 0;i < numB; i++ ){
                String[] timeStr = br.readLine().split(":");
                stationB.add((Integer.parseInt(timeStr[0]) * 60) + Integer.parseInt(timeStr[1]));
            }
        }


    }



}
