import java.util.Arrays;

// https://leetcode.com/problems/relative-sort-array/
public class s23relativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int i = 0;
        int k = 0;
        while(i<arr2.length){
            for(int j=k; j<arr1.length; j++){
                if(arr1[j]==arr2[i]){
                    swap(arr1, k, j);
                    k++;
                }
            }
            i++;
        }
        int[] arr = new int[arr1.length-k];
        int l=0;
        for(int n=k; n<arr1.length; n++){
            arr[l] = arr1[n];
            l++;
        }
        Arrays.sort(arr);
        int m=0;
        for(int n=k; n<arr1.length; n++){
            arr1[n] = arr[m];
            m++;
        }
        return arr1;
    }

    static void swap(int[] arr1, int k, int j){
        int temp = arr1[k];
        arr1[k] = arr1[j];
        arr1[j] = temp;
    }
}
