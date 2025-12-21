/*PROBLEM STATEMENT:
An array A of length N is called good if the sum of all it's elements is non-negative, i.e.
(A1+A2+…+AN)≥0

Find the minimum non-negative integer X such that if you add X to each element of the array, the array 
becomes good.

INPUT:
First line contains int denoting number of test cases.
Second line contains number of values the array and then the elements of array and so on for other cases.
Example-
4           //Number of test cases
3       
1 -5 -3        OUTPUT: 3
2           
-2 -2          OUTPUT: 2
1
5              OUTPUT: 0
*/


package CodeChef;
import java.util.*;

public class Add_to_make_positive 
{
    public static void check(int arr[], int mini, int sum)
    {
        if(mini==Integer.MAX_VALUE)      //All values are positive
        {
            System.out.println("0");
            return;
        }
        
        int len= arr.length;
        for(int i=0; i<Math.abs(mini); i++)
        {
            if((len*i) + sum>=0)
            {
                System.out.println(i);
                return;
            }
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int cases= sc.nextInt();
        for(int i=0; i<cases; i++)
        {
            int mini= Integer.MAX_VALUE;
            int sum=0;
            int n= sc.nextInt();
            int arr[]= new int[n];
            for(int j=0; j<n; j++)
            {
                arr[j]= sc.nextInt();
                mini= Math.min(mini, arr[j]);
                sum+= arr[j];
            }
            check(arr, mini, sum);
        }
        sc.close();
    }
}


/*INTUITION:
We keep a track of sum of all the elements and the minimum negative number in the array.

Run a loop from 0 to abs(minimum) because the least number that we need to add could be 0 if the sum of
negative and positive elements is equal. 
And the greatest number needed to add would be the abs(minimum)because in that case all numbers of the 
array will become >=0
*/