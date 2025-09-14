public class b3matrixBS {
    public static void main(String[] args) {
        int[][] arr={{10,20,30},{15,25,35},{28,29,37},{33,34,38}};
        int target=29;
        int j=arr[0].length-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i][j]==target){
                // return the indices of row and column of that element
                System.out.println(i+ " " +j);
            }
            if(arr[i][j]>target){
                j--;   // skip the whole column
            }
            if(arr[i][j]<target){
                i++;  // skip the whole the row
            }
        }
    }
}

