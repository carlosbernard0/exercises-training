package BeeCrowd;

import java.util.Scanner;

public class EvenOddPositiveAndNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int even, odd, positive,negative;
        even= 0;
        odd= 0;
        positive= 0;
        negative= 0;

        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();
            if (num % 2 == 0){
                even++;
            }else {
                odd++;
            }
            if (num >0){
                positive++;
            }
            if (num < 0){
                negative++;
            }
        }

        System.out.printf("%d valor(es) par(es)%n",even );
        System.out.printf("%d valor(es) impar(es)%n",odd);
        System.out.printf("%d valor(es) positivo(s)%n",positive );
        System.out.printf("%d valor(es) negativo(s)%n",negative );

        input.close();
    }
}
