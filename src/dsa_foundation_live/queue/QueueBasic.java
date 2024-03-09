package dsa_foundation_live.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBasic {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        print("size : " + q.size());

        print(q.remove());
        print(q.remove());

        print("size : " + q.size());
        print(q.peek());

        print("size : " + q.size());
    }
    static void print(Integer i){
        System.out.println(i);
    }
    static void print(String i){
        System.out.println(i);
    }
}
