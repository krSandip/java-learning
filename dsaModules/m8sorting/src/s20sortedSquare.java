// https://leetcode.com/problems/squares-of-a-sorted-array/
import java.util.Arrays;
public class s20sortedSquare {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquare(nums)));
    }

    public static int[] sortedSquare(int[] nums){
        /*  brute force approach
        for(int i=0; i<nums.length; i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
        */
        int[] arr = new int[nums.length];
        int i=nums.length-1;
        int j=0;
        int k=nums.length-1;
        while(k>=0){
            if(Math.abs(nums[i])<Math.abs(nums[j])){
                arr[k]=nums[j]*nums[j];
                j++;
            }
            else{
                arr[k]=nums[i]*nums[i];
                i--;
            }
            k--;
        }
        return arr;
    }
}
