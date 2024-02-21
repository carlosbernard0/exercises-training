package CarreiraTech.Fundamentos;
//Crie um método estático que receba uma string como parâmetro e retorne verdadeiro se a
// string contiver apenas caracteres alfabéticos, caso contrário, retorne falso.
public class ex9 {
    public static void main(String[] args) {
        System.out.println(isMatches("Carlos"));
    }

    public static boolean isMatches(String str){
        return str.matches("[a-zA-Z]+");
    }
}
