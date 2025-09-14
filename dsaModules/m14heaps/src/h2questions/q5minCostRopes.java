package h2questions;

import java.util.PriorityQueue;

public class q5minCostRopes {

    class Solution {
        // Function to return the minimum cost of connecting the ropes.
        public long minCost(long[] arr) {
            // code here
            PriorityQueue<Long> minHeap = new PriorityQueue<>();
            for(int i=0; i<arr.length; i++){
                minHeap.offer(arr[i]);
            }

            long ans = 0;
            while(minHeap.size() > 1) {
                long sum = minHeap.poll() + minHeap.poll();
                ans = ans + sum;
                minHeap.offer(sum);
            }
            return ans;
        }
    }

    public static void main(String[] args) {

    }
}
