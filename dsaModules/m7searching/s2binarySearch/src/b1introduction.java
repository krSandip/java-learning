public class b1introduction {
    public static void main(String[] args) {
        int[] nums={2,3,4,5,6,7,9,12,23,52};
        int target=23;
        int ans=binarySearch(nums,target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int k){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(k<arr[m]){
                e=m-1;
            }
            else if(k>arr[m]){
                s=m+1;
            }
            else{
                return m;
            }
        }
        return -1;
    }
}

