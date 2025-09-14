public class b10magicNum {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(getMagicNumber(n));
    }
    static int getMagicNumber(int n){
        int ans = 0;
        int multiplier = 5;
        int i=1;
        while(n>0){
            int bit = n & 1;
            ans = ans + bit*multiplier;
            multiplier *=5;
            n = n >> 1;
        }
        return ans;
    }
}