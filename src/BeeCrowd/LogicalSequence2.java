package BeeCrowd;

import java.util.Scanner;

public class LogicalSequence2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1= input.nextInt();
        int num2= input.nextInt();

        for (int i = 1; i <= num2; i++) {
            System.out.print(i);
            if (i % num1 == 0) System.out.println("");
            else System.out.print(" ");

        }

    }
}
