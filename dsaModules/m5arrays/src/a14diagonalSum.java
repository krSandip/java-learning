/*
Given a square matrix mat, return the sum of the matrix diagonals.
Only include the sum of all the elements on the primary diagonal and
all the elements on the secondary diagonal that are not part of the primary diagonal.
 */
import java.util.Scanner;
public class a14diagonalSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int n=mat.length;
        int sum = 0;
        int i = 0;
        int j = 0;
        int k = (n-1);
        while(i<n && j<n){
            sum = sum + mat[i][j];
            sum = sum + mat[i][k];
            if(i==k || j==k){
                sum = sum - mat[i][k];
            }
            i++;
            j++;
            k--;
        }

        System.out.println(sum);

    }
}

