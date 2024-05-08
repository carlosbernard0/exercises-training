package BeeCrowd;

import java.util.Scanner;

public class AboveTheSecundaryDiagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String O = input.nextLine();
        double[][] matrix= new double[12][12];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j < i){
                    matrix[i][j] = input.nextDouble();


                }
            }
        }
    }
}
