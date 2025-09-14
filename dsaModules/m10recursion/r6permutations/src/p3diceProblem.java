import java.util.ArrayList;
import java.util.List;

public class p3diceProblem {
    public static void main(String[] args) {
        // how many possible combinations can be made to get a 4 from a dice
        int target = 4;
        System.out.println(dice(new ArrayList<>(), target));
    }
    static List<List<Integer>> dice( List<Integer> combination, int target){
        if(target==0){
            List<List<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>(combination));
            return list;
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1; i<=6 && i<=target; i++){
            combination.add(i);
            ans.addAll(dice(combination, target-i));
            combination.remove(combination.size()-1); // backtrack
        }
        return ans;
    }
}
