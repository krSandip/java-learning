import java.util.Arrays;

public class s1bubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble(int[] arr){
        boolean swapped;    // this is used if the array become sorted then we do not need to run the program
        // run the loop n-1 times
        for(int i=0; i<arr.length; i++){
            swapped =false;
            // for each step, max element will come in last
            for(int j=1; j<arr.length-i; j++){
                // swap if item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    }
}

