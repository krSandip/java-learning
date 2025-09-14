package h2questions;

public class q4mergeTwoMaxHeaps {

    class Solution{
        public int[] mergeHeaps(int[] a, int[] b, int n, int m) {
            // your code here
            int[] ans = new int[m+n];

            for(int i=0; i<n+m; i++){
                if(i < n){
                    ans[i] = a[i];
                }
                if(i >= n){
                    ans[i] = b[i-n];
                }
            }

            for(int i=((n+m) / 2) -1; i>=0; i--){
                heapify(ans, i);
            }

            return ans;
        }

        static void heapify(int[] arr, int index){
            int max = index;
            int left = index*2 + 1;
            int right = index*2 + 2;

            if(left < arr.length && arr[left] > arr[max]){
                max = left;
            }

            if(right < arr.length && arr[right] > arr[max]){
                max = right;
            }

            if(max != index){
                int temp = arr[max];
                arr[max] = arr[index];
                arr[index] = temp;
                heapify(arr, max);
            }

        }
    }
}
