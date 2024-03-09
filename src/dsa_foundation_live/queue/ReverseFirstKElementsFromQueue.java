package dsa_foundation_live.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElementsFromQueue {

    public static void main(String[] args) {

        // input = 3 10 2 12 19 6 8 10 14
        // output = 12 2 10 3 19 6 8 10 14
        // k = 4
        Queue<Integer> q = new LinkedList<>();
        q.add(3);
        q.add(10);
        q.add(2);
        q.add(12);
        q.add(19);
        q.add(6);
        q.add(8);
        q.add(10);
        q.add(14);
        Queue<Integer> resultQ = reverseKElementFromQueue(q, 4);

    }
    static Queue<Integer> reverseKElementFromQueue(Queue q, int k){
        Stack s = new Stack();
        for(int i = 1; i <= k; i++)
            s.add(q.remove());
        for(int i = 1; i <= k; i++)
            q.add(s.pop());
        for(int i = 1; i<= q.size() - k; i++)
            q.add(q.remove());

        return q;
    }
}
