package BeeCrowd;

import java.util.Scanner;

public class Remaining2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        for (int i = 1; i <= 10000; i++) {
            if (i % num == 2){
                System.out.println(i);
            }
        }
    }
}
