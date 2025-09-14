/*
        Method to reshape the matrix
        */

import java.util.Arrays;
public class a17reshapeMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int r=1;
        int c=4;

        int[][] newmat = new int[r][c];
        int k=0;
        int l=0;
        if((mat.length*mat[0].length)==r*c){
            for(int i=0; i<mat.length; i++){
                for(int j=0; j<mat[i].length; j++){
                    newmat[k][l] = mat[i][j];
                    l++;
                    if(l==c){
                        l=0;
                        k++;
                    }
                }
            }
            System.out.println(Arrays.toString(newmat));
        }
        else{
            System.out.println(Arrays.toString(mat));
        }
    }
}

