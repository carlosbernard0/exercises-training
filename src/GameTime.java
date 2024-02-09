import java.util.Scanner;

public class GameTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, allHours;
        num1 = input.nextInt();
        num2 = input.nextInt();


        if (num1 == num2 ){
            allHours = 24;
            System.out.printf("O JOGO DUROU %d HORA(S)%n", allHours);

        } else if (num1 > num2) {
            allHours = (24 - num1) + num2;
            System.out.printf("O JOGO DUROU %d HORA(S)%n", allHours);

        } else if (num1 < num2) {
            allHours = num2 - num1;
            System.out.printf("O JOGO DUROU %d HORA(S)%n", allHours);
        }
    }
}
