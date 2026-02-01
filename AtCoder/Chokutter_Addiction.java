// https://atcoder.jp/contests/abc443/tasks/abc443_d


import java.util.*;
public class Chokutter_Addiction {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int t= sc.nextInt();

        if(n==0)
        {
            System.out.println(t);
            return;
        }

        int arr[]= new int[n];
        List<Integer> diff= new ArrayList<>();

        for(int i=0; i<n; i++)
        {
            arr[i]= sc.nextInt();
            if(i==0)
                diff.add(arr[i]);
            else if(arr[i]- diff.get(diff.size()-1) >= 100)
                diff.add(arr[i]);
        }


        int prefix[]= new int[diff.size()];
        prefix[0]= diff.get(0);

        for(int i=1; i<diff.size(); i++)
        {
            prefix[i]= diff.get(i) - diff.get(i-1);
        }

        long sum=prefix[0];

        for(int i=1; i<prefix.length; i++)
        {
            sum+= prefix[i]-100;
        }

        int lastInterruptionTime = diff.get(diff.size()-1);
        int lastReopenTime = lastInterruptionTime + 100;

        // If the work day is still going on after the app reopens...
        if (lastReopenTime < t) {
            sum += (t - lastReopenTime);
        }

        System.out.println(sum);
    }
}