import java.io.BufferedReader;
import java.util.Hashtable;
import java.util.Enumeration;
import java.io.IOException;
import java.io.InputStreamReader;


public class proba{
    public static void main(String[] args) throws IOException{
        

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = br.readLine();
        int size = Integer.parseInt(inputLine);
        int engines;
        int switches;
        int queries;
        String engineStr;
        Hashtable<String, boolean> engineHash = new Hashtable<String, boolean>();
        for(int cases = 0 ; cases < size; cases++){
            switches = 0;
            engineHash.clear();
            engines = Integer.parseInt(br.readLine()); // find number of engines
            for(int enNum = 0; enNum < engines; enNum++); // go through the number of engines 
            queries = br.readLine();
            for(int querieNum = 0 ; querieNum < queries; querieNum++){
                //read each line and add teh querie if it is not in the table 
                engineStr = br.readLine();
                engineHash.put(engineStr, true);    
                if(engineHash.size() == engines){
                    // if the number of items in the able equal the number of queries, then we 
                    // need to switch the search engine 
                    engineHash.clear();
                    engineHash.put(engineStr, true); // by clearing and then adding the last item
                                                     // we won't pick the same engine twice in a 
                                                     // row.
                    switches++;
            }    
            System.out.printf("Case #%d: %d", cases, switches);

        } 


    }




}
