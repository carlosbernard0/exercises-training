import java.util.Scanner;

public class SimpleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2,num3;
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        if (num1 > num2 && num1 > num3 && num2 > num3){
            System.out.println(num3);
            System.out.println(num2);
            System.out.println(num1);
        } else if (num1 > num2 && num1 < num3 && num2 < num3) {
            System.out.println(num2);
            System.out.println(num1);
            System.out.println(num3);
        }else if (num1 < num2 && num1 < num3 && num2 > num3){
            System.out.println(num1);
            System.out.println(num3);
            System.out.println(num2);
        }else if (num1 < num2 && num1 > num3 && num2 > num3){
            System.out.println(num3);
            System.out.println(num1);
            System.out.println(num2);
        } else if (num1 < num2 && num2 < num3 && num1 < num3) {
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
        }else {
            System.out.println(num2);
            System.out.println(num3);
            System.out.println(num1);
        }
        System.out.println();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}
