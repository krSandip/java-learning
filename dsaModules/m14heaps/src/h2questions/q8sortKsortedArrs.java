package h2questions;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class q8sortKsortedArrs {

    class Solution{

        public static class Node implements Comparable<Node>{
            int value;
            int i;
            int j;

            public Node(int value, int row, int col){
                this.value = value;
                i = row;
                j = col;
            }

            @Override
            public int compareTo(Node other) {
                return this.value - other.value;
            }
        }

        //Function to merge k sorted arrays.
        public static ArrayList<Integer> mergeKArrays(int[][] arr, int K) {
            // Write your code here.
            PriorityQueue<Node> minHeap = new PriorityQueue<>();
            // step 1
            for(int i=0; i<K; i++){
                Node temp = new Node(arr[i][0], i, 0);
                minHeap.offer(temp);
            }

            ArrayList<Integer> ans = new ArrayList<>();
            // step 2
            while(minHeap.size() > 0){
                Node temp = minHeap.peek();
                ans.add(minHeap.peek().value);
                minHeap.poll();
                int row = temp.i;
                int col = temp.j;

                if(col+1 < arr[row].length){
                    Node next = new Node(arr[row][col+1], row, col+1);
                    minHeap.offer(next);
                }
            }
            return ans;
        }
    }
}
