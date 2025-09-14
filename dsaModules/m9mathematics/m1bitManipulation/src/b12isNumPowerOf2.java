public class b12isNumPowerOf2 {
    public static void main(String[] args) {
        int n = 5;
//        if((n & (n-1)) == 0){
//            System.out.println("true");
//        }
//        else{
//            System.out.println("false");
//        }
//
//        System.out.println(fxn(n));

       if(isPowerOfTwo(n)){
           System.out.println("yes");
       }
       else{
           System.out.println("no");
       }
    }

    static boolean fxn(int n){
        int count = 0;
        while(n>0){
            int bit = n%2;
            n = n >> 1;
            if(bit==1){
                count++;
            }else{
                continue;
            }
        }
        if(count==1){
            return true;
        }
        return false;
    }

    static boolean isPowerOfTwo(int n){
        if(n <= 0){
            return false;
        }
        return n % 2 == 0;
    }
}
