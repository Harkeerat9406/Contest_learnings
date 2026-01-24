package Codeforces;
import java.util.*;
public class OutOfMemoryError{
    public static void reset(int arr[], int original[], int n)
    {
        for(int i=0; i<n; i++)
        {
            arr[i]= original[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cases= sc.nextInt();
        
        for(int i=0; i<cases; i++)
        {
            int n= sc.nextInt();
            int ops= sc.nextInt();
            int high= sc.nextInt();

            int arr[]= new int[n];
            int current[]= new int[n];
            for(int j=0; j<n; j++)
            {
                arr[j]= sc.nextInt();
                current[j]= arr[j];
            }
            int lastTouched[]= new int[n];
            int version=0;
            
            for (int j = 0; j < ops; j++)
            {
                int idx = sc.nextInt() - 1;
                int added = sc.nextInt();

                if (lastTouched[idx] != version) 
                {
                    current[idx] = arr[idx];
                }

                current[idx] += added;
                lastTouched[idx] = version;

                if (current[idx] > high) 
                    version++;  
            }

            for(int k=0; k<n; k++)
            {
                if(lastTouched[k]!=version)
                {
                    current[k]= arr[k];
                }
                System.out.print(current[k]+" ");
            }
            System.out.println();
        }
    }
}
