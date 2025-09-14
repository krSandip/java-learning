import java.util.ArrayList;

public class s6duplicateElements {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        System.out.println(subsetDuplicate(nums));
    }
    static ArrayList<ArrayList<Integer>> subsetDuplicate(int[] arr){
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int s = 0;
        int e = 0;

        for(int i=0; i<arr.length; i++){
            s = 0;
            if(i>0 && arr[i] == arr[i-1]){
                s = e+1;
            }
            e = outer.size()-1;
            int n = outer.size();
            for(int j=s; j<n; j++){
                ArrayList<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}

