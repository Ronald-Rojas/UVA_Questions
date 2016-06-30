package r360;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.jar.Pack200;

/**
 * Created by ronald on 6/29/16.
 */
public class probC {
    public static class node{
        boolean found = false;
        ArrayList<Integer> edges = new ArrayList<>();
        int index;
        node(int i){
            index = i;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int numnodes = Integer.parseInt(input[0]);
        int numedges = Integer.parseInt(input[1]);
        node[] arr = new node[numnodes];
        for( int i = 0; i < numnodes; i++){
            node temp = new node(i);
            arr[i] = temp;
        }
        for( int i = 0; i< numedges; i++){
            input = br.readLine().split(" ");
            int edge1 = Integer.parseInt(input[0]);
            int edge2 = Integer.parseInt(input[1]);
            arr[edge1].edges.add(edge2);
            arr[edge2].edges.add(edge1);
        }


        LinkedList<node> list1 = new LinkedList<>();
        LinkedList<node> list2 = new LinkedList<>();
        ArrayList<Integer> set1 = new ArrayList<>();
        ArrayList<Integer> set2 = new ArrayList<>();
        node currnode;
        for( int n = 0; n < numnodes; n++){
            currnode = arr[n];
            if(currnode.found == false && currnode.edges.size() != 0){
                list1.add(currnode);
                while(list1.size() !=0) {
                    while(list1.size() != 0){
                        currnode = list1.pop();
                        if(set2.contains(currnode.index)){
                            System.out.print("-1");
                            System.exit(0);
                        }
                        set1.add(currnode.index);
                        if(currnode.found){
                            continue;
                        }
                        currnode.found = true;
                        int len = currnode.edges.size();
                        for (int i = 0; i < len; i++) {
                            list2.add(arr[currnode.edges.get(i)]);
                        }
                    }
                    while(list2.size() != 0){
                        currnode = list2.pop();
                        if(set1.contains(currnode.index)){
                            System.out.print("-1");
                            System.exit(0);
                        }
                        set2.add(currnode.index);
                        if(currnode.found){
                            continue;
                        }
                        int len = currnode.edges.size();
                        for( int i = 0; i < len; i++){
                            list1.add(arr[currnode.edges.get(i)]);
                        }
                    }

                }
            }
        }

        int size = set1.size();
        System.out.println(size);
        for( int i = 0; i< size; i++){
            System.out.printf("%d ", set1.get(i));

        }
        size = set2.size();
        System.out.printf("\n%d\n", size);
        for( int i = 0; i < size; i++){
            System.out.printf("%d ", set2.get(i));
        }


    }
}
