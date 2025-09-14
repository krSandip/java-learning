import java.util.Arrays;
import java.util.Scanner;
public class a7swapElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr1 = new int[5];
        for(int i=0; i<arr1.length; i++){
            arr1[i] = in.nextInt();
        }
        System.out.println("enter the two index whose elements is to be swap");
        int x1 = in.nextInt();
        int x2 = in.nextInt();

        swap(arr1,x1,x2);
        System.out.println(Arrays.toString(arr1));
    }

    static void swap(int[] arr2, int idx1, int idx2){
        int temp = arr2[idx1];
        arr2[idx1] = arr2[idx2];
        arr2[idx2] = temp;
    }
}

