// https://leetcode.com/problems/majority-element/

public class s12majorityElement {
    public static void main(String[] args) {
        int[] nums = {2,3,3,3,2,2,2};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        int element = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(count == 0){
                element = nums[i];
            }

            if(element == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return element;
    }
}

