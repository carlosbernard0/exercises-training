import java.util.Locale;
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int num,hoursWorked;
        double receivesPerHours, salary;
        num = input.nextInt();
        hoursWorked = input.nextInt();
        receivesPerHours = input.nextDouble();
        salary = receivesPerHours*hoursWorked;

        System.out.println("NUMBER = "+num);
        System.out.printf("SALARY = U$ %.2f%n", salary);

        input.close();
    }

}
