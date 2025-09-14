import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class b20sortIntByNumOfOneBits {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(sortByBits(arr)));
    }
    public static int[] sortByBits(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);
        }

        // sort the list based on bit counts
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int countA = onesCount(a);
                int countB = onesCount(b);

                // If bit counts are equal, sort by numerical value
                if (countA == countB) {
                    return a - b;
                }
                // Otherwise, sort by bit counts
                return countA - countB;
            }
        });

        int[] result = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }
    static int onesCount(int num){
        int count =0;
        while(num>0){
            if(num%2==1){
                count++;
            }
            num = num/2;
        }
        return count;
    }
}

