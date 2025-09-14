public class b15xorNumbers {
    public static void main(String[] args) {
        // find XOR of no.s from 0 to n
        int n = 2;
        System.out.println(result1(n));
        System.out.println(result2(n));
    }
    // brute force approach
    static int result1(int n){
        int ans = 0;
        for(int i=1; i<=n; i++){
            ans = ans ^ i;
        }
        return ans;
    }
    // optimised solution
    static int result2(int n){
        if(n%4 == 0){
            return n;
        }
        else if(n%4 == 1){
            return 1;
        }
        else if(n%4 == 2){
            return n+1;
        }
        else{
            return 0;
        }
    }
}

