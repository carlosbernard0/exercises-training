package BeeCrowd;

import java.util.Scanner;

public class ArrayFillIV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] evenNuns = new int[5];
        int[] oddNuns = new int[5];
        int iEven = -1;
        int iOdd = -1;
        for (int i = 0; i < 15; i++) {
            int num = input.nextInt();

            if (num % 2 == 0){
                iEven++;
                evenNuns[iEven] = num;
            } else  {
                iOdd++;
                oddNuns[iOdd] = num;
            }

            if (iEven == 4){
                for (int j = 0; j < evenNuns.length; j++) {
                    System.out.printf("par[%d] = %d%n",j,evenNuns[j]);
                }
                evenNuns = new int[5];
                iEven = -1;
            }

            if (iOdd == 4){
                for (int j = 0; j < evenNuns.length; j++) {
                    System.out.printf("impar[%d] = %d%n",j,oddNuns[j]);
                }
                oddNuns = new int[5];
                iOdd = -1;
            }
        }

        for (int j = 0; j <= iOdd; j++) {
            System.out.printf("impar[%d] = %d%n",j,oddNuns[j]);
        }

        for (int j = 0; j <= iEven; j++) {
            System.out.printf("par[%d] = %d%n",j,evenNuns[j]);
        }

    }
}
