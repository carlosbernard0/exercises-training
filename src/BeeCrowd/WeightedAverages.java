package BeeCrowd;

import java.util.Scanner;

public class WeightedAverages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        double average = 0;

        for (int i = 0; i < N; i++) {
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            average = ((a*2+b*3+c*5)/10);

            System.out.printf("%.1f%n",average);
        }
    }
}
