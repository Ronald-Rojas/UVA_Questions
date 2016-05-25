import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ronald on 5/24/16.
 */
public class probD {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input ;
        int numinput = 0;
        input = br.readLine();
        while(!input.equals("0 0")){
            numinput++;
            String[] inputarr = input.split(" ");
            int numreq = Integer.parseInt(inputarr[0]);
            int numprop = Integer.parseInt(inputarr[1]);
            for( int i = 0; i < numreq; i++)
                br.readLine();
            int maxcomp = 0;
            double minprice = Double.MAX_VALUE;
            String compname = "";
            String currname = "";
            double currprice;
            int currcomp;
            for(int prop = 0; prop < numprop;prop++){
                currname = br.readLine();
                input = br.readLine();
                inputarr = input.split(" ");
                currprice = Double.parseDouble(inputarr[0]);
                currcomp = Integer.parseInt(inputarr[1]);
                for( int i = 0; i< currcomp; i++)
                    br.readLine();
                if(currcomp > maxcomp){
                    maxcomp = currcomp;
                    minprice = currprice;
                    compname = currname;
                }else if(currcomp == maxcomp && currprice < minprice){
                    maxcomp = currcomp;
                    minprice = currprice;
                    compname = currname;

                }

            }
            System.out.printf("RFP #%d\n%s\n", numinput, compname);
            input = br.readLine();
            if(!input.equals("0 0"))
                System.out.println();

        }
    }
}
