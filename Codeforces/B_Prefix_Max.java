package Codeforces;
import java.util.Scanner;

public class B_Prefix_Max {
    public static void calc(int arr[], int n)
    {
        int prefix[]= new int[n];
        prefix[0]= arr[0];
        int sum=prefix[0];

        for(int i=1; i<n; i++)
        {
            prefix[i]= Math.max(prefix[i-1], arr[i]);
            sum+= prefix[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cases= sc.nextInt();
        
        for(int i=0; i<cases; i++)
        {
            int n= sc.nextInt();
            int arr[]= new int[n];
            int maxPos=0;

            for(int j=0; j<n; j++)
            {
                arr[j]= sc.nextInt();
                if (arr[j]>arr[maxPos])
                    maxPos= j;
            }

            int temp= arr[0];
            arr[0]= arr[maxPos];
            arr[maxPos]= temp;
            calc(arr, n);
        }
    }
}