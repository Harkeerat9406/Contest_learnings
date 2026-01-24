// https://atcoder.jp/contests/abc440/tasks/abc440_d

import java.util.*;

public class Forbidden_List_2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();

        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }

        Arrays.sort(A);

        while (Q-- > 0) {
            long X = sc.nextLong();
            long Y = sc.nextLong();

            // Count forbidden numbers < X
            int idx = lowerBound(A, X);
            long missingBeforeX = X - 1 - idx;

            long targetMissing = missingBeforeX + Y;

            // Binary search to find smallest index where missing(i) >= targetMissing
            int l = 0, r = N - 1;
            while (l <= r) {
                int m = (l + r) / 2;
                long missing = A[m] - (m + 1);
                if (missing < targetMissing) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }

            if (l == N) {
                // Answer is beyond last forbidden number
                System.out.println(targetMissing + N);
            } else {
                System.out.println(A[l] - (A[l] - (l + 1) - targetMissing) - 1);
            }
        }
    }

    static int lowerBound(long[] arr, long x) {
        int l = 0, r = arr.length;
        while (l < r) {
            int m = (l + r) / 2;
            if (arr[m] < x) l = m + 1;
            else r = m;
        }
        return l;
    }
}
