package BeeCrowd;

import java.util.Scanner;

public class ArraychangeI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] n = new int[20];
        for (int i = 0; i < n.length; i++) {
            n[n.length-1-i] = input.nextInt();
        }

        for (int i = 0; i < n.length ; i++) {
            System.out.printf("N[%d] = %d%n",i,n[i]);
        }
    }
}
