/*PROBLEM STATEMENT:
You start with an integer X=0. For N turns, you do exactly one of the following:
    Either, you add 1 to X
    Or, you add 3 to X

For example, for N=2, you can choose to add 1 on the first turn, and 3 on the second turn, thus a final value of X=4.

Given an integer M, print whether it is possible that the final value of X is M or not.

INPUT FORMAT:
    The first line of input will contain a single integer T denoting the number of test cases.
    The first and only line of each test case contains 2 integers - N and M.

OUTPUT: "YES" or "NO"
*/

package CodeChef;

import java.util.Scanner;

public class Add_1_or_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
		int cases= sc.nextInt();
		
		for(int i=0; i<cases; i++)
		{
            long moves= sc.nextInt();
            long target= sc.nextInt();

            long max= 3*moves;
            long min= moves;

            if(target>=min && target<=max && (target-min)%2==0)
            System.out.println("YES");

            else
            System.out.println("NO");
		}
    }
}
