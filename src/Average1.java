    import java.util.Scanner;

    public class Average1 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            double A = input.nextDouble();
            double B = input.nextDouble();
            double mediaA = A * 3.5d;
            double mediaB = B * 7.5d;
            double average = (mediaB + mediaA)/11;

            System.out.printf("MEDIA = %.5f\n", average);
        }
    }
