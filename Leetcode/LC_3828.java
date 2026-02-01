// https://leetcode.com/problems/find-closest-number-to-zero

package Leetcode;
class Solution {
    public int finalElement(int[] nums) {
        if(nums.length==1)
            return nums[0];

        return Math.max(nums[0], nums[nums.length-1]);
    }
}
public class LC_3828 {
    public static void main(String[] args) {
        Solution ob= new Solution();
        int ans= ob.finalElement(new int[]{1,6,3,5,4,2});
        System.out.println(ans);
    }
}


/*
Array length = m
Alice is allowed to remove m − 1 elements

That means Alice can:

Leave exactly one element and end the game immediately
Because removal must be contiguous, Alice has only two possible ways to remove m − 1 elements:
Case 1: Keep the first element
Case 2: Keep the last element

On move 1, Alice can force the game to end with either:
nums[0] or nums[m−1]

No matter what Bob wants.
So Alice’s guaranteed outcome set is:
max { nums[0], nums[m-1] }
*/