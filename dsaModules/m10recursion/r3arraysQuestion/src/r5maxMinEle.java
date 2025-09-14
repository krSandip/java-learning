public class r5maxMinEle {
    public static void main(String[] args){
        int[] nums = {4,8,12,9,7};
        System.out.println(fxnMin(nums, 1, nums[0]));
        System.out.println(fxnMax(nums, 1, nums[0]));
    }

    static int fxnMin(int[] arr, int idx, int min){
        if(idx>arr.length-1){
            return min;
        }
        if(arr[idx] < min){
            return fxnMin(arr, idx+1, arr[idx]);
        }else{
            return fxnMin(arr, idx+1, min);
        }
    }

    static int fxnMax(int[] arr, int idx, int max){
        if(idx>arr.length-1){
            return max;
        }
        if(arr[idx] > max){
            return fxnMax(arr, idx+1, arr[idx]);
        }else{
            return fxnMax(arr, idx+1, max);
        }
    }
}
