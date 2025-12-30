/* MAXIMUM SUM OF THREE NUMBERS DIVISIBLE BY 3
You are given an integer array nums.

Your task is to choose exactly three integers from nums such that their sum is divisible by three.

Return the maximum possible sum of such a triplet. If no such triplet exists, return 0. */

package Leetcode;

import java.util.*;

public class LC_3780 {
    public int maximumSum(int[] nums) {
        List<Integer> r0= new ArrayList<>();
        List<Integer> r1= new ArrayList<>();
        List<Integer> r2= new ArrayList<>();

        for(int i: nums)
        {
            if(i%3 == 0) r0.add(i);
            
            else if(i%3 == 1) r1.add(i);

            else r2.add(i);
        }

        Collections.sort(r0, Collections.reverseOrder());
        Collections.sort(r1, Collections.reverseOrder());
        Collections.sort(r2, Collections.reverseOrder());

        int sum= 0;

        // All 3 numbers are with rem 0
        if(r0.size() >= 3)
        sum= Math.max(sum, r0.get(0) + r0.get(1) + r0.get(2));

        // All 3 numbers are with rem 1
        if(r1.size() >= 3)
        sum= Math.max(sum, r1.get(0) + r1.get(1) + r1.get(2));

        // All 3 numbers are with rem 2
        if(r2.size() >= 3)
        sum= Math.max(sum, r2.get(0) + r2.get(1) + r2.get(2));

        // One number from each rem0, rem1, rem2
        if(r0.size()>=1 && r1.size()>=1 && r2.size()>=1)
        sum= Math.max(sum, r0.get(0) + r1.get(0) + r2.get(0));

        return sum;
    }

    public static void main(String[] args) {
        LC_3780 obj= new LC_3780();
        System.out.println(obj.maximumSum(new int[]{4,2,3,1}));
    }
}

/* INTUITION:
Any number when divided by 3 can only have remainder -> 0, 1, 2
So we make 3 arrays having numbers with each remainder
Then we sort each of the arrays to get the biggest number at the from from where we start searching.

Now there can only be 4 combinations of remainders where the total sum of three numbers will be divisible
by 3. The sum of remainders of three numbers should be divisible by 3.
(0,0,0)   or   (1,1,1)    or    (2,2,2)   or    (0,1,2)

After making arrays of all three types of remainders we get the first three numbers which are also largest
from each array and then the largest from each array for the 4th case. Whatever sum is the largest is also
our answer*/