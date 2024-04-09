package BeeCrowd;

import java.util.Scanner;

public class SumOfConsecutiveEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int sumX = 0;
        while ((x = input.nextInt()) != 0){
            if (x %2 != 0){
                x++;
                sumX=x+(x+2)+(x+4)+(x+6)+(x+8);
            }else {
                sumX=x+(x+2)+(x+4)+(x+6)+(x+8);
            }
            System.out.println(sumX);
        }
    }
}
