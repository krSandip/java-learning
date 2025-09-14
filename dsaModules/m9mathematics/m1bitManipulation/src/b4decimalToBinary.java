public class b4decimalToBinary {
    public static void main(String[] args) {
        int n = 32;
        // decToBin1(n);
        decToBin2(n);
    }
    // using Arrays
    static void decToBin1(int n){
        int[] binaryNum = new int[1000];
        int i = 0;
        while(n>0){
            binaryNum[i] = n % 2;
            n = n/2;
            i++;
        }
        for(int j=i; j>=0; j--){
            System.out.println(binaryNum[j]);
        }
    }
    // using bit-wise operators
    static void decToBin2(int n){
        // size of number is assumed to be 8 bits
        for(int i=7; i>=0; i--){
            int bit = n >> i;
            if((bit & 1) > 0){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }
    }
}

