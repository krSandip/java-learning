import java.util.ArrayList;

public class m9complement {
    public static void main(String[] args) {
        int n = 5;

        System.out.println(findComplement(n));
    }
    public static int findComplement(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        while(num>0){
            list.add(num%2 ^ 1);
            num = num/2;
        }
        list.add(0);
        int ans = 0;
        for(int i=0; i<list.size(); i++){
            ans = ans + list.get(i) * (int)Math.pow(2,i);
        }
        return ans;
    }
}

