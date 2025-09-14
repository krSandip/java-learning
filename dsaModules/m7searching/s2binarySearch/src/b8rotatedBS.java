public class b8rotatedBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,9,0,1,2};
        int target = 5;
        int pivot=findPivot(arr);
        System.out.println(pivot);
        int ans1=search(arr,target,0,pivot);
        int ans2=search(arr,target,pivot+1,arr.length-1);
        if(ans1==-1){
            System.out.println(ans2);
        }
        else{
            System.out.println(ans1);
        }
    }

    static int findPivot(int[] arr){
        int s=0;
        int e=arr.length;
        while(s<=e){
            int m=s+(e-s)/2;
            if(m<e && arr[m]>arr[m+1]){
                return m;
            }
            if(m>s && arr[m]<arr[m-1]){
                return m-1;
            }
            if(arr[m]<arr[s]){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        return -1;
    }

    static int search(int[] arr, int target, int s, int e){
        while(s<=e){
            int m=s+(e-s)/2;
            if(target<arr[m]){
                e=m-1;
            }
            else if(target>arr[m]){
                s=m+1;
            }
            else{
                return m;
            }
        }
        return -1;
    }
}

