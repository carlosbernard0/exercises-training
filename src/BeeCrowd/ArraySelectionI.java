package BeeCrowd;

import java.util.Scanner;

public class ArraySelectionI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] array = new double[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
            if (array[i]<=10){
                System.out.printf("A[%d]= %.1f%n",i,array[i]);
            }
        }
    }
}
