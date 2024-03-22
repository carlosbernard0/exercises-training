package BeeCrowd;

import java.util.Scanner;

public class SeveralScoresWithValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double X,Y;
        int newCalulate = 1;
        int option = 1;
        double average;

        while (option ==1){
            while ((X = input.nextDouble()) < 0 || X > 10){
                System.out.println("nota invalida");
            }
            while ((Y = input.nextDouble()) < 0 || Y > 10){
                System.out.println("nota invalida");
            }

            average = (X+Y)/2;
            System.out.printf("media = %.2f%n",average);
            do {
                System.out.println("novo calculo (1-sim 2-nao)");
                newCalulate = input.nextInt();

                if (newCalulate == 1){
                    option = 1;
                } else if (newCalulate == 2) {
                    option = 2;
                }
            }while (newCalulate != 1 && newCalulate != 2 );
        }
    }
}
