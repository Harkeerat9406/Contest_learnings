/* SMALLEST ALL ONES-MULTIPLE 
You are given a positive integer k.

Find the smallest integer n divisible by k that consists of only the digit 1 in its decimal representation 
(e.g., 1, 11, 111, ...).

Return an integer denoting the number of digits in the decimal representation of n. If no such n exists, return -1.

Example: 
Input: k = 3
Output: 3
Explanation:
n = 111 because 111 is divisible by 3, but 1 and 11 are not. The length of n = 111 is 3.*/

package Leetcode;

public class LC_3790 {
    public int minAllOneMultiple(int k) {
        boolean visited[]= new boolean[k];
        int rem=0, length=1;

        for(int i=0; i<k; i++, length++)
        {
            rem= (rem*10+1)%k;
            if(rem==0)
            return length;

            if(visited[rem])
            return -1;

            visited[rem]= true;
        }
        return -1;
    }

    public static void main(String[] args) {
        LC_3790 ob= new LC_3790();
        System.out.println(ob.minAllOneMultiple(7));
    }
}

/*Hint: Do not construct every number, work with remainders 

INTUITION:
➡️ N % k = R
➡️ N = kq + R

For making number of only 1s
➡️ (N * 10 + 1) = (kq + R) * 10 + 1
➡️ 10kq * 10R +1

Now 10kq is always divisible by k so we only check for 10R + 1
➡️ (10R + 1) % k 

If any remainder repeats, it means that we are in a loop. So we keep a visited array for remainders already seen*/