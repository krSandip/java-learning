public class r4rotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        int target = 7;
        int s = 0;
        int e = arr.length-1;
        System.out.println(findIndex(arr,target,s,e));
    }
    static int findIndex(int[] arr, int t,int s, int e){
        if(s > e){
            return -1;
        }
        int m = s + (e - s) / 2;
        if(arr[m] == t){
            return m;
        }
        if(arr[s] <= arr[m]){
            if(arr[s] <= t && t <= arr[m]){
                return findIndex(arr,t,s,m-1);
            }
            else{
                return findIndex(arr,t,m+1,e);
            }
        }
        if(arr[m]<=t && t <= arr[e]){
            return findIndex(arr,t,m+1,e);
        }
        return findIndex(arr,t,s,m-1);
    }
}

