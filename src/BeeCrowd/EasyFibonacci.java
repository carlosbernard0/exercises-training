package BeeCrowd;

import java.util.Scanner;

public class EasyFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        int aux= 0;
        int aux2= 1;
        int proximo;
        int i = 1;

        while (i <= num){
            if(i == num){
                System.out.println(aux);
            }else {
                System.out.printf("%d ", aux);
            }
            int next = aux+aux2;
            aux = aux2;
            aux2 = next;
            i++;
        }
    }
}
