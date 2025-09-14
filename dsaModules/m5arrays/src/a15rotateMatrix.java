/*
how to rotate a matrix array 90 degree (transpose and reverse array)
 */
import java.util.Scanner;
public class a15rotateMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

    }

    public static int[][] rotate(int[][] arr){
        // transpose
        int n=arr.length;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        // reverse
        for(int i=0; i<n; i++){
            int j=0;
            int k=n-1;
            while(j<k){
                int temp = arr[i][j];
                arr[i][j] = arr[i][k];
                arr[i][k] = temp;
                j++;
                k--;
            }
        }
        return arr;
    }
}

