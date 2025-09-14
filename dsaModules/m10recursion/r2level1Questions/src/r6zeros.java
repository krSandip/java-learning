public class r6zeros {
    public static void main(String[] args) {
        int n = 20902;
        System.out.println(count(n));
    }
    static int c= 0;
    static int count(int n){
        return helper(n,c);
    }
    static int helper(int n, int c){
        if(n==0){
            return c;
        }
        int digit = n % 10;
        if(digit == 0){
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }
}
