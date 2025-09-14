public class l3range {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,0};
        int target=5;
        int ans=range(nums,target);
        System.out.println(ans);
    }
    // search the target in index range from 3 to 6
    static int range(int[] arr, int k){
        if(arr.length==0){
            return -1;
        }

        for(int i=3; i<6; i++){
            if(arr[i]==k){
                return arr[i];
            }
        }
        return -1;
    }
}