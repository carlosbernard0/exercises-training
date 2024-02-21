package BeeCrowd;

import java.util.Scanner;

public class Consumption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int distanceTraveled= input.nextInt();
        double spentFuelTotal = input.nextDouble();

        double consumption = distanceTraveled/spentFuelTotal;

        System.out.printf("%.3f km/l%n", consumption);
    }
}
