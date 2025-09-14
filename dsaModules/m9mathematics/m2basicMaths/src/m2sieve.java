public class m2sieve {
    public static void main(String[] args) {
        // print all the prime numbers from 1 to 40
        int n = 40;
        boolean[] arr = new boolean[n+1];
        isPrime(n, arr);
    }
    static void isPrime(int n, boolean[] arr){
        int i =2;
        while(i*i<=n){
            if(arr[i]==false){
                for(int j=i*2; j<=n; j+=i){
                    arr[j]=true;
                }
            }
            i++;
        }
        for(int k=2; k<=n; k++){
            if(arr[k]==false){
                System.out.print(k + " ");
            }
        }
    }
}

