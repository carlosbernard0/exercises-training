package CarreiraTech.Fundamentos;

import java.util.Scanner;

//Escreva um programa Java que declare um vetor de Strings e preencha-o com nomes de alimentos. Em seguida,
// use um loop 'whlie' para perguntar ao usuário quais alimentos ele deseja encontrar e,
// se encontrados, imprimir a posição e o nome do alimento no vetor.
public class ex3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String[] foodList = {"Rice", "Eggs", "Beans"};

        String foodRequired = "";
        boolean find = false;
        while (!find){
            System.out.println("Digite o alimento desejado");
            String food = input.nextLine();
            for (int i = 0; i < foodList.length; i++) {
                if (food.equalsIgnoreCase(foodList[i])){
                    int number = i;
                    System.out.println("O alimento foi encontrado: "+ foodList[i]+ ". na posição : " + number);
                    find = true;
                }
            }
            if (find == false){
                System.out.println("Desculpe mas o alimento nao foi encontrado");
            }
        }
    }
}
