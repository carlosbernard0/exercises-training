package BeeCrowd;

import java.util.Scanner;

public class HoHoHo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int H = input.nextInt();

        for (int i = 0; i < H; i++) {
            if (i==(H-1)){
                System.out.printf("Ho!%n");
            } else {
                System.out.printf("Ho ");
            }
        }
    }
}
