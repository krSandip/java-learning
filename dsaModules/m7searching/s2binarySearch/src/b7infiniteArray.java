public class b7infiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,12,13,14,17,19,23,40,56};
        int target = 15;
        System.out.println(findRange(arr,target));
    }

    static int findRange(int[] arr, int target){
        int s=0;
        int e=1;
        while(target>arr[e]){
            int temp = e+1;  // new start(s)
            e = e + (e-s+1)*2;
            s = temp;
        }
        return element(arr,target,s,e);
    }

    static int element(int[] arr, int target, int s, int e){
        while (s < e) {
            int m = s + (e-s) / 2;
            if(target<arr[m]){
                e=m-1;
            }
            if(target>arr[m]){
                s=m+1;
            }
            if(target==arr[m]){
                return m;
            }
        }
        return -1;
    }
}

