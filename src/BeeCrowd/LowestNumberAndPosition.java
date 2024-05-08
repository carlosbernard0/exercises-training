package BeeCrowd;

import java.util.Scanner;

public class LowestNumberAndPosition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] array = new int[N];
        int lowestNum = 2000000;
        int positionLowest = -1;

        for (int i = 0; i < N; i++) {
            array[i] = input.nextInt();
            if (array[i] < lowestNum){
                lowestNum = array[i];
                positionLowest = i;
            }
        }

        System.out.printf("Menor valor: %d\n",lowestNum);
        System.out.printf("Posicao: %d\n",positionLowest);
    }
}
