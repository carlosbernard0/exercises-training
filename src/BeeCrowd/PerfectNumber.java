package BeeCrowd;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int num = input.nextInt();
        for (int i = 0; i < num; i++) {
            int sumOfDivisorsNumbers= 0;
            int x = input.nextInt();
            for (int j = 1; j < x; j++) {
                if (x%j == 0){
                    sumOfDivisorsNumbers+= j;
                }
            }
            if (sumOfDivisorsNumbers == x){
                System.out.println(x+" eh perfeito");
            }else {
                System.out.println(x+" nao eh perfeito");

            }
        }
    }
}
