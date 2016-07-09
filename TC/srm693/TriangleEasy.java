package srm693;


import java.util.ArrayList;

/**
 * Created by ronald on 6/25/16.
 */
public class TriangleEasy {
        public class node{
                int vertex;
                boolean done = false;
                ArrayList<Integer> edges = new ArrayList<>();
                node(int v){
                        vertex = v;
                }
                public void add(int edge){
                        edges.add(edge);
                }
        }
        int find(int vertices, int [] x, int [] y){
            node[] mem= new node[vertices];
            for( int i = 0; i < vertices; i++){
                node temp = new node(i);
                mem[i] = temp;
            }
            int size = x.length;
            for(int i = 0; i < size; i++){
                mem[x[i]].add(y[i]);
                mem[y[i]].add(x[i]);
            }
            arr = mem;
            int[] nodes = new int[3];
            for( int i = 0; i < vertices; i++) {
                nodes[0] = i;
                recurse(1, nodes);
                if(min == 0)
                    break;
            }
                return min;

        }

    public static int min = 3;
    public static node[] arr;
    public int recurse(int depth, int[] nodes){
        int temp = nodes[depth -1];
            node currnode;
            currnode = arr[temp];
        if(depth == 3){
            if(currnode.edges.contains(nodes[0])){
                return 0;
            }else{
                return 1;
            }
        }

        int size = currnode.edges.size();
        for( int i = 0; i < size; i++){
            nodes[depth] = currnode.edges.get(i);
            boolean skip = false;
            for( int j = 0; j < depth; j++){
                if(nodes[j] == nodes[depth])
                    skip = true;
                break;
            }
            if(skip == true)
                break;
            int currmin = recurse(depth+1, nodes);
            if(currmin == 0)
                return 0;
            if(currmin < min)
                min = currmin;
        }
        return 4 - depth;
    }

}
