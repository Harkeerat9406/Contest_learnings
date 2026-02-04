// https://www.codechef.com/START224D/problems/ADC

package CodeChef;
import java.util.Scanner;

public class Max_good_trades {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 0; i < cases; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            int min = arr[0];
            int max = arr[0];
            int trade = 0;

            for (int j = 0; j < arr.length; j++) {
                min = Math.min(arr[j], min);
                max = Math.max(arr[j], max);

                if (arr[j] - min > k || max - arr[j] > k) {
                    trade++;
                    if (j + 1 < n) {
                        min = arr[j + 1];
                        max = arr[j + 1];
                    }
                }
            }
            System.out.println(trade);
        }

    }
}
