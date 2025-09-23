package ProblemOfTheDay;

import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public void reverseQueue(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        
        // Step 1: Remove all elements from queue and push into stack
        while (!q.isEmpty()) {
            st.push(q.poll());
        }
        
        // Step 2: Pop all elements from stack and push back into queue
        while (!st.isEmpty()) {
            q.offer(st.pop());
        }
    }
}