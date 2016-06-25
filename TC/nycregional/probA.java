
/**
 * Created by ronald on 6/17/16.
 */
public class probA {
    int getSize(String[] packets){
        int[] letterscount = new int[26];
        int numpackets = packets.length;
        for( int currpacketnum = 0; currpacketnum < numpackets ; currpacketnum++){
            String currpacket = packets[currpacketnum];
            int stringlen = currpacket.length();
            for( int curletter = 0; curletter < stringlen; curletter++){
                char letter = currpacket.charAt(curletter);
                letterscount[letter- 65]++;
            }
        }
        int total = 0;
        for( int i = 0; i < 26 ; i++){
            if(letterscount[i] %2 == 1){
                letterscount[i] --;
            }
            total += letterscount[i];
        }
        total/=2;
        return total;
    }
}
