import java.util.ArrayList;

public class m5factors {
    public static void main(String[] args) {
        int n =20;
        factors1(n);
    }
    // optimised solution
    static void factors1(int n){
        ArrayList<Integer> list =  new ArrayList<>();
        int i=1;
        while(i*i <=n){
            if(n%i==0){
                System.out.print(i +" ");
                list.add(n/i);
            }
            i++;
        }
        int m = list.size()-1;
        for(int j=m; j>=0; j--){
            System.out.print(list.get(j) +" ");
        }
    }
}
