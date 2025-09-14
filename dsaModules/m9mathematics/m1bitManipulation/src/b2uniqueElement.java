public class b2uniqueElement {
    public static void main(String[] args) {
        int[] arr = {1,2,40,72,0,2,72,0,1,9,40};
        System.out.println(unique(arr));
    }
    static int unique(int[] arr){
        int x = arr[0];
        for(int i=1; i<arr.length; i++){
            x = x ^ arr[i];
        }
        return x;
    }
}
