package BeeCrowd;

import java.util.Scanner;

public class SumOfConsecutiveOddNumbersIII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        for (int i = 0; i < num; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            int soma = 0;

            if (x % 2 != 0){
                for (int j = 0; j < y; j++) {
                    soma+=x;
                    x += 2;
                }
            }else {
                x+=1;
                for (int j = 0; j < y; j++) {
                    soma+=x;
                    x += 2;
                }
            }
            System.out.println(soma);
        }
    }
}
