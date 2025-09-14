public class b18primeNumOfSetBits {
    public static void main(String[] args) {
        int left = 6;
        int right = 10;
        System.out.println(countPrimeSetBits(left, right));
    }
    public static int countPrimeSetBits(int left, int right) {
        int ans =0;
        for(int i=left; i<=right; i++){
            int count =0;
            int num = i;
            while(num>0){
                if(num%2==1){
                    count++;
                }
                num = num/2;
            }
            if(isPrime(count)){
                ans++;
            }
        }
        return ans;
    }
    static boolean isPrime(int num){
        if(num==1 || num==0){
            return false;
        }
        else{
            int i =2;
            while(i*i<=num){
                if(num%i == 0){
                    return false;
                }
                i++;
            }
        }
        return true;
    }
}
