import java.util.Arrays;

public class a23spiral3 {
    public static void main(String[] args) {

        int rows=1;
        int cols=4;
        int rStart=0;
        int cStart=0;

        int[][] ans = new int[rows*cols][2];
        int k=0;
        int left=cStart, top=rStart, right=cStart+1, bottom=rStart+1;

        while(true){
            // right going
            for(int i=left; i<=right; i++){
                if(i<cols && i>=0 && top>=0){
                    ans[k][0]=top;
                    ans[k][1]=i;
                    k++;
                }
            }
            left--;
            right++;

            if(k==ans.length){
                break;
            }

            // down going
            for(int i=top+1; i<=bottom; i++){
                if(i<rows && i>=0 && right-1<cols){
                    ans[k][0]=i;
                    ans[k][1]=right-1;
                    k++;
                }
            }
            top--;
            bottom++;

            if(k==ans.length){
                break;
            }

            // left going
            for(int i=right-2; i>=left; i--){
                if(i>=0 && i<cols && bottom-1<rows){
                    ans[k][0]=bottom-1;
                    ans[k][1]=i;
                    k++;
                }
            }

            if(k==ans.length){
                break;
            }

            // up going
            for(int i=bottom-2; i>top; i--){
                if(i>=0 && i<rows && left>=0){
                    ans[k][0]=i;
                    ans[k][1]=left;
                    k++;
                }
            }

            if(k==ans.length){
                break;
            }
        }
        for(int i=0; i<ans.length; i++){
            System.out.println(Arrays.toString(ans[i]));
        }

    }
}
