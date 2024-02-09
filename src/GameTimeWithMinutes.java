import java.util.Scanner;

public class GameTimeWithMinutes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int h1, h2, m1, m2, hm1, hm2, h24, value;

        h1 = input.nextInt();
        m1 = input.nextInt();
        h2 = input.nextInt();
        m2 = input.nextInt();

        hm1 = (h1 *60) + m1;
        hm2 = (h2 *60) + m2;
        h24 = 24 * 60;
        value = 0;

        if (hm2 > hm1){
            value = hm2 - hm1;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", (value/60), (value%60));
        } else if (hm1 > hm2) {
            value = (h24 - hm1) + hm2;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", (value/60), (value%60));
        }else {
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", 24,0);

        }
    }
}
