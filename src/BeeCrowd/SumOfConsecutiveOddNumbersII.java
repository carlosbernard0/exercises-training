package BeeCrowd;

import java.util.Scanner;

public class SumOfConsecutiveOddNumbersII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numOfTestCases = input.nextInt();

        int x,y,soma;
        for (int i = 0; i < numOfTestCases; i++) {
            soma = 0;
            x = input.nextInt();
            y = input.nextInt();

            if (x> y){
                for (int j = y+1; j < x; j++) {
                    if (j%2!=0){
                        soma+=j;
                    }
                }
            }else {
                for (int j = x+1; j < y; j++) {
                    if (j%2!=0){
                        soma+= j;
                    }
                }
            }
            System.out.println(soma);
        }
    }
}
