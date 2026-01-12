package Codeforces;
import java.util.Scanner;

public class Huge_Pile {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int cases= sc.nextInt();

        for(int i=0; i<cases; i++)
        {
            int n= sc.nextInt();
            int k= sc.nextInt();
            int count= 0;
            boolean found= false;

            while(n>=k)
            {
                int ns= Math.floorDiv(n,2);
                int nb= Math.ceilDiv(n,2);
                if(n==k)
                {
                    System.out.println(count);
                    found= true;
                    break;
                }
                count++;

                if(ns==k || nb==k)
                {
                    found= true;
                    System.out.println(count);
                    break;
                }

                if(ns%2!=0)
                    n= ns;
                else
                    n= nb;
            }
            if(!found)
                System.out.println("-1");
        }
        sc.close();
    }
}