package CarreiraTech.Fundamentos;

import java.util.ArrayList;

//4 - Escreva um programa Java que declare e inicialize um array de inteiros com
// os valores 10, 20, 80, 40 e 50. Em seguida, use um loop 'for' para encontrar o maior valor no array e
// imprimir o resultado.
public class ex4 {
    public static void main(String[] args) {
        int[] list = {10,20,80,40,50};
        int greatest = 0;
        int valueI = -1;
        for (int i = 0; i < list.length; i++) {
            if (list[i]> greatest){
                greatest = list[i];
                valueI = i;
            }
        }
        System.out.println(greatest);
        System.out.println(valueI);
    }
}
