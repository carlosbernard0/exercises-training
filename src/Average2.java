import java.util.Scanner;

public class Average2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double A,B,C,average;
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();

        average = (((A*2.0)+(B*3.0)+(C*5.0))/10);

        System.out.printf("MEDIA = %.1f\n", average);

    }
}
