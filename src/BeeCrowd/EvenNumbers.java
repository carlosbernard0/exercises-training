package BeeCrowd;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i < 101 ; i++) {
            if (i % 2 == 0){
                System.out.println(i);

            }
        }
    }
}
