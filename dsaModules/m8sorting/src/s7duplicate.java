// https://leetcode.com/problems/find-the-duplicate-number/
public class s7duplicate {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        int ans = findDuplicate(nums);
        System.out.println(ans);
    }
    public static int findDuplicate(int[] nums) {
        cyclic(nums);
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != i+1){
                ans = nums[i];
            }
        }
        return ans;
    }

    static void cyclic(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

