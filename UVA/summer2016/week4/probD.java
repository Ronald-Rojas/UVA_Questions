package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Ronald on 6/19/2016.
 */
public class probD {
    public static boolean[] primesarr;
    public static void main(String[] args){
        primesarr = createprimes();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int casenum = 1;
        try{
            while((input = br.readLine()) != null){
                answers = new ArrayList<>();
                int circlesize = Integer.parseInt(input);
                ArrayList<Integer> list1 = new ArrayList<>();
                ArrayList<Integer> list2 = new ArrayList<>();
                list1.add(1);
                for( int i = 2; i <= circlesize; i++){
                    list2.add(i);
                }
                addletter(list1, list2);
                int numlines = answers.size();
                System.out.printf("Case %d:\n", casenum);
                for( int i = 0; i < numlines; i++){
                    for( int j = 0 ; j < circlesize; j++){
                        System.out.printf("%d", answers.get(i).get(j));
                        if(j+1 != circlesize)
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                casenum++;
                System.out.println();
            }
        }catch (Exception e){
        }

    }
    public static ArrayList<ArrayList<Integer>> answers = new ArrayList<>();
    public static void addletter(ArrayList<Integer> addlist , ArrayList<Integer> removelist){
        if(removelist.size() == 0){
            int num = addlist.get(0) +
                    addlist.get(addlist.size() - 1);
            if(primesarr[num] == true){
                answers.add(addlist);
            }

        }else{
            for( int i = 0; i < removelist.size(); i++){
                int nextnum = removelist.get(i);
                if(primesarr[nextnum + addlist.get(addlist.size() -1)] == false){
                    continue;
                }
                ArrayList<Integer> tempaddlist = new ArrayList<>(addlist);
                ArrayList<Integer> tempremovelist = new ArrayList<>(removelist);
                tempaddlist.add(removelist.get(i));
                tempremovelist.remove(i);
                addletter(tempaddlist, tempremovelist);

            }
        }


    }
    public static boolean [] createprimes(){
        boolean[] arr = new boolean[32];
        for( int i = 2; i < 32; i++){
            if(testprime(i)){
                arr[i] = true;
            }
        }
        return arr;
    }
    public static boolean testprime( int num){
        int range = num/2;
        for( int i = 2; i<=range; i++){
            if(num%i == 0)
                return false;

        }
        return true;

    }
}

