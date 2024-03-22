package BeeCrowd;

import java.util.Scanner;

public class ScoreValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double average = 0.0;
        double all = 0;
        int quantityOfScores = 0;

        while (average == 0){
            double num = input.nextDouble();
            if (num < 0 || num > 10){
                System.out.println("nota invalida");
            }else {
                all+=num;
                quantityOfScores++;
            }

            if (quantityOfScores == 2){
                average = all/2;
            }
        }
        System.out.printf("media = %.2f%n",average);
    }
}
