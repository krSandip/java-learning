import java.util.Arrays;

public class s25rankTransformOfArray {
    public static void main(String[] args) {
        int[] arr = {37,12,28,9,100,56,80,5,12};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
    static int[] arrayRankTransform(int[] arr) {
        int[] originalArr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            originalArr[i] = arr[i];
        }
        Arrays.sort(arr);
        int rank = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]==arr[i-1]){
                i++;
            }

            for(int j=0; j<arr.length; j++){
                if(arr[i-1]==originalArr[j]){
                    originalArr[j] = rank;
                }

            }
            rank++;
            if(i==arr.length-1){
                for(int k=0; k<arr.length; k++){
                    if(arr[i] == originalArr[k]){
                        originalArr[k]=rank;
                    }
                }
            }
        }
        return originalArr;
    }


}

