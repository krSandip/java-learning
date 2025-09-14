// https://leetcode.com/problems/third-maximum-number/
import java.util.Arrays;
public class s14thirdMax {
    public static void main(String[] args) {
        int[] nums = {2,2,3,1};
        System.out.println(thirdMax(nums));
    }
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for(int i=nums.length-1; i>=1; i--){
            if(nums[i-1] == nums[i]){
                continue;
            }
            else{
                count++;
            }
            if(count == 2){
                return nums[i-1];
            }
        }
        return nums[nums.length-1];
    }
}
