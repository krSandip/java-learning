// concept is to trash the elements in array which are in some logic between any two indices
// # finding a sub-array

public class a19maxSubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,-4,6,3};
        int ans = maxSubArray(arr);
        System.out.println(ans);
    }
    public static int maxSubArray(int[] nums) {
        int sum=0;
        int max=0;
        for(int i=0; i<nums.length; i++){
            sum=sum+nums[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }

        }
        return max;
    }
}
