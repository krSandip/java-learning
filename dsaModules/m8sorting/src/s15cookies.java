// https://leetcode.com/problems/assign-cookies/
import java.util.Arrays;
public class s15cookies {
    public static void main(String[] args) {
        // give input
        int[] g = {1,2,3};
        int[] s ={1,1};
        System.out.println(findContentChildren(g,s));
    }
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count =0;
        int i=0;
        int j=0;
        while(i< g.length && j<s.length){
            if(s[j] >= g[i]){
                count++;
                i++;
            }
            j++;
        }
        return count;
    }
}

