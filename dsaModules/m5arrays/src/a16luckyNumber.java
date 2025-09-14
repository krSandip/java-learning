/*
Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

 # Method to trace the matrix to find a specified element
 */

import java.util.ArrayList;

public class a16luckyNumber {
    public static void main(String[] args) {
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};

        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<matrix.length; i++){
            int n = matrix[i][0];
            int x=0;
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j]<n){
                    n = matrix[i][j];
                    x=j;
                }
            }

            int m = n;
            for(int k=0; k<matrix.length; k++){
                if(matrix[k][x]>m){
                    m = matrix[k][x];
                }
            }
            if(m==n){
                ans.add(m);
            }
        }

        System.out.println(ans);
    }
}

