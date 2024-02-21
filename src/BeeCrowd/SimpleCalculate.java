package BeeCrowd;

import java.util.Scanner;

public class SimpleCalculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int   codeProduct1, codeProduct2,unitsProduct1, unitsProduct2;
        float priceForOneUnit1, priceForOneUnit2;

        codeProduct1= input.nextInt();
        unitsProduct1= input.nextInt();
        priceForOneUnit1 = input.nextFloat();

        float value1 = (priceForOneUnit1 * unitsProduct1);

        input.nextLine();

        codeProduct2 = input.nextInt();
        unitsProduct2 = input.nextInt();
        priceForOneUnit2 = input.nextFloat();

        float value2 = (priceForOneUnit2*unitsProduct2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n",value1+value2);

        input.close();

    }
}
