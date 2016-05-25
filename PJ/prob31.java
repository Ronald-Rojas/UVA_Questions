/**
 * Created by Ronald on 5/19/2016.
 */
public class prob31 {
    public static void main(String [] args){
        int total = 0;
        for( int twohundreds = 0; twohundreds <=1; twohundreds++){
            for( int onehundreds = 0; onehundreds <=2 - (twohundreds * 2); onehundreds++){
                for( int fifties  = 0; fifties <=4 - (twohundreds * 4) - (onehundreds * 2); fifties++){
                    int fiftiesremainder = fifties %2;
                    for( int twenties = 0; twenties <= 10 -(twohundreds * 10) - (onehundreds * 5) - (int)((double)fifties * 2.5) - fiftiesremainder; twenties++) {
                        for( int tens = 0; tens <=20 -(twohundreds * 20) - (onehundreds * 10) - (fifties * 5) - (twenties * 2); tens++){
                            for( int fives = 0; fives <= 40 - (twohundreds * 40) - (onehundreds * 20) - (fifties * 10) -(twenties * 4)- (tens * 2) ; fives++){
                                int fivesremainder = fives%2;
                                int test = (int) ((double) fives * 2.5);
                                int add = (int) (100 - (twohundreds * 100) - (onehundreds * 50) - (fifties * 25) - (twenties * 10) - (tens *5) - (int)((double)fives * 2.5) -fivesremainder);
                                add++;
                                total +=add;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(total);
    }
}
