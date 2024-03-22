package BeeCrowd;

import java.util.Scanner;

public class FixedPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        while ((num = input.nextInt())  != 2002){
            System.out.println("Senha Invalida");
        }
        System.out.println("Acesso Permitido");
    }
}
