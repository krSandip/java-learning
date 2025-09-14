/*
You are given an integer array nums. You are initially positioned at the array's first index,
and each element in the array represents your maximum jump length at that position.
Return true if you can reach the last index, or false otherwise.

Jumping Game problem
 */

public class a20jumpGame {
    public static void main(String[] args) {

        int[] nums = {2,3,1,1,4};
        int k=nums.length-1;
        for(int i=nums.length-2; i>=0; i--){
            if(i+nums[i]>=k){
                k=i;
            }
        }
        if(k==0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}

