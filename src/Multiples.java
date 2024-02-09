import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;
        num1 = input.nextInt();
        num2 = input.nextInt();

        if (num1 % num2 == 0 || num2 % num1 == 0){
            System.out.println("Sao Multiplos");
        }else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
