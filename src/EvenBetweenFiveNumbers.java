import java.util.Scanner;

public class EvenBetweenFiveNumbers {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int numEven = 0;

        for (int i = 0; i < 5; i++) {
            int num = input.nextInt();
            if (num % 2== 0){
                numEven++;
            }
        }
        System.out.printf("%d valores pares%n",numEven);
    }
}
