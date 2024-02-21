package BeeCrowd;

import java.util.Scanner;

public class HighestAndPosition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int highestValue = -1;
        int valueI = -1;
        for (int i = 1; i <= 100; i++) {
            int num = input.nextInt();
            if (num > highestValue){
                highestValue = num;
                valueI = i;
            }
        }
        System.out.println(highestValue);
        System.out.println(valueI);
    }
}
