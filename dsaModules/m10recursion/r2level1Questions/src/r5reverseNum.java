public class r5reverseNum {
    public static void main(String[] args) {
        int n = 1824;
        reverse(n);
        System.out.println(sum);
        //System.out.println(reverse2(n));
    }
    static int sum = 0;
    static void reverse(int n){
        if(n==0) {
            return;
        }
        sum = sum * 10 + (n%10);
        reverse(n/10);
    }
    /*
    static int reverse2(int n){
        int digits = (int)Math.log10(n) + 1;
        return helper(n, digits);
    }
    static int helper(int n,int digits){
        if(n%10==n){
            return n;
        }
        return (n%10) * (int)Math.pow(10,digits-1) + helper(n/10,digits-1);
    }

     */
}
