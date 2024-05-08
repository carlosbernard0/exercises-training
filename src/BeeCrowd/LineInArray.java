package BeeCrowd;

import java.util.Scanner;

public class LineInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] array = new double[12][12];

        double lineOfArray = input.nextInt();
        double sum = 0;
        double average;
        input.nextLine();
        String operation = input.nextLine();


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        for (int i = 0; i < array.length; i++) {
            sum+=array[(int) lineOfArray][i];
        }

        if (operation.equalsIgnoreCase("S")){
            System.out.printf("%.1f%n",sum);
        } else if (operation.equalsIgnoreCase("M")) {
            average = sum/array.length;
            System.out.printf("%.1f%n",average);
        }
    }
}

