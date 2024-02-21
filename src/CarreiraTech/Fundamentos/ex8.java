package CarreiraTech.Fundamentos;
//3 - Crie um método estático que receba um número inteiro como parâmetro
// e retorne verdadeiro se o número for um número primo, caso contrário, retorne falso.
public class ex8 {
    public static void main(String[] args) {
        if (isPrime(15)){
            System.out.println("é primo");
        }else{
            System.out.println("NÃO é primo");

        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
