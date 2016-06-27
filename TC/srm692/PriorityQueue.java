package srm692;

/**
 * Created by ronald on 6/27/16.
 */
public class PriorityQueue {
    public int findAnnoyance(String s, int[] a){
        int total = 0;
        int factor = 0;
        int size = a.length;
        for(int i = 0; i< size;i++){
            if(s.charAt(i) == 'b')
                total += factor;

            factor+=a[i];
        }
        return total;
    }
}
