import java.util.Scanner;

public class SalaryWithBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        double salary, bonus,salaryWithBonus, productsSold;

        name = input.nextLine();
        salary = input.nextDouble();
        productsSold = input.nextDouble();
        bonus = productsSold * 0.15;
        salaryWithBonus = salary+bonus;

        System.out.printf("TOTAL = R$ %.2f%n", salaryWithBonus);
    }
}
