package BeeCrowd;

import java.util.Scanner;

public class SummingConsecutiveIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,n,soma=0;

        a = input.nextInt();
        n = input.nextInt();

        while (n <= 0){
            n = input.nextInt();
        }
        for (int i = 1; i <= n ; i++) {
            soma += a;
            a++;
        }
        System.out.println(soma);
    }
}
