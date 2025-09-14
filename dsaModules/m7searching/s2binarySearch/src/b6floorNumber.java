public class b6floorNumber {
    public static void main(String[] args) {
        int[] nums={2,3,5,9,14,16,18};
        int target=11;
        int ans=floor(nums,target);
        System.out.println(ans);
    }

    static int floor(int[] arr, int k){
        int s=0;
        int e=arr.length;
        while(s<=e){
            int m=s+(e-s)/2;
            if(k==arr[m]){
                return arr[m];
            }
            if(k<arr[m]){
                e=m-1;
            }
            if(k>arr[m]){
                s=m+1;
            }
        }
        return arr[e];
    }
}

