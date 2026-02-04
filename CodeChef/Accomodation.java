// https://www.codechef.com/START224D/problems/ACMDT

package CodeChef;

import java.util.Scanner;

public class Accomodation {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		long cases= sc.nextLong();
		
		for(long i=0; i<cases; i++)
		{
            long Tboys= sc.nextLong();
            long Tgirls= sc.nextLong();
            long minb= sc.nextLong();
            long ming= sc.nextLong();
            long atmax= sc.nextLong();
            
            if(minb+ming > atmax)
            {
                System.out.println("-1");
                continue;
            }

            long divisor= Math.min(Tboys+Tgirls, atmax);

            long rooms= (Tboys+Tgirls + divisor -1 )/divisor;

            if(rooms> Tboys/minb || rooms> Tgirls/ming)
            System.out.println("-1");
            else
            System.out.println(rooms);
		}

	}
}
