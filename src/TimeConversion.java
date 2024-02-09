import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int allSeconds = input.nextInt();
        int hours = (allSeconds/60)/60;
        int minutes = (allSeconds/60)%60;
        int seconds = allSeconds % 60;

        System.out.printf("%d:%d:%d%n",hours, minutes, seconds);
    }
}
