// https://leetcode.com/problems/contains-duplicate/
import java.util.Arrays;
public class s13containsDuplicate {
    public static void main(String[] args) {
        // give input
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
    }
}
