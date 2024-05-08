package BeeCrowd;

import java.util.Scanner;

public class ArrayFillII {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int t = input.nextInt();
        int[] n = new int[1000];
        int aux = 0;

        for (int i = 0; i < n.length ; i++) {
            if (aux == t){
                aux =0;
                n[i] = aux;
                aux++;
            }else {
                n[i] = aux;
                aux++;
            }
            System.out.printf("N[%d] = %d\n",i,n[i]);

        }


    }
}
