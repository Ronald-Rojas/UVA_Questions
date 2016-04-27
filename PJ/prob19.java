/**
 * Created by Ronald on 4/24/2016.
 */
public class prob19 {
    public static void main(String [] args){
        int currentday = 1;
        int[] monthdays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalsundays= 0;
        for( int j = 0; j < 12;j++){
            currentday+=monthdays[j];
            currentday= currentday %7;
        }
        for( int i = 1; i <= 100;i++){
            for( int j = 0; j <12;j++){
                if(currentday == 0){
                    totalsundays++;
                }
                currentday+=monthdays[j];
                if(j == 1){
                    if(i%4 == 0 && i%100 != 0 ){
                        currentday++;
                    }
                }
                currentday = currentday%7;
            }
        }
        System.out.println(totalsundays);

    }
}
