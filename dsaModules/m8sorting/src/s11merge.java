// https://leetcode.com/problems/merge-sorted-array/

import java.util.Arrays;

public class s11merge {
    public static void main(String[] args) {
        // give inputs here
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        System.out.println(Arrays.toString(merge(nums1,m,nums2,n)));
    }
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        /*
        for(int i=0, j=m; i<n; i++){
            nums1[j] = nums2[i];
            j++;
        }
        Arrays.sort(nums1);
        */
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                k--;
                i--;
            }
            else{
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
        return nums1;
    }
}

