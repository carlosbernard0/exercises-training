package BeeCrowd;

import java.util.Scanner;

public class SimpleFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int factorial= 1;

        for (int i = 1; i <= num; i++) {
            factorial*= i;
        }

        System.out.println(factorial);

    }
}
