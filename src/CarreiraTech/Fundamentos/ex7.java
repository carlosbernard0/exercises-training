package CarreiraTech.Fundamentos;

import java.util.ArrayList;

//2 - Crie um método estático que receba um array de números inteiros
// como parâmetro e retorne a média aritmética dos valores no array.
public class ex7 {
    public static void main(String[] args) {

        int[] array = {6,7,8};
        average(array);
    }

    public static void average(int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum/ numbers.length);
    }
}
