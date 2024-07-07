package top_100_interview_programming_questions;

public class NthNodeInALinkedList {
    public static int findNthNode(Node head, int n){
        int c = 1;
        Node curr = head;
        while(curr != null && c != n){
            if(c == n)
                return curr.value;
            curr = curr.next;
            c++;
        }
        return -1;
    }

}

class Node {
    int value;
    Node next;
    Node(){}
    Node(int v, Node n){
        this.value = v;
        this.next = n;
    }
}
