package BeeCrowd;

import java.util.Scanner;

public class PositivesAndAverage {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int postiveNumbers = 0;
        double value = 0;

        for (int i = 0; i <6 ; i++) {
            double number = input.nextDouble();
            if (number > 0){
                postiveNumbers++;
                value += number;
            }

        }

        double average = value/postiveNumbers;

        System.out.printf("%d valores positivos%n",postiveNumbers);
        System.out.printf("%.1f%n",average);

        input.close();
    }
}
