// https://atcoder.jp/contests/abc442/tasks/abc442_c

import java.util.*;
public class Peer_Review {

    public static void check(ArrayList<Integer> arr[], int r, int n)
    {
        long length= (n-1) - arr[r].size();
        if(length<3)
            System.out.println(0);
        else
        {
            long groups= (length * (length - 1) * (length - 2)) / 6;
            System.out.print(groups+ " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        
        ArrayList<Integer> arr[]= new ArrayList[n+1];
        for(int i=0; i<=n; i++)
        {
            arr[i]= new ArrayList<>();
        }

        for(int i=0; i<m; i++)
        {
            int a= sc.nextInt();
            int b= sc.nextInt();
            arr[a].add(b);
            arr[b].add(a);
        }

        for(int i=1; i<=n; i++)
        {
            check(arr, i, n);
        }
    }
}


/* Explanation for the number of groups formula

i can make a team of 3 people from n people.
Slot 1 can be filled from n people
Slot 2 from (n-1) people
Slot 3 from (n-2)

But in this calculation, we are treating {1,2,3} and {2,3,1} as distinct pairs
So to remove the repeating pairs, we calculate how many permutations we can have from
3 different people.
Similar as previous,
Slot 1 can be filled from 3 people
Slot 2 from 2
Slot 3 from 1
total permutations = 3 x 2 x 1 = 6

number of valid distinct groups= ((length * (length-1) * (length-2)) /6 */