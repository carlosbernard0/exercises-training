package BeeCrowd;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        int odd = 0;

        for (int i = 1; i < num; i++) {
            if (i % 2 == 1){
                odd = i;
                System.out.println(odd);
            }

        }
        if (num % 2 == 1){
            System.out.println(num);
        }
    }
}
