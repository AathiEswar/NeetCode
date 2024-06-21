package NeetCode;

import java.util.PriorityQueue;

public class KthLargest {

    // declare queue and threshold
    private PriorityQueue<Integer> minHeap ;
    private int threshold ;
    public void kthLargest(int k , int[] nums){
        //initialize the vars
       minHeap = new PriorityQueue<>();
       this.threshold = k;

       // add all the num to the minHeap
       for(int num : nums){
           add(num);
       }
    }

    public int add(int val){
        // add the latest val ;
       minHeap.offer(val);

       // maintain the threshold in the minHeap
       if(minHeap.size() > threshold) minHeap.poll();

        // return the peek of the min heap
        return minHeap.peek();
    }
}
