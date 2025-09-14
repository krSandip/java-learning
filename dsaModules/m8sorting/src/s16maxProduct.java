// https://leetcode.com/problems/maximum-product-of-three-numbers/
public class s16maxProduct {
    public static void main(String[] args) {
        // give input
        int[] nums = {1,2,3,4};
        System.out.println(maximumProduct(nums));
    }
    public static int maximumProduct(int[] nums) {
        /*
        Arrays.sort(nums);
        int max1 = nums[0]*nums[1]*nums[nums.length-1];
        int n =nums.length;
        int max2 = nums[n-1]*nums[n-2]*nums[n-3];
        return Math.max(max1, max2);
        */
        int min1, min2, max1, max2, max3;
        min1 = min2 = Integer.MAX_VALUE;
        max1 = max2 = max3 = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(max1<nums[i]){
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            }
            else if(max2<nums[i]){
                max3 = max2;
                max2 = nums[i];
            }
            else if(max3<nums[i]){
                max3 = nums[i];
            }

            if(min1 > nums[i]){
                min2 = min1;
                min1 = nums[i];
            }
            else if(min2 > nums[i]){
                min2 = nums[i];
            }
        }
        return Math.max(max1*max2*max3, min1*min2*max1);
    }
}

