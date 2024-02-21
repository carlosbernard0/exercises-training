package BeeCrowd;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double A,B,C;
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();

        double perimeter = A + B + C;
        double area = ((A+B) * C)/2;

        if ((A+B)> C && (A+C) > B && (B+C) > A){
            System.out.printf("Perimetro = %.1f%n",perimeter);
        } else {
            System.out.printf("BeeCrowd.Area = %.1f%n",area);

        }
    }
}
