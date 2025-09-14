import java.util.Arrays;
import  java.util.Scanner;
public class a3twoDarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
            //2D array - like a matrix
            //Syntax :
            int[][] arr = new int[3][3];

           // Example :

            int[][] arr = {
                  {1, 2, 3},     // object at 0th index of arr
                  {4, 5},        // object at 1st index of arr
                  {6, 7, 8, 9}   // object at 2nd index of arr
            };
         */
        // Input :
        int[][] arr = new int[3][3];
        System.out.println(arr.length);  // output = 3 (no. of rows)
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        // output_1
        for (int row = 0; row< arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        // output_2
        for(int i=0; i<arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
