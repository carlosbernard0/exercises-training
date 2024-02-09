import java.util.Scanner;

public class AgeInDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ageDays = input.nextInt();
        int year = 365;
        int month = 30;
        int day = 1;

        int yearAge = ageDays/year;
        int monthAge = (ageDays % year)/month;
        int dayAge = ((ageDays % year)%month)/day;


        System.out.printf("%d ano(s)%n", yearAge);
        System.out.printf("%d mes(es)%n", monthAge);
        System.out.printf("%d dia(s)%n", dayAge);

    }
}
