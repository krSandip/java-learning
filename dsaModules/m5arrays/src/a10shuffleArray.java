// how to shuffle the array
// {x1,x2,x3,x4,x5,y1,y2,y3,y4,y5} is converted into {x1,y1,x2,y2,x3,y3,x4,y4,x5,y5}
import java.util.Arrays;

public class a10shuffleArray {
    public static void main(String[] args) {
        int[] nums = {2,3,5,8,1,6,7,9,0,4};
        int n = 5;

        int[] ans = new int[2 * n];
        int x = 0;
        for (int i = 0; i<n; i++) {
            ans[x] = nums[i];
            ans[x + 1] = nums[i + n];  // concatenation used
            x = x + 2;
        }

        System.out.println(Arrays.toString(ans));

    }
}

