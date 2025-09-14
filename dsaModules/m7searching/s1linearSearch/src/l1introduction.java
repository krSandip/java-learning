public class l1introduction {
    public static void main(String[] args) {
        int[] nums= {2,4,5,6,1,10};
        int target=5;
        int ans1=search1(nums,target);
        System.out.println(ans1);
        int ans2=search2(nums,target);
        System.out.println(ans2);

    }

    // return the index if target found otherwise return -1
    static int search1(int[] arr, int k){
        if(arr.length==0){
            return -1;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }

    // return the element if target found otherwise return -1
    static int search2(int[] arr, int k){
        if(arr.length==0){
            return -1;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i]==k){
                return arr[i];
            }
        }
        return -1;
    }
}

