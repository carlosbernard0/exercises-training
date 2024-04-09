package BeeCrowd;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        for (int i = 0; i < num; i++) {
            int x = input.nextInt();
            int aux = 0;

            for (int j = 1; j <= x; j++) {
                if (x%j == 0){
                    aux++;
                }
            }

            if (aux == 2){
                System.out.println(x+" eh primo");
            }else {
                System.out.println(x+" nao eh primo");
            }
        }
    }
}
