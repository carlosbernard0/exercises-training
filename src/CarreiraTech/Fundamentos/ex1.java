package CarreiraTech.Fundamentos;


//1 - Escreva um programa Java que declare um vetor de Strings e preencha-o com nomes de países.
// Em seguida, use um loop for para imprimir os valores do vetor de paises
public class ex1 {
    public static void main(String[] args) {

        String[] contries = {"Brasil", "Russia", "Suécia"};

        for (int i = 0; i < contries.length; i++) {
            System.out.println(contries[i]);
        }


    }
}
