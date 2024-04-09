package BeeCrowd;

import java.util.Scanner;

public class ExceedingZ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x,z, soma = 0,numerosSoma = 0;
        x = input.nextInt();
        z = input.nextInt();

        while (z <= x){
            z = input.nextInt();
        }

        for (int i = x; i < z; i++) {
            if (soma >= z){
                System.out.println(numerosSoma);
                break;
            }
            soma+=i;
            numerosSoma++;
        }

    }
}
