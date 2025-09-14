import java.util.Arrays;

public class s2selectionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3,0,7};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, last, maxIndex);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i=start+1; i<=end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr,int last, int maxIndex){
        int temp = arr[last];
        arr[last] = arr[maxIndex];
        arr[maxIndex] = temp;
    }
}

