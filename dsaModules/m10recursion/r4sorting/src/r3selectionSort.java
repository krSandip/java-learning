import java.util.Arrays;
public class r3selectionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        int i = arr.length;
        int j = 0;
        int maxIndex = 0;
        sort(arr, i, j, maxIndex);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int i, int j, int maxIndex){
        if(i==0){
            return;
        }
        if(j<i){
            if(arr[j]>arr[maxIndex]){
                sort(arr, i,j+1, j);
            }
            else{
                sort(arr, i, j+1, maxIndex);
            }
        }
        else{
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i-1];
            arr[i-1] = temp;
            sort(arr,i-1, 0, 0);
        }
    }
}
