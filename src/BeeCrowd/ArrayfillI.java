package BeeCrowd;

import java.util.Scanner;

public class ArrayfillI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int[] array =  new int[10];
        array[0] = num;
        for (int i = 1; i < array.length; i++) {
            num+= num;
            array[i]= num;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.printf("N[%d] = %d%n",i, array[i]);
        }
    }
}
