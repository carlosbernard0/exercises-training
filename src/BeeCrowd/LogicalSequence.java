package BeeCrowd;

import java.util.Scanner;

public class LogicalSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.printf("%d %.0f %.0f%n", i, Math.pow(i,2), Math.pow(i,3));
            System.out.printf("%d %.0f %.0f%n", i, Math.pow(i,2)+1, Math.pow(i,3)+1);

        }
    }
}
