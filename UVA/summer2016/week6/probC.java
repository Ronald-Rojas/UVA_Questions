package week6;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ronald on 6/28/16.
 */
public class probC {
    public static ArrayList<BigInteger> fiblist = new ArrayList<>();

    public static void main(String [] args) {
        Scanner br = new Scanner(System.in);
        fibfind();
        String input1;
        String input2;

        while(br.hasNext()) {
            BigInteger total = BigInteger.ZERO;
            int size2;
            int size1;
            input1 = br.nextLine();
            input2 = br.nextLine();
            size1 = input1.length();
            size2 = input2.length();
            for (int i = 0; i < size1; i++) {
                if (input1.charAt(i) == '1') {
                    total = total.add(fiblist.get(size1 - 1 - i));
                }
            }
            for (int i = 0; i < size2; i++) {
                if (input2.charAt(i) == '1') {
                    total = total.add(fiblist.get(size2 - 1 - i));
                }
            }

            int size = size1;
            if (size2 > size1)
                size = size2;

            size += 10;
            String output = "";
            for (int i = size - 1; i >= 0; i--) {
                if (total.subtract(fiblist.get(i)).compareTo(BigInteger.ZERO) >= 0) {
                    total = total.subtract(fiblist.get(i));
                    output += '1';
                } else {
                    output += '0';
                }
            }
            int index = output.indexOf('1');
            if(index != -1){
                output = output.substring(output.indexOf('1'));
            }else{
                output = "0";
            }
            System.out.printf("%s\n", output);
            if(br.hasNext()) {
                br.nextLine();
                System.out.printf("\n");
            }
        }

    }
    public static void fibfind(){
        BigInteger prevval= BigInteger.ONE;
        BigInteger curval = BigInteger.ONE.add(BigInteger.ONE);
        BigInteger temp;
        fiblist.add(prevval);
        fiblist.add(curval);
        while(curval.toString().length() < 105){
            temp = curval;
            curval = curval.add(prevval);
            fiblist.add(curval);
            prevval = temp;
        }
    }
}
