import java.util.*;
import java.io.*;

class Pawn_Line {
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        int cases= sc.nextInt();

        for(int k=0; k<cases; k++)
        {
            int N= sc.nextInt();
            int Original[]= new int[N];
            int A[]= new int[N];

            for(int i=0; i<N; i++)
            {
                Original[i]= sc.nextInt();
                A[i]= Original[i];
            }

            // Pass 1: Left to Right
            for (int i = 1; i < N; i++) {
                A[i] = Math.min(A[i], A[i-1] + 1);
            }

            // Pass 2: Right to Left
            for (int i = N - 2; i >= 0; i--) {
                A[i] = Math.min(A[i], A[i+1] + 1);
            }

            // Calculate Operations
            long moves = 0;
            for (int i = 0; i < N; i++) {
                moves += (Original[i] - A[i]);
            }
            System.out.println(moves);
        }
    }
}