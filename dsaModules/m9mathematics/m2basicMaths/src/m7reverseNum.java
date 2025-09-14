public class m7reverseNum {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(reverseBits(n));
    }
    public static int reverseBits(int n) {
        String str = Integer.toBinaryString(n);
        String ans = "";
        char[] arr = str.toCharArray();
        //System.out.println(Arrays.toString(arr));

        for(int i=str.length()-1; i>=0; i--){
            ans = ans + arr[i];
        }
        if(str.length()<32){
            for(int i=0; i<32-str.length(); i++){
                ans = ans + '0';
            }
        }
        long x = Long.parseLong(ans,2);
        return (int)x;
    }
}
