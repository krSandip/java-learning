public class b13calculatePower {
    public static void main(String[] args) {
        int n = 3;
        int p = 4;
        System.out.println(exponential(n, p));
    }
    static int exponential(int n, int p){
        int ans = 1;
        while(p>0){
            if((p & 1) == 1){
                ans = ans * n;
            }
            n = n * n;
            p = p >> 1;
        }
        return ans;
    }
}
