package BeeCrowd;

import java.util.Scanner;

public class Snack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int productCode, quantity;
        double totality = 0.0;
        productCode = input.nextInt();
        quantity = input.nextInt();

        if (productCode == 1){
            totality = quantity * 4;
        } else if (productCode == 2) {
            totality = quantity * 4.5;
        } else if (productCode == 3) {
            totality = quantity * 5;
        } else if (productCode ==4) {
            totality = quantity *2;
        } else if (productCode == 5) {
            totality = quantity * 1.5;
        }

        System.out.printf("Total: R$ %.2f%n", totality);
    }
}
