public class b2orderAgnostic {
    public static void main(String[] args) {
        //int[] nums = {2,4,5,6,6,6,12,14,17,18,20,21,23,26,30};  // ascending array
        int[] nums = {60,49,23,14,9,8,5,3,0};  // descending array
        int target = 5; //23;
        System.out.println(orderAgnosticBS(nums,target));
    }

    // returning the index at which the target is found
    static int orderAgnosticBS(int[] arr, int k){
        boolean isAscending=arr[0]<arr[arr.length-1];   // to check ascending or descending order
        int s=0;
        int e=arr.length;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]==k){
                return m;
            }
            if(isAscending){   // if ascending then this will execute
                if(k<arr[m]){
                    e=m-1;
                }
                else{
                    s=m+1;
                }
            }
            else{              // if descending then this will execute
                if(k>arr[m]){
                    e=m-1;
                }
                else{
                    s=m+1;
                }
            }
        }
        return -1;
    }
}
