import java.util.ArrayList;

public class r2linearSearch {
    public static void main(String[] args) {
        int[] arr = {3,2,1,0,9,1};
        int target = 1;
        int i = 0;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(search(arr, target, i));
        System.out.println(searchIndex(arr, target,i));
        System.out.println(findAllIndex(arr,target,i,list));
    }
    static boolean search(int[] arr, int target, int i){
        if(i==arr.length-1 && arr[i]!=target){
            return false;
        }
        if(arr[i] == target || search(arr, target, i+1)){
            return true;
        }
        return false;
    }
    static int searchIndex(int[] arr, int target, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i] == target ){
            return i;
        }
        return searchIndex(arr, target,i+1);
    }
    static ArrayList findAllIndex(int[] arr, int target, int i,ArrayList<Integer> list){
        if(i==arr.length){
            return list;
        }
        if(arr[i] == target ){
            list.add(i);
        }
        return findAllIndex(arr, target,i+1,list);
    }
}
