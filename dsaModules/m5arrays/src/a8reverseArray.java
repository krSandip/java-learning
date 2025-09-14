import java.util.Arrays;
import java.util.Scanner;
public class a8reverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr1 = new int[5];
        System.out.print("enter elements : ");
        for(int i=0; i<arr1.length; i++){
            arr1[i]=in.nextInt();
        }

        reverse(arr1);
        System.out.println(Arrays.toString(arr1));

    }

    static void reverse(int[] arr3){
        int start=0;
        int end=arr3.length - 1;
        while(start<end){
            swap( arr3, start, end);
            start++;
            end--;
        }

    }

    static void swap(int[] arr2, int idx1, int idx2){
        int temp = arr2[idx1];
        arr2[idx1]=arr2[idx2];
        arr2[idx2]=temp;
    }

}

