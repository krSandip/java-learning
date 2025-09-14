import java.util.Arrays;

public class b4sortedMatrix {
    public static void main(String[] args) {
        int[][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target=4;
        System.out.println(Arrays.toString(search(matrix,target)));
    }

    static int[] BS(int[][] arr, int target, int r, int cStart, int cEnd){
        while(cStart<=cEnd){
            int m=cStart+(cEnd-cStart)/2;
            if(arr[r][m]==target){
                return new int[]{r,m};
            }
            if(arr[r][m]<target){
                cStart=m+1;
            }
            if(arr[r][m]>target){
                cEnd=m-1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] search(int[][] matrix, int target){
        int rows=matrix.length;
        int cols=matrix[0].length;
        if(rows==1){
            return BS(matrix,target,0,0,cols-1);
        }

        int rStart=0;
        int rEnd=rows-1;
        int cMid=cols/2;

        while(rStart<(rEnd-1)){
            int mid=rStart+(rEnd-rStart)/2;
            if(matrix[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid]<target){
                rStart=mid;
            }
            else{
                rEnd=mid;
            }
        }

        // now we have two rows remaining
        if(matrix[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};
        }

        // now 4 cases
        if(target<=matrix[rStart][cMid-1]){
            return BS(matrix,target,rStart,0,cMid-1);
        }

        if(target>=matrix[rStart][cMid+1] && target<=matrix[rStart][cols-1]){
            return BS(matrix,target, rStart,cMid+1,cols-1);
        }

        if(target<=matrix[rStart+1][cMid-1]){
            return BS(matrix,target,rStart+1,0,cMid-1);
        }
        else{
            return BS(matrix,target,rStart+1,cMid+1,cols-1);
        }
    }
}

