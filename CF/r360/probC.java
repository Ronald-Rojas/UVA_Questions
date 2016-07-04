package r360;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Ronald on 7/3/2016.
 */
public class probC {
    public static class node{
        int index;
        ArrayList<Integer> edges = new ArrayList<>();
        boolean found = false;
        node(int num){
            index = num;

        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        Integer numnodes = Integer.parseInt(input[0]);
        numnodes++;
        Integer numedges = Integer.parseInt(input[1]);
        node[] arr = new node[numnodes];
        node temp;
        int foundnodes =0;
        for( int i = 0 ;i < numnodes; i++){
            temp = new node(i);
            arr[i] = temp;
        }
        int edge1;
        int edge2;
        for(Integer curredge = 0; curredge < numedges ; curredge++){
            input = br.readLine().split(" ");
            edge1 = Integer.parseInt(input[0]);
            edge2 = Integer.parseInt(input[1]);
            arr[edge1].edges.add(edge2);
            arr[edge2].edges.add(edge1);
        }

        ArrayList<Integer> set1 = new ArrayList<>();
        ArrayList<Integer> set2 = new ArrayList<>();

        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        Integer currnode;
        Integer size;
        for(Integer inode = 0; inode < numnodes; inode++){
            currnode = inode;
            boolean first = true;
            if(arr[currnode].edges.size() == 0)
                continue;

            list1.add(currnode);
            while(list1.size() != 0){
                while(list1.size() != 0){
                    currnode = list1.pop();
                    if(set2.contains(currnode) && !first){
                        System.out.print("-1");
                        System.exit(0);
                    }
                    first = false;
                    if(arr[currnode].found == true){
                        continue;
                    }

                    arr[currnode].found = true;
                    set1.add(currnode);
                    size = arr[currnode].edges.size();
                    for( int i = 0; i < size; i++){
                        list2.add(arr[currnode].edges.get(i));
                    }
                    foundnodes+=size;
                }
                while(list2.size() != 0){
                    currnode = list2.pop();
                    if(set1.contains(currnode)){
                        System.out.print("-1");
                        System.exit(0);
                    }
                    if(arr[currnode].found == true){
                        continue;
                    }

                    arr[currnode].found = true;
                    set2.add(currnode);
                    size = arr[currnode].edges.size();
                    for( int i = 0; i < size ; i++){
                        list1.add(arr[currnode].edges.get(i));
                    }

                }
            }
            if(foundnodes == numedges)
                break;
        }
        size = set1.size();
        System.out.printf("%d\n", size);
        for( int i = 0; i < size; i++){
            System.out.printf("%d ", set1.get(i) );
        }
        size = set2.size();
        System.out.printf("\n%d\n", size);
        for( int i = 0; i < size; i++){
            System.out.printf("%d ", set2.get(i) );
        }
    }
}
