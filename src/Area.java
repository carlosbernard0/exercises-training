import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A,B,C;

        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();

        double areaRectangledTriangle = 0.5 *(A*C);
        System.out.printf("TRIANGULO: %.3f%n", areaRectangledTriangle);

        double areaRadiusCircle = (C*C)*3.14159;
        System.out.printf("CIRCULO: %.3f%n", areaRadiusCircle);

        double areaTrapezium = 0.5*(A+B)*C;
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezium);

        double areaSquare = B*B;
        System.out.printf("QUADRADO: %.3f%n", areaSquare);

        double areaRectangle = A*B;
        System.out.printf("RETANGULO: %.3f%n", areaRectangle);

    }
}
