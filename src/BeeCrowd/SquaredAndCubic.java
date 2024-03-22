package BeeCrowd;

import java.util.Scanner;

public class SquaredAndCubic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.printf("%d %.0f %.0f%n",i+1, Math.pow(i+1,2), Math.pow(i+1,3));
        }
    }
}
