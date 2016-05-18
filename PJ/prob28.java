/**
 * Created by ronald on 5/18/16.
 */
public class prob28 {
    public static void main(String[] args){
        int side = 3;
        int total = 1;
        while( side != 1003){
            int square = side * side;
            int firstedge = square - ( 3 * (side -1));
            total += (4 * firstedge);
            total += (6 * (side -1));

            side+=2;
        }
        System.out.println(total);

    }
}
