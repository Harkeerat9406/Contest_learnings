/*Minimum Number of Operations to Have Distinct Elements 
You are given an integer array nums.

In one operation, you remove the first three elements of the current array. If there are fewer than three 
elements remaining, all remaining elements are removed.

Repeat this operation until the array is empty or contains no duplicate values.
Return an integer denoting the number of operations required.

EXAMPLE 1:
Input: nums = [3,8,3,6,5,8]
Output: 1
Explanation:
In the first operation, we remove the first three elements. The remaining elements [6, 5, 8] are all distinct,
so we stop. Only one operation is needed.
*/

package Leetcode;
import java.util.*;
public class LC_3779
{
    public static int minOperations(int arr[])
    {
        //Create a hashmap for frequency of each element
        Map<Integer, Integer> freq= new HashMap<>();
        for(int i: arr)
        {
            freq.put(i, freq.getOrDefault(i,0) + 1);
        }

        int dupCount= 0;
        for(int i: freq.values())
        {
            if(i>1)
                dupCount++;
        }

        int ops=0;
        int i=0;
        while(dupCount>0 && i<arr.length)
        {
            for(int k=1; k<=3 && i<arr.length; k++, i++)
            {
                int ele= arr[i];
                if(freq.get(ele)==2) dupCount--;
                freq.put(ele, freq.get(ele)-1);
            }
            ops++;
        }
        return ops;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]= sc.nextInt();
        }
        int ops= minOperations(arr);
        System.out.println("Minimum Operations:" +ops);
        sc.close();
    }
}


/*INTUITION:
We create a hashmap of the frequency of each element of the array. Then count number of duplicate elements.

The loop until there are no duplicate elements left in the array or the size of array becomes 0.
Move in sets of 3 and keep incrementing count of operations by 1.*/