public class m8setBit {
    public static void main(String[] args) {
        int n = 4;

        System.out.println(hammingWeight(n));
    }
    public static int hammingWeight(int n) {
        String ans = "";
        while(n>1){
            ans = ans + n%2;
            n = n/2;
        }
        ans = ans + 1;
        int i=0;
        int count =0;
        while(i<ans.length()){
            if(ans.charAt(i)=='1'){
                count++;
            }
            i++;
        }
        return count;
    }
}
