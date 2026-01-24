// https://atcoder.jp/contests/abc442/tasks/abc442_d

import java.util.*;
public class Swap_and_Range_Sum {

    public static void swap(int arr[], int prefix[], int x)
    {
        prefix[x]= prefix[x] - arr[x-1] + arr[x];
        int temp= arr[x-1];
        arr[x-1]= arr[x];
        arr[x]= temp;

    }

    public static void printSum(int prefix[], int l, int r)
    {
        System.out.println(prefix[r]-prefix[l]);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int q= sc.nextInt();
        int arr[]= new int[n];
        
        for(int i=0; i<n; i++)
        {
            arr[i]= sc.nextInt();
        }

        int prefix[]= new int[n+1];
        for(int i=0; i<n; i++)
        {
            prefix[i+1]= prefix[i] + arr[i];
        }

        for(int i=0; i<q; i++)
        {
            int choice= sc.nextInt();
            if(choice==1)
            {
                int x= sc.nextInt();
                swap(arr, prefix, x);
            }
            else
            {
                int l= sc.nextInt();
                int r= sc.nextInt();
                printSum(prefix, l, r);
            }
        }
    }
}