import java.util.Arrays;

public class l4searchInTwoDarr {
    public static void main(String[] args) {
        int[][] arr1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9,0}
        };
        int target = 4;
        int[] ans = search(arr1,target);
        System.out.println(Arrays.toString(ans));
    }

    // return the indices at which the target is found
    static int[] search(int[][] arr2, int k){
        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<arr2[i].length; j++){
                if(arr2[i][j]==k){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

