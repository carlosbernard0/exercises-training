package BeeCrowd;

import java.util.Scanner;

public class ColumnInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matriz = new double[3][3];
        int num = input.nextInt();
        input.nextLine();
        String option = input.nextLine();
        double sum = 0;
        double average = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = input.nextDouble();
                if (j == num){
                    sum+= matriz[i][j];
                }
            }
        }

        if(option.equalsIgnoreCase("S")){
            System.out.printf("%.1f%n",sum);
        } else if (option.equalsIgnoreCase("M")) {
            average = sum / matriz.length;
            System.out.printf("%.1f%n",average);
        }
    }
}
