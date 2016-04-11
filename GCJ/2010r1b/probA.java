import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class probA{
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader in = new BufferedReader( new FileReader("A-small-practice.in"));
        int numinput = Integer.parseInt(in.readLine());
        File file = new File("output.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for( int input = 0; input < numinput; input++){
            
            String[] instr = in.readLine().split(" ");
            int N = Integer.parseInt(instr[0]);
            int M = Integer.parseInt(instr[1]);
            System.out.print("Case #" + (input +1) + ":");
            bw.write("Case #" + (input +1) + ":");
            node root = new node();
            root.children = new ArrayList<node>();
            root.name = "root";
            for(int numdir = 0; numdir < N ; numdir ++){
                String temp = in.readLine();
                temp = temp.substring(1);
                String[] dir = temp.split("/");
                node curr = root;
                boolean hasnext = false;
                node next;
                for(int i = 0; i < dir.length; i ++){
                    hasnext = false;
                    for( int j = 0; j < curr.children.size(); j ++){
                        if(dir[i].equals(curr.children.get(j).name)){
                            hasnext = true;
                            curr = curr.children.get(j);
                            break;
                        }
                    }
                    if(hasnext == false){
                        next= new node();
                        next.children = new ArrayList<node>();
                        next.name = dir[i];
                        curr.children.add(next);
                    }
                    
                } 
            }
            int count = 0;
            for(int numdir = 0; numdir < M ; numdir ++){
                String temp = in.readLine();
                temp = temp.substring(1);
                String[] dir = temp.split("/");
                node curr = root;
                boolean hasnext = false;
                node next;
                for(int i = 0; i < dir.length; i ++){
                    hasnext = false;
                    for( int j = 0; j < curr.children.size(); j ++){
                        if(dir[i].equals(curr.children.get(j).name)){
                            hasnext = true;
                            curr = curr.children.get(j);
                            break;
                        }
                    }
                    if(hasnext == false){
                        next = new node();
                        next.children = new ArrayList<node>();
                        next.name = dir[i];
                        curr.children.add(next);
                        curr = next;
                        count++;
                    }
                    
                } 
            }
            System.out.print(" " + count + "\n");
            bw.write(" " + count + "\n");
        }
        bw.close();
    }
        
    public static class node{
        public String name;
        public node parent;
        public ArrayList<node> children;
    }
}
