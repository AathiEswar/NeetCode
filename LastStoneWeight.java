package NeetCode;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones){
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones){
            queue.add(stone);
        }

        while(queue.size()>1){
            queue.add(queue.poll() - queue.poll());
        }

        return queue.poll();
    }
}
