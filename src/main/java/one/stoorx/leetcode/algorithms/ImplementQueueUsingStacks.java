package one.stoorx.leetcode.algorithms;

import java.util.Stack;

// Task: 232. Implement Queue using Stacks
// Link: https://leetcode.com/problems/implement-queue-using-stacks/
// Level: Easy
public class ImplementQueueUsingStacks {
    Stack<Integer> inbox = new Stack<>();
    Stack<Integer> outbox = new Stack<>();

    public void push(int x) {
        inbox.push(x);
    }

    public int pop() {
        ensureOutboxPopulated();
        return outbox.pop();
    }

    public int peek() {
        ensureOutboxPopulated();
        return outbox.peek();
    }

    public boolean empty() {
        return inbox.empty() && outbox.empty();
    }

    private void ensureOutboxPopulated(){
        if(outbox.empty()){
            while(!inbox.empty()){
                outbox.push(inbox.pop());
            }
        }
    }
}
