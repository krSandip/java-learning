/*
        Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
        To flip an image horizontally means that each row of the image is reversed.
        For example, flipping [1,1,0] horizontally results in [0,1,1].
        To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
        For example, inverting [0,1,1] results in [1,0,0].
        */
import java.util.Arrays;

import java.util.Scanner;
public class a13flipingImage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] image = {{0,1},{1,0}};

        int n = image.length;

        int[][] ans = new int[n][n];
        for(int i=0; i<n; i++){
            int j=(n-1);
            for(int k=0; k<n; k++){
                // int j=(n-1);
                ans[i][k]=image[i][j];
                j--;
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(ans[i][j]==0){
                    ans[i][j]=1;
                }
                else if(ans[i][j]==1){
                    ans[i][j]=0;
                }
            }
        }
        for(int i=0; i<ans.length; i++){
            System.out.println(Arrays.toString(ans[i]));
        }

    }
}
