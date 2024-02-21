package BeeCrowd;

import java.util.Scanner;

public class EvenSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 2 ==0){
                int result = i*i;
                System.out.printf("%d^2 = %d%n",i, result);
            }
        }
    }
}
