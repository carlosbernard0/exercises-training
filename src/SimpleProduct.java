import java.util.Scanner;

public class SimpleProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, prod;
        num1 = input.nextInt();
        num2 = input.nextInt();
        prod = num1*num2;
        System.out.println("PROD = " + prod);
    }
}
