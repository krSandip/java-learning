import java.util.ArrayList;

public class b19binaryGap {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(binaryGap(n));
    }
    public static int binaryGap(int n){
        ArrayList<Integer> list = new ArrayList<>();
        while(n>0){
            list.add(n%2);
            n = n/2;
        }
        int onesPlace = list.size()-1;
        int maxDistance = 0;
        int i= list.size()-2;
        while(i>=0){
            int distance = 0;
            if(list.get(i) == 1){
                distance = onesPlace - i;
                if(maxDistance<distance){
                    maxDistance = distance;
                }
                onesPlace = i;
            }
            i--;
        }
        return maxDistance;
    }
}

