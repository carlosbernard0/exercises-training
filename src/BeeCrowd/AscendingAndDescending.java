package BeeCrowd;

import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int X,Y;
        while (!((X = input.nextInt())==(Y = input.nextInt()))){
            if (X>Y){
                System.out.println("Decrescente");
            }else {
                System.out.println("Crescente");
            }
        }
    }
}
