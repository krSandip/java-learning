public class b9uniqueNumber {
    public static void main(String[] args) {
        int[] arr = {2,2,3,2,3,3,8,7,8,8};
        int ans = uniqueNumber(arr);
        System.out.println(ans);
    }
    static int uniqueNumber(int[] arr){
        int[] ans = new int[8];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<8; j++){
                if((arr[i] & (1<<j)) != 0){
                    ans[j]++;
                }
            }
        }
        int result = 0;
        for(int i=0; i<ans.length; i++){
            if(ans[i] % 3 != 0){
                result = result | (1<<i);
            }
        }
        return result;
    }
}
