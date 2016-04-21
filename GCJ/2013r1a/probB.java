package r1a2013;

/**
 * Created by ronald on 4/21/16.
 */
import java.io.*;

public class probB{
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader in = new BufferedReader( new FileReader("B-small-practice.in"));
        int numinput = Integer.parseInt(in.readLine());
        File file = new File("output.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for( int input = 0; input < numinput; input++){
            System.out.print("Case #" + (1 + input) + ":");
            bw.write("Case #" + (1 +input) + ":");
            String[] energyarrstr = in.readLine().split(" ");
            int maxEnergy = Integer.parseInt(energyarrstr[0]);
            int regen = Integer.parseInt(energyarrstr[1]);
            int numactivities = Integer.parseInt(energyarrstr[2]);
            String[] activitiesstr = in.readLine().split(" ");
            int[] activities = new int[numactivities];
            int currEnergy = maxEnergy;
            long totalvalue = 0;
            int currmax = 0;
            for( int i = 0 ; i < numactivities; i++){
                activities[i] = Integer.parseInt(activitiesstr[i]);
                if(activities[i] > currmax){
                    currmax = activities[i];
                }
            }
            for( int i = 0; i < numactivities; i++){
                if(activities[i] == currmax){
                    totalvalue+= (long) (currEnergy * activities[i]);
                    currEnergy= regen;
                    currmax = 0;
                    for( int j = (i +1); j < numactivities; j++){
                        if(activities[j] > currmax){
                            currmax = activities[j];
                        }
                    }
                }else{
                    int overflow = 0;
                    if((currEnergy + regen) - maxEnergy  >0) {
                        overflow = (currEnergy + regen) - maxEnergy;
                        if(maxEnergy < regen){
                            overflow = currEnergy;
                        }
                        currEnergy = maxEnergy;
                    }
                    else{
                        currEnergy+=regen;
                    }
                    totalvalue+= (long) (overflow * activities[i]);
                }
            }
            System.out.print( " " + totalvalue + "\n");
            bw.write(" " + totalvalue + "\n");
        }
        bw.close();
    }
}
