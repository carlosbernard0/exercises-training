package BeeCrowd;

import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int X,Y;
        do {

            X = input.nextInt();
            Y = input.nextInt();

            if (X > 0 && Y > 0){
                System.out.println("primeiro");
            } else if (X > 0 && Y < 0) {
                System.out.println("quarto");

            } else if (X < 0 && Y > 0) {
                System.out.println("segundo");

            } else if (X < 0 && Y < 0) {
                System.out.println("terceiro");

            }
        } while (X != 0 || Y != 0);
    }
}
