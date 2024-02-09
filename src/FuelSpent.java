import java.util.Scanner;

public class FuelSpent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double kilometersForLiters = 12;
        double hours = input.nextDouble();
        double same = input.nextDouble();

        double litersForTrip = (hours*same)/kilometersForLiters;

        System.out.printf("%.3f%n", litersForTrip);
    }
}
