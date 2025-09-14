import java.util.Arrays;

public class r2bubbleSort {
    public static void main(String[] args) {
        int[] nums = {4,3,2,8,1};

        int r = nums.length;
        int c = 0;
        System.out.println(Arrays.toString(sort(nums, r, c)));
    }
    static int[] sort(int[] arr, int r, int c){
        if(r==1){
            return arr;
        }
        if(c<r-1){
            if(arr[c]>arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            return sort(arr, r,c+1);
        }
        else{
            return sort(arr,r-1, 0);
        }
    }
}
