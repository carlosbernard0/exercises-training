import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pi = 3.14159;
        double radius = input.nextDouble();
        double volume = (4.0/3)*(radius*(radius*radius))*pi;

        System.out.printf("VOLUME = %.3f%n", volume);
    }
}
