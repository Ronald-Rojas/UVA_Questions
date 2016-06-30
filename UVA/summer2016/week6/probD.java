package week6;


import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by ronald on 6/29/16.
 */
public class probD {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int operations = in.nextInt();
            LinkedList<Integer> stack = new LinkedList<>();
            LinkedList<Integer> queue = new LinkedList<>();
            PriorityQueue<Integer> pqueue = new PriorityQueue<>(10, Collections.reverseOrder());
            boolean bstack = true;
            boolean bqueue = true;
            boolean bpqueue = true;
            int temp;
            int task;
            int input;

            for( int op = 0; op < operations ; op++){
                task = in.nextInt();
                input = in.nextInt();
                if(task == 1){
                    stack.push(input);
                    queue.add(input);
                    pqueue.add(input);
                }else{
                    temp = stack.pop();
                    if(temp != input)
                        bstack = false;
                    temp = queue.pop();
                    if(temp != input)
                        bqueue = false;
                    temp = pqueue.poll();
                    if(temp != input)
                        bpqueue = false;
                }

            }
            int possibilities = 0;
            if(bstack == true)
                possibilities++;
            if(bqueue == true)
                possibilities++;
            if(bpqueue == true)
                possibilities++;

            String output;
            if(possibilities == 0){
                output = "impossible\n";
            }else if(possibilities != 1){
                output = "not sure\n";
            }else if(bstack == true){
                output = "stack\n";
            }else if(bqueue == true){
                output = "queue\n";
            }else{
                output = "priority queue\n";
            }

            System.out.printf("%s", output);
        }
    }
}
