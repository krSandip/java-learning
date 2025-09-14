import java.util.Scanner;
public class a6maxElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr1 = new int[6];
        System.out.println("enter the elements");
        for(int i=0; i<arr1.length; i++){
            arr1[i] = in.nextInt();
        }
        System.out.println("largest element = " +largest(arr1));
    }

    static int largest(int[] arr2){
        int max = arr2[0];
        for(int i=1; i<arr2.length; i++){
            if(arr2[i]>max){
                max=arr2[i];
            }
        }
        return max;
    }
}
