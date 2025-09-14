import java.util.ArrayList;

public class s5iterativeMethod {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        ArrayList<ArrayList<Integer>> ans = subset(nums);
        System.out.println(ans);
    }
    static ArrayList<ArrayList<Integer>> subset(int[] arr){
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int nums : arr){
            int n = outer.size();
            for(int j=0; j<n; j++){
                ArrayList<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(nums);
                outer.add(internal);
            }
        }
        return outer;
    }
}
