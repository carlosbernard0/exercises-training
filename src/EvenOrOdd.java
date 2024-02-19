import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int i = 0; i < num; i++) {
            int number = input.nextInt();
            if (number > 0 && number % 2 == 0){
                System.out.println("EVEN POSITIVE");
            } else if (number < 0 && number % 2 == 0) {
                System.out.println("EVEN NEGATIVE");
            } else if (number > 0 && number % 2 != 0) {
                System.out.println("ODD POSITIVE");
            } else if (number < 0 && number % 2 != 0) {
                System.out.println("ODD NEGATIVE");
            } else if (number == 0) {
                System.out.println("NULL");
            }
        }
    }
}
