package BeeCrowd;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int distance = input.nextInt();
        int minutes = distance * 2;

        System.out.printf("%d minutos%n",minutes);

    }
}
