package BeeCrowd;

import java.util.Scanner;

public class TypeOfFuell {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int alcohol=0, gasoline=0, diesel=0;
        int option = 0;

        while (option != 4){
            int num = input.nextInt();
            if (num == 1){
                alcohol++;
            } else if (num == 2) {
                gasoline++;
            } else if (num == 3) {
                diesel++;
            } else if (num == 4) {
                option = 4;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+alcohol);
        System.out.println("Gasolina: "+gasoline);
        System.out.println("Diesel: "+diesel);
    }
}
