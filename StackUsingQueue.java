package NeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    class MyStack {

        Queue<Integer> queue1 ;
        Queue<Integer> queue2 ;

        public MyStack() {
            queue1 = new LinkedList<>();
            queue2 = new LinkedList<>();
        }

        public void push(int x) {
            queue2.offer(x);

            while(!queue1.isEmpty()){
                queue2.offer(queue1.poll());
            }

            while(!queue2.isEmpty()){
                queue1.offer(queue2.poll());
            }
        }

        public int pop() {
            return queue1.poll();
        }

        public int top() {
            return queue1.peek();
        }

        public boolean empty() {
            return queue1.isEmpty();
        }
    }
}
