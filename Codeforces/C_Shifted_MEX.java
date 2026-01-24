package Codeforces;
import java.util.*;

public class C_Shifted_MEX {
    public static void finder(int arr[], int n)
    {
        int longest= 1;
        int len=1;
        Arrays.sort(arr);

        for(int i=1; i<n; i++)
        {
            if(arr[i]-arr[i-1]==1)
            {
                len++;
                longest= Math.max(longest, len);
            }
            else
            {
                len=1;
            }
        }
        System.out.println(longest);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cases= sc.nextInt();
        
        for(int i=0; i<cases; i++)
        {
            int n= sc.nextInt();
            int arr[]= new int[n];
            HashSet<Integer> set= new HashSet<>();

            for(int j=0; j<n; j++)
            {
                arr[j]= sc.nextInt();
                set.add(arr[j]);
            }
            
            int arr2[]= new int[set.size()];
            int idx=0;
            for(int val: set)
            {
                arr2[idx++]= val;
            }

            finder(arr2, arr2.length);
        }
    }
}