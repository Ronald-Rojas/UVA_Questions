
/**
 * Created by Ronald on 4/24/2016.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class prob67{
    public static int maxpath =0;
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader in = new BufferedReader( new FileReader("input/prob18input.txt"));
        File file = new File("output.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        String inputstr = in.readLine();
        node root = new node(Integer.parseInt(inputstr));
        ArrayList<node>  currentline = new ArrayList<>();
        currentline.add(root);
        while((inputstr = in.readLine()) !=null){
            String[] inputarr = inputstr.split( " ");
            ArrayList<node> nextline = new ArrayList<>();
            for(int i = 0; i < inputarr.length ; i++){
                node newnode = new node(Integer.parseInt(inputarr[i]));

                if( i - 1 != -1){
                    currentline.get(i -1).right = newnode;
                }
                if( i != currentline.size()){
                    currentline.get(i).left = newnode;
                }
                nextline.add(newnode);
            }
            currentline = nextline;
        }
        findmax(root, 0);
        System.out.println(maxpath);
        bw.close();
    }
    public static void findmax(node currnode , int pastvalue){
        int currentvalue = pastvalue + currnode.value;
        if(currentvalue <= currnode.maxpath){
            return;
        }
        currnode.maxpath = currentvalue;
        if(currnode.left == null){
            if(currentvalue >maxpath) {
                maxpath = currentvalue;
                System.out.println(maxpath);
            }
            return;
        }
        findmax(currnode.left, currentvalue);
        findmax(currnode.right, currentvalue);

    }
    public static class node{
        node(int num){
            value = num;

        }
        int maxpath = -1;
        int value;
        node left;
        node right;

    }
}
