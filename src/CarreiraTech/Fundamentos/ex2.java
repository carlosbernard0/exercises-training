package CarreiraTech.Fundamentos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//2 - Escreva um programa Java que peça ao usuário quantos números quer ter em uma lista de compras.
// Em seguida, peça à ele os itens da lista e ao final imprima todos os itens.
public class ex2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
         int numForList = input.nextInt();
         input.nextLine();

         ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < numForList; i++) {
            String itens = input.nextLine();
            list.add(itens);
        }
        System.out.println(list);
    }
}
