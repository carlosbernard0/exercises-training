package BeeCrowd;

import java.util.Scanner;

public class AboveTheMainDiagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matriz = new double[12][12];
        String option = input.nextLine();
        double sum = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = input.nextDouble();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j > i) sum += matriz[i][j];
            }
        }

        if (option.equalsIgnoreCase("M")) sum /= ((matriz.length * matriz.length) - 12) / 2; // 66
        System.out.println(String.format("%.1f", sum));


    }
}
