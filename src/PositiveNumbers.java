import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner input=  new Scanner(System.in);
        

        int count = 0;

        for (int i = 0; i < 6; i++) {
            double num = input.nextDouble();
            if (num > 0){
                count ++;
            }
        }
        System.out.println(count + " valores positivos");

        input.close();

    }
}
