/*
simple spiral
 */

import java.util.ArrayList;
public class a22spiral1 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        ArrayList<Integer> ans = new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int rowstrt=0, colstrt=0, rowend=m-1, colend=n-1;  // 4 pointers
        while(ans.size()<m*n){

            for(int i=colstrt; i<=colend; i++){
                ans.add(matrix[rowstrt][i]);
            }
            for(int i=rowstrt+1; i<=rowend; i++){
                ans.add(matrix[i][colend]);
            }
            if(rowstrt!=rowend){
                for(int i=colend-1; i>=colstrt; i--){
                    ans.add(matrix[rowend][i]);
                }
            }
            if(colstrt!=colend){
                for(int i=rowend-1; i>=rowstrt+1; i--){
                    ans.add(matrix[i][colstrt]);
                }
            }
            rowstrt++;
            colstrt++;
            rowend--;
            colend--;
        }
        System.out.println(ans);
    }
}
