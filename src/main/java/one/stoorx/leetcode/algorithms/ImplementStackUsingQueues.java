package one.stoorx.leetcode.algorithms;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;

// Task: 225. Implement Stack using Queues
// Link: https://leetcode.com/problems/implement-stack-using-queues
// Level: Easy
public class ImplementStackUsingQueues {
    Queue<Integer> queue = new ArrayDeque<>();

    public void push(int x) {
        queue.offer(x);
    }

    public int pop() {
        Queue<Integer> operationQueue = new ArrayDeque<>();
        int queueSize = queue.size();
        for (int i = 0; i < queueSize - 1; ++i)
            operationQueue.offer(queue.poll());
        int element = Objects.requireNonNull(queue.poll());
        queue = operationQueue;
        return element;
    }

    public int top() {
        Queue<Integer> operationQueue = new ArrayDeque<>();
        int element = pop();
        queue.offer(element);
        return element;
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
