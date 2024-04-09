package BeeCrowd;

import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double age = input.nextInt();
        double sumAges = 0;
        double allPeoples = 0;
        do {
            sumAges += age;
            age = input.nextInt();
            allPeoples++;
        } while (age > 0);

        double average = sumAges/allPeoples;
        System.out.printf("%.2f%n",average);
    }
}
