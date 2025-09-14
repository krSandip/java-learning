import java.util.ArrayList;

public class r3returnArrayList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,8};
        int target = 4;
        int i = 0;
        System.out.println(findAllIndex(arr,target,i));
    }
    static ArrayList findAllIndex(int[] arr, int t, int i){
        ArrayList<Integer> list = new ArrayList<>();
        if(i==arr.length){
            return list;
        }
        if(arr[i] == t){
            list.add(i);
        }
        ArrayList<Integer> ansFromBelowList = findAllIndex(arr,t,i+1);
        list.addAll(ansFromBelowList);
        return list;
    }
}

