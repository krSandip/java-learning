public class r5binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,8,12,15,20};
        int target = 15;
        int ans = search(arr,target,0,arr.length-1);
        System.out.println(ans);
    }
    static int search(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m = s+ (e-s)/2;
        if(arr[m]==target){
            return m;
        }
        else if(arr[m]<target){
            return search(arr, target, m+1, e);
        }
        return search(arr, target, s, m-1);
    }
}
