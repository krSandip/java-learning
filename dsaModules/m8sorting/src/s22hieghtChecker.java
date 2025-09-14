import java.util.Arrays;
// https://leetcode.com/problems/height-checker/
public class s22hieghtChecker {
    public static void main(String[] args) {
        int[] nums = {1,1,4,2,1,3};
        System.out.println(heightChecker(nums));
    }
    public static int heightChecker(int[] heights) {
        int count=0;
        int[] arr = new int[heights.length];
        for(int i=0; i<heights.length; i++){
            arr[i]=heights[i];
        }
        Arrays.sort(heights);
        for(int i=0; i<heights.length; i++){
            if(arr[i] != heights[i]){
                count++;
            }
        }
        return count;
    }
}

