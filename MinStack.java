package NeetCode;

import java.util.Stack;

class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();

    }

    public void push(int val) {
        stack.push(val);

        if(minStack.isEmpty()) minStack.push(val);
        else if(minStack.peek() >= val) minStack.push(val);
    }

    public void pop() {
        int val = stack.pop();

        if(minStack.peek() == val) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

