import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/minimum-absolute-difference/
public class s24minAbsDifference {
    public static void main(String[] args) {
        int[] nums = {1,3,6,10,15};
        System.out.println(minimumAbsDifference(nums));
    }
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<List<Integer>>(2);
        Arrays.sort(arr);
        int minDifference = Integer.MAX_VALUE;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1]-arr[i]<minDifference){
                minDifference = arr[i+1]-arr[i];
            }
        }
        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1]-arr[i] == minDifference){
                list.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }
        return list;
    }
}

