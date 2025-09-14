package h2questions;

import java.io.IOException;
import java.util.Scanner;

public class q1minToMaxHeap {

    //{ Driver Code Starts
//Initial Template for Java

//import java.util.*;
//import java.lang.*;
//import java.math.*;
//import java.io.*;

    class GFG {
        public void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            while (T-- > 0) {
                int n = sc.nextInt();
                int a[] = new int[n];
                for(int i=0;i<n;i++){
                    a[i]=sc.nextInt();
                }
                Solution obj = new Solution();
                obj.convertMinToMaxHeap(n,a);
                for(int e : a)
                {
                    System.out.print(e+" ");
                }
                System.out.println();
            }
        }
    }

// } Driver Code Ends


//User function Template for Java

    class Solution {
        static void convertMinToMaxHeap(int N, int arr[]) {
            for(int i=(N/2)-1; i>=0; i--){
                heapify(arr, N, i);
            }
        }

        static void heapify(int[] arr,int N, int i){
            int max = i;
            int left = 2*i + 1;
            int right = 2*i + 2;
            if(left < N && arr[left] > arr[max]){
                max = left;
            }
            if(right < N && arr[right] > arr[max]){
                max = right;
            }
            if(max != i){
                int temp = arr[i];
                arr[i] = arr[max];
                arr[max] = temp;
                heapify(arr, N, max);
            }
        }
    }

}
