package lc_top_interview_150;

import java.util.ArrayList;
import java.util.List;

public class _54_155_MinStack {

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        int min = minStack.getMin();
        System.out.println("min : " + min);
        minStack.pop();
        int top = minStack.top();
        System.out.println("top : " + top);
        int min2 = minStack.getMin();
        System.out.println("min2 : " + min2);
    }
}
/*
    Input
    ["MinStack","push","push","push","getMin","pop","top","getMin"]
    [[],[-2],[0],[-3],[],[],[],[]]

    Output
    [null,null,null,null,-3,null,0,-2]

    Explanation
    MinStack minStack = new MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    minStack.getMin(); // return -3
    minStack.pop();
    minStack.top();    // return 0
    minStack.getMin(); // return -2

 */
class MinStack {
    public List<int[]> stack;

    public MinStack() {
        stack = new ArrayList();
    }

    public void push(int val) {
        if (stack.size() == 0) {
            stack.add(stack.size() , new int[]{val, val});
            return;
        }
        int min = getMin();
        stack.add(stack.size() , new int[]{val, Math.min(min, val)});
    }

    public void pop() {
        stack.remove(stack.size() - 1);
    }

    public int top() {
        return stack.get(stack.size() - 1)[0];
    }

    public int getMin() {
        return stack.get(stack.size() - 1)[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
