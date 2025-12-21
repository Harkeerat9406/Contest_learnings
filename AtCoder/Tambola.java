/* Problem statement-
We get a 2D array as input of size h x w. Then we get an array of size n with n distinct elements.
We need to search every row and check how many elements from n_distinct array are present in 2D array.
Return the max number of elements from n_distinct array present in a row */

import java.util.*;
public class Tambola
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int h= sc.nextInt();
        int w= sc.nextInt();
        int n_dist= sc.nextInt();
        int arr[][]= new int[h][w];

        for(int i=0; i<h; i++)
        {
            for(int j=0; j<w; j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }

        Set<Integer> set= new HashSet<>();
        for(int i=0; i<n_dist; i++)
        {
            int n=sc.nextInt();
            set.add(n);
        }

        int max_count=0;
        for(int i=0; i<h; i++)
        {
            int count=0;
            for(int j=0; j<w; j++)
            {
                if(set.contains(arr[i][j]))
                    count++;
            }
            max_count= Math.max(max_count, count);
        }
        System.out.println(max_count);
        sc.close();
    }
}


/*INTUITION:
Take 2D and n_distinct arrays as inputs. The n_dist array should be taken as a set.
Loop through each row and check if each element is present in the set or not. Keep a track of count 
and max_count and later return max_count */