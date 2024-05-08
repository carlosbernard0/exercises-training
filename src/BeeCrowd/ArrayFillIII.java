package BeeCrowd;

import java.util.Scanner;

public class ArrayFillIII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] N = new double[100];
        double X = input.nextDouble();
        N[0] = X;
        double xDivide = 0;
        xDivide+=X;

        System.out.printf("N[%d] = %.4f%n",0,N[0]);
        for (int i = 1; i < N.length; i++) {
            N[i] = xDivide/2;
            xDivide -= N[i];
            System.out.printf("N[%d] = %.4f%n",i,N[i]);
        }
    }
}
