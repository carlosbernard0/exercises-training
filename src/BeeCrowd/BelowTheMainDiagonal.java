package BeeCrowd;

import java.util.Scanner;

public class BelowTheMainDiagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String O = input.nextLine();
        double[][] matrix = new double[12][12];

        double sum =0;

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i > j){
                    sum+= matrix[i][j];
                }
            }
        }

        if (O.equalsIgnoreCase("S")){
            System.out.printf("%.1f%n",sum);
        } else if (O.equalsIgnoreCase("M")) {
            sum/= (double) ((matrix.length * matrix.length) - 12) /2;
            System.out.printf("%.1f%n",sum);
        }
    }
}
