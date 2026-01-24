// https://atcoder.jp/contests/abc440/tasks/abc440_b

import java.util.*;

public class Trifecta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE, third = Integer.MAX_VALUE;
        int fIdx = -1, sIdx = -1, tIdx = -1;

        for (int i = 0; i < N; i++) {
            int t = sc.nextInt();

            if (t < first) {
                third = second; tIdx = sIdx;
                second = first; sIdx = fIdx;
                first = t; fIdx = i;
            } else if (t < second) {
                third = second; tIdx = sIdx;
                second = t; sIdx = i;
            } else if (t < third) {
                third = t; tIdx = i;
            }
        }

        System.out.println((fIdx + 1) + " " + (sIdx + 1) + " " + (tIdx + 1));
    }
}
