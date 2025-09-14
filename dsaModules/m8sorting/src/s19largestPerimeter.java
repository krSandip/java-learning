// https://leetcode.com/problems/largest-perimeter-triangle/
import java.util.Arrays;
public class s19largestPerimeter {
    public static void main(String[] args) {
        int[] nums ={1,2,1,10};
        System.out.println(largestPerimeter(nums));
    }
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=n-1; i>=2; i--){
            if(nums[i]+nums[i-1]>nums[i-2] && nums[i]+nums[i-2]>nums[i-1] && nums[i-1]+nums[i-2]>nums[i]){
                return nums[i]+nums[i-1]+nums[i-2];
            }
        }
        return 0;
    }
}

