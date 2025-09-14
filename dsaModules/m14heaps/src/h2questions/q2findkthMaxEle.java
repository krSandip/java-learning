package h2questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class q2findkthMaxEle {

    //{ Driver Code Starts
// Initial Template for Java

    /*package whatever //do not write package name here */

    class GFG {
        public void main(String args[]) throws IOException {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(System.out);

            int t = Integer.parseInt(in.readLine().trim());
            while (t-- > 0) {
                String line = in.readLine();
                String[] tokens = line.split(" ");

                // Create an ArrayList to store the integers
                ArrayList<Integer> array = new ArrayList<>();

                // Parse the tokens into integers and add to the array
                for (String token : tokens) {
                    array.add(Integer.parseInt(token));
                }

                int[] arr = new int[array.size()];
                int idx = 0;
                for (int i : array) arr[idx++] = i;

                int key = Integer.parseInt(in.readLine().trim());
                Solution ob = new Solution();
                out.println(ob.kthSmallest(arr, key));
            }
            out.flush();
        }
    }

// } Driver Code Ends


// User function Template for Java

    class Solution {
        public static int kthSmallest(int[] arr, int k) {
            // Your code here
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
            for(int i=0; i<k; i++){
                maxHeap.offer(arr[i]);
            }

            for(int i=k; i<arr.length; i++){
                if(arr[i] < maxHeap.peek()){
                    maxHeap.poll();
                    maxHeap.offer(arr[i]);
                }
            }

            return maxHeap.peek();
        }
    }

}
