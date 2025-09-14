import java.util.Arrays;
// https://leetcode.com/problems/sort-array-by-parity-ii/
public class s18sortArrByParity2 {
    public static void main(String[] args) {
        // give input
        int[] nums = {4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }
    public static int[] sortArrayByParityII(int[] nums) {
        int[] arr = new int[nums.length];
        int j=0;
        int k=1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                arr[j]=nums[i];
                j = j+2;
            }
            else{
                arr[k]=nums[i];
                k = k+2;
            }
        }
        return arr;
    }
}

