package BeeCrowd;

import java.util.Scanner;

public class FibonacciArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        long[] fib = new long[100];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < fib.length ; i++) {
            fib[i] = fib[i-2] + fib[i-1];
        }

        for (int i = 0; i < num; i++) {
            int n = input.nextInt();
            System.out.printf("Fib(%d) = %d%n", n, fib[n]);
        }
    }
}
